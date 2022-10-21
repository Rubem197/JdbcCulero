import java.sql.*;


public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://dns11036.phdns11.es?" +
                    "user=ad2223&password=nervion";
            Connection con = DriverManager.getConnection(url);
            System.out.println(con.toString());
            usarBD(con);
            //crearTabla(con);
            editarTabla(con);
            //insertarDatos(con);
            //mirarDatos(con, "SELECT * FROM rlindes order by edad ");
            //mirarDatos(con, "SELECT nombre, apellido FROM rlindes order by apellido ");
            //mirarDatos(con, "SELECT nombre, apellido FROM rlindes where edad >30 ");
            //mirarDatos(con, "SELECT nombre FROM rlindes where nombre like 'J%' order by apellido ");
            //mirarDatos(con, "SELECT nombre FROM rlindes where nombre like 'C%' and apellido like 'A%' order by edad desc ");
            //mirarDatos(con, "Select AVG(edad) AS edadMedia From rlindes ");
            //mirarDatos(con, "Select apellido From rlindes where apellido like '%oh%' or apellido like '%ma%' ");
            //mirarDatos(con, "SELECT * FROM rlindes where edad between 24 and 32 ");
            //mirarDatos(con, "SELECT * FROM rlindes where edad >65 ");
            //mirarDatos(con, "SELECT CONCAT() FROM rlindes ");


        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    public static void usarBD(Connection con) throws SQLException {

        Statement st = con.createStatement();
        String usar = "USE ad2223";
        st.execute(usar);
    }

    public static void crearTabla(Connection con) throws SQLException {

        Statement st = con.createStatement();

        String tabla = "CREATE OR ALTER TABLE rlindes " +
                "(id INTEGER AUTO_INCREMENT, " +
                "nombre VARCHAR(20), " +
                "apellido VARCHAR(20), " +
                "edad INTEGER, " +
                "PRIMARY KEY (id))";
        st.execute(tabla);


    }
    public static void editarTabla(Connection con) throws SQLException {

        Statement st = con.createStatement();

        String tabla = " ALTER TABLE rlindes add laboral varchar(20) after edad ";
        st.execute(tabla);


    }

    public static void insertarDatos(Connection con) throws SQLException {

        Statement st = con.createStatement();

        String insertar = "insert into rlindes (id, nombre, apellido, edad) values (6, 'Skye', 'Kytter', 67)," +
                        "  (7, 'Darryl', 'Ormes', 93), " +
                        "  (8, 'Janel', 'Rowes', 64), " +
                        "  (9, 'Eldin', 'Mixer', 41), " +
                        "  (10, 'Gav', 'MacMeekan', 19)," +
                        "  (11, 'Camile', 'Imlock', 21)," +
                        "  (12, 'Frederic', 'Kalaher', 74)," +
                        "  (13, 'Glyn', 'Poltun', 57)," +
                        "  (14, 'Price', 'Dun', 94)," +
                        "  (15, 'Mirabel', 'Emmanuele', 47)," +
                        "  (16, 'Dorie', 'Ellison', 97)," +
                        "  (17, 'Fleur', 'Manneville', 52)," +
                        "  (18, 'Corbie', 'Elcock', 48)," +
                        "  (19, 'Verine', 'Ilyas', 29)," +
                        "  (20, 'Catlin', 'McKea', 53)," +
                        "  (21, 'Clive', 'Haycox', 100)," +
                        "  (22, 'Bink', 'Giovannacci', 63)," +
                        "  (23, 'Winnah', 'Vallens', 75)," +
                        "  (24, 'Gothart', 'Malia', 31)," +
                        "  (25, 'Vernon', 'Landre', 79)," +
                        "  (26, 'Tierney', 'Gally', 24)," +
                        "  (27, 'Imogene', 'Patton', 48)," +
                        "  (28, 'Eduino', 'Jersh', 63)," +
                        "  (29, 'Hillyer', 'Willoway', 23)," +
                        "  (30, 'Aeriela', 'Cole', 100)," +
                        "  (31, 'Charline', 'Allard', 49)," +
                        "  (32, 'Emlynne', 'Fried', 33)," +
                        "  (33, 'Drusi', 'Durnford', 56)," +
                        "  (34, 'Fenelia', 'Troubridge', 83)," +
                        "  (35, 'Agnesse', 'Grcic', 55)," +
                        "  (36, 'Frederica', 'Worvill', 78)," +
                        "  (37, 'George', 'Pennycock', 28)," +
                        "  (38, 'Shara', 'Kibel', 51)," +
                        "  (39, 'Cati', 'Thurborn', 60)," +
                        "  (40, 'Ulises', 'Olech', 39)," +
                        "  (41, 'Morgen', 'Zeal', 65)," +
                        "  (42, 'Marv', 'McCluskey', 94)," +
                        "  (43, 'Ruy', 'Walkley', 100)," +
                        "  (44, 'Imogen', 'Heineking', 20)," +
                        "  (45, 'Martino', 'McCome', 93)," +
                        "  (46, 'Olav', 'Kohrs', 92)," +
                        "  (47, 'Karmen', 'Thackston', 20)," +
                        "  (48, 'Richie', 'Fowls', 40)," +
                        "  (49, 'Lucas', 'Bithell', 42)," +
                        "  (50, 'Salem', 'Garbott', 25)," +
                        "  (51, 'Parry', 'Give', 60)," +
                        "  (52, 'Rozalin', 'Camoletto', 88)," +
                        "  (53, 'Bernadine', 'Kildahl', 57)," +
                        "  (54, 'Rudie', 'Dorrance', 62)," +
                        "  (55, 'Arluene', 'Allewell', 94)," +
                        "  (56, 'Danita', 'Winch', 31)," +
                        "  (57, 'Padriac', 'Luker', 72)," +
                        "  (58, 'Anatole', 'Corrett', 34)," +
                        "  (59, 'Rob', 'Marwood', 100)," +
                        "  (60, 'Curt', 'Gebb', 28)," +
                        "  (61, 'Marys', 'Bestwerthick', 24)," +
                        "  (62, 'Marlin', 'Bown', 85)," +
                        "  (63, 'Greta', 'Burrows', 61)," +
                        "  (64, 'Matthaeus', 'Garatty', 85)," +
                        "  (65, 'Toma', 'Warrick', 57)," +
                        "  (66, 'Petunia', 'Swannick', 93)," +
                        "  (67, 'Lezley', 'Grassett', 88)," +
                        "  (68, 'Otha', 'Hatry', 61)," +
                        "  (69, 'Junie', 'Stobbe', 94)," +
                        "  (70, 'Gabbey', 'Olford', 100)," +
                        "  (71, 'Dallas', 'Overshott', 39)," +
                        "  (72, 'Raynor', 'Bradley', 76)," +
                        "  (73, 'Fallon', 'Petroselli', 95)," +
                        "  (74, 'Audre', 'Ubsdell', 73)," +
                        "  (75, 'Shandy', 'Maxstead', 88)," +
                        "  (76, 'Flemming', 'Edess', 18)," +
                        "  (77, 'Babs', 'Labbett', 34)," +
                        "  (78, 'Rubi', 'Haberjam', 25)," +
                        "  (79, 'Michale', 'Sailes', 59)," +
                        "  (80, 'Karel', 'Dinnington', 63)," +
                        "  (81, 'Fredra', 'Aimable', 97)," +
                        "  (82, 'Cordula', 'Jacobssen', 40)," +
                        "  (83, 'Malina', 'McCombe', 71)," +
                        "  (84, 'Suzi', 'Rook', 94)," +
                        "  (85, 'Corry', 'Beels', 65)," +
                        "  (86, 'Enrique', 'Rushbrook', 84)," +
                        "  (87, 'Claudelle', 'Oliphant', 48)," +
                        "  (88, 'Mechelle', 'Robertshaw', 74)," +
                        "  (89, 'Doralia', 'Shetliff', 64)," +
                        "  (90, 'Jeromy', 'Tomisch', 61)," +
                        "  (91, 'Lacy', 'Oven', 97)," +
                        "  (92, 'Vite', 'Vigus', 60)," +
                        "  (93, 'Ladonna', 'Crawley', 85)," +
                        "  (94, 'Logan', 'Blowing', 95)," +
                        "  (95, 'Lammond', 'Lawie', 96)," +
                        "  (96, 'Adler', 'Tapsfield', 25)," +
                        "  (97, 'Beverly', 'Rockhill', 35)," +
                        "  (98, 'Claiborne', 'MacCrackan', 78)," +
                        "  (99, 'Raul', 'Pedrazzi', 26)," +
                        "  (100, 'Francklin', 'Beloe', 58)," +
                        "  (101, 'Maggie', 'Brunelleschi', 95)," +
                        "  (102, 'Brucie', 'Maberley', 48)," +
                        "  (103, 'Danica', 'Gourley', 30)," +
                        "  (104, 'Odo', 'Harfleet', 27)," +
                        "  (105, 'Fergus', 'Dikles', 55)," +
                        "  (106, 'Jerry', 'Griffen', 20)," +
                        "  (107, 'Georg', 'Brechin', 19)," +
                        "  (108, 'Tova', 'Boyse', 86)," +
                        "  (109, 'Fionna', 'Valencia', 29)," +
                        "  (110, 'Oralla', 'Gregorace', 74)," +
                        "  (111, 'Waldon', 'Cozby', 77)," +
                        "  (112, 'Dulcine', 'Laverick', 45)," +
                        "  (113, 'Christie', 'Hearnes', 19)," +
                        "  (114, 'Ruprecht', 'Leavey', 23)," +
                        "  (115, 'Fianna', 'MacCathay', 39)," +
                        "  (116, 'Mina', 'Jurgenson', 78)," +
                        "  (117, 'Baldwin', 'Hordle', 78)," +
                        "  (118, 'Julianne', 'Wyld', 27)," +
                        "  (119, 'May', 'Leadstone', 67)," +
                        "  (120, 'Sela', 'Drinnan', 57)," +
                        "  (121, 'Elisabeth', 'Cantillon', 67)," +
                        "  (122, 'Ceciley', 'Uwins', 60)," +
                        "  (123, 'Bonny', 'Lower', 54)," +
                        "  (124, 'Wye', 'Quarrie', 50)," +
                        "  (125, 'Kial', 'Pawelke', 46)," +
                        "  (126, 'Meris', 'Robke', 67)," +
                        "  (127, 'Gabriel', 'Tarburn', 53)," +
                        "  (128, 'Patty', 'Stroud', 29)," +
                        "  (129, 'Keelia', 'Tuddenham', 78)," +
                        "  (130, 'Bea', 'Hucker', 78)," +
                        "  (131, 'Eugene', 'Georges', 79)," +
                        "  (132, 'Haley', 'Burge', 22)," +
                        "  (133, 'Torrance', 'Hawkridge', 33)," +
                        "  (134, 'Roddy', 'Ruffles', 83)," +
                        "  (135, 'Jeffry', 'Scurr', 48)," +
                        "  (136, 'Mireille', 'Verman', 27)," +
                        "  (137, 'Drucill', 'Rennock', 42)," +
                        "  (138, 'Allin', 'Pacey', 28)," +
                        "  (139, 'Katheryn', 'Seagood', 63)," +
                        "  (140, 'Yolane', 'Thom', 18)," +
                        "  (141, 'Boony', 'Lafay', 62)," +
                        "  (142, 'Carleton', 'Wickerson', 43)," +
                        "  (143, 'David', 'Rangell', 63)," +
                        "  (144, 'Archibold', 'Sammut', 63)," +
                        "  (145, 'Nikolia', 'Kettel', 27)," +
                        "  (146, 'Rogers', 'Dieton', 27)," +
                        "  (147, 'Harley', 'Sheed', 98)," +
                        "  (148, 'Alexei', 'Creech', 78)," +
                        "  (149, 'Naoma', 'Raimbauld', 47)," +
                        "  (150, 'Kennan', 'Bywaters', 58)," +
                        "  (151, 'Felicle', 'Pimme', 96)," +
                        "  (152, 'Menard', 'Pairpoint', 38)," +
                        "  (153, 'Hermy', 'Tole', 44)," +
                        "  (154, 'Lance', 'Holley', 55)," +
                        "  (155, 'Marwin', 'Hudspith', 92)," +
                        "  (156, 'Iolande', 'Waudby', 90)," +
                        "  (157, 'Ford', 'Yakubovich', 21)," +
                        "  (158, 'Basia', 'Beggio', 82)," +
                        "  (159, 'Francois', 'Bonhan', 34)," +
                        "  (160, 'Burg', 'Glennon', 65)," +
                        "  (161, 'Steffi', 'Finneran', 18)," +
                        "  (162, 'Frederic', 'Lavens', 97)," +
                        "  (163, 'Helyn', 'Fairlam', 63)," +
                        "  (164, 'Prescott', 'Lampe', 48)," +
                        "  (165, 'Todd', 'Dyke', 30)," +
                        "  (166, 'Gene', 'Jammes', 87)," +
                        "  (167, 'Artemus', 'Higford', 75)," +
                        "  (168, 'Blondy', 'MacGarvey', 70)," +
                        "  (169, 'Codie', 'Pettigree', 64)," +
                        "  (170, 'Shayne', 'Buckham', 93)," +
                        "  (171, 'Joanie', 'Jermin', 92)," +
                        "  (172, 'Seana', 'Stranahan', 49)," +
                        "  (173, 'Ursala', 'Crowe', 74)," +
                        "  (174, 'Tally', 'Markel', 84)," +
                        "  (175, 'Paulo', 'Garrique', 37)," +
                        "  (176, 'Otto', 'Breakspear', 44)," +
                        "  (177, 'Gareth', 'Haszard', 97)," +
                        "  (178, 'Anthia', 'Follen', 64)," +
                        "  (179, 'Brittani', 'Fisbey', 49)," +
                        "  (180, 'Theo', 'Tinker', 82)," +
                        "  (181, 'Perle', 'Gallahue', 20)," +
                        "  (182, 'Ardeen', 'Zavattero', 63)," +
                        "  (183, 'Launce', 'Antuoni', 55)," +
                        "  (184, 'Bev', 'Hazeldene', 62)," +
                        "  (185, 'Kiri', 'Blazewicz', 26)," +
                        "  (186, 'Lois', 'Hawkings', 94)," +
                        "  (187, 'Elliott', 'Sant', 91)," +
                        "  (188, 'Putnam', 'Woolgar', 64)," +
                        "  (189, 'Enoch', 'Robart', 76)," +
                        "  (190, 'Sindee', 'Truman', 51)," +
                        "  (191, 'Vikki', 'Beamiss', 55)," +
                        "  (192, 'Sarine', 'Wooff', 87)," +
                        "  (193, 'Gardner', 'Fallowfield', 94)," +
                        "  (194, 'Elisha', 'Nicholes', 51)," +
                        "  (195, 'Kaine', 'Bohlsen', 100)," +
                        "  (196, 'Pattie', 'Risman', 28)," +
                        "  (197, 'Dickie', 'Mabson', 46)," +
                        "  (198, 'Gregorius', 'Dorey', 37)," +
                        "  (199, 'Annamaria', 'Mearing', 78)," +
                        "  (200, 'Seka', 'Bulbrook', 61)";


            st.execute(insertar);

    }

    public static boolean hasColumn(ResultSet rs, String columnName) throws SQLException {
        ResultSetMetaData rsmd = rs.getMetaData();
        int columns = rsmd.getColumnCount();
        for (int x = 1; x <= columns; x++) {
            if (columnName.equals(rsmd.getColumnName(x))) {
                return true;
            }
        }
        return false;
    }
    public static void mirarDatos(Connection con, String llamada) throws SQLException {

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(llamada);

        while (rs.next()) {
            if (hasColumn(rs, "id")) {
                System.out.print("ID: " + rs.getInt("id"));
            }
            if (hasColumn(rs, "nombre")) {
                System.out.print(", Nombre: " + rs.getString("nombre"));
            }
            if (hasColumn(rs, "apellido")) {
                System.out.print(", Apellido: " + rs.getString("apellido"));
            }
            if (hasColumn(rs, "edad")) {
                System.out.println(", edad: " + rs.getInt("edad"));
            }
            System.out.println();
        }
    }


}