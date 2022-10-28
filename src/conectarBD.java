import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;

public class conectarBD {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://dns11036.phdns11.es:3306/ad2223_rlindes?" +
                    "user=rlindes&password=0166";
            Connection con = DriverManager.getConnection(url);
            System.out.println(con.toString());
            conectar(con);

            borrarTabla(con, "DROP TABLE IF EXISTS Post");
            borrarTabla(con, "DROP TABLE IF EXISTS Likes");
            borrarTabla(con, "DROP TABLE IF EXISTS Usuarios");

            crearTabla(con, "CREATE TABLE IF NOT EXISTS Usuarios " + "(idUsuarios INTEGER, " + "Nombre VARCHAR(45), " +
                    "Apellido VARCHAR(45), " + "Username VARCHAR(40), " + "Password VARCHAR(45), " + "Email VARCHAR(50), " +
                    "PRIMARY KEY (idUsuarios))");

            crearTabla(con, "CREATE TABLE IF NOT EXISTS Likes " + "(idLikes INTEGER, " + "idUsuarios INTEGER, " + "idPost INTEGER, "
                    + "PRIMARY KEY (idLikes), "+ "FOREIGN KEY (idUsuarios) REFERENCES Usuarios(idUsuarios))");

            crearTabla(con, "CREATE TABLE IF NOT EXISTS Post " + "(idPost INTEGER, " + "idUsuarios INTEGER, " + "created_at DATE, "
                            + "updated_at DATE, "
                            + "PRIMARY KEY (idPost), "+ "FOREIGN KEY (idUsuarios) REFERENCES Usuarios(idUsuarios))");


            insertarDatos(con, "Usuarios.txt");
            insertarDatos(con, "Likes.txt");
            insertarDatos(con, "Post.txt");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void conectar(Connection con) throws SQLException {

        Statement st = con.createStatement();
        String usar = "USE ad2223_rlindes";
        st.execute(usar);
    }

    public static void crearTabla(Connection con, String tabla) throws SQLException {

        Statement st = con.createStatement();


        st.execute(tabla);


    }

    public static void insertarDatos(Connection con, String fichero) throws SQLException, FileNotFoundException {
        Statement st = con.createStatement();
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        Scanner sc = new Scanner(br);
        String linea;
        while (sc.hasNext()){
            linea=sc.nextLine();
            st.execute(linea);
        }
    }

    public static void borrarTabla(Connection con, String tabla) throws SQLException {

        Statement st = con.createStatement();


        st.execute(tabla);
    }

}
