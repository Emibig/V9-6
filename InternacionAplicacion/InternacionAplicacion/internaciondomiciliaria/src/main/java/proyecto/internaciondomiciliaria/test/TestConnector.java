package proyecto.internaciondomiciliaria.test;

import java.sql.Connection;

import java.sql.ResultSet;
import java.time.LocalTime;

import proyecto.internaciondomiciliaria.connectors.*;

public class TestConnector {
    public static void main(String[] args) {
        try (Connection conn = Connector.getConnection()) {
            System.out.println(LocalTime.now());
            ResultSet rs = conn.createStatement().executeQuery("select version()");
            if (rs.next())
                System.out.println(rs.getString(1));
            else
                System.out.println("No se pudo conectar a la Base!");
            System.out.println(LocalTime.now());
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("No se pudo conectar a la Base!");
        }
        System.out.println(LocalTime.now() + " base conectada");
    }
}
