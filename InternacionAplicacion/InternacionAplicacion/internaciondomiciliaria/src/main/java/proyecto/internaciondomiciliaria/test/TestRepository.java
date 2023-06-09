package proyecto.internaciondomiciliaria.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalTime;

import proyecto.internaciondomiciliaria.connectors.Connector;
import proyecto.internaciondomiciliaria.entities.Paciente;
import proyecto.internaciondomiciliaria.entities.Equipo;
import proyecto.internaciondomiciliaria.repositories.EquipoRepository;
import proyecto.internaciondomiciliaria.repositories.PacienteRepository;

public class TestRepository {

    public static void main(String[] args) {
        // PacienteRepository cr = new PacienteRepository(Connector.getConnection());
        PacienteRepository cr = new PacienteRepository();
        Paciente paciente = new Paciente("Emilia Grande", 252525252, "Con Copago", 1122221111, "Bucarelli 3000",
                "local", "triunvi y monroe ", "CABA", "uno");

        cr.save(paciente);
        System.out.println(paciente);

        System.out.println("*******************************************");

        cr.getAll().forEach(System.out::println);

    }

}
