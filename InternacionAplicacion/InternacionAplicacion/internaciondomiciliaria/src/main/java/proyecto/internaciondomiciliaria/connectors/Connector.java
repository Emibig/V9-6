package proyecto.internaciondomiciliaria.connectors;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connector {
    // private static String driver="org.mariadb.jdbc.Driver";
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mariadb://localhost:3308/freedb_intdom";
    private static String user = "root";
    private static String pass = "";
    private static Connection conn;

    private Connector() {
    }

    /*
     * private static String driver="org.mariadb.jdbc.Driver";
     * private static String
     * url="jdbc:mariadb://sql.freedb.tech:3306/freedb_intdom";
     * private static String user="freedb_proyectointdom";
     * private static String pass="X3ceZaG&nc*4BwS";
     * private static Connection conn;
     * private Connector(){}
     */

    public static synchronized Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, user, pass);
            }
        } catch (Exception e) {
            System.out.println("***************************************");
            System.out.println(e);
            System.out.println("***************************************");
        }
        return conn;
    }

}
