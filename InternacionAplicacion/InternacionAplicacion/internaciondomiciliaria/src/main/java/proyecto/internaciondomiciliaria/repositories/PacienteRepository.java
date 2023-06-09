package proyecto.internaciondomiciliaria.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import proyecto.internaciondomiciliaria.connectors.*;
import proyecto.internaciondomiciliaria.entities.Paciente;

public class PacienteRepository {

    private Connection conn = Connector.getConnection();

    public void save(Paciente paciente) {
        if (paciente == null)
            return;
        try (PreparedStatement ps = conn.prepareStatement(
                "insert into pacientes (nombre, nro_socio, cliente, celular, calle_altura, piso_departamento, entrecalles, localidad,zona) values (?,?,?,?,?,?,?,?,?)",

                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, paciente.getNombre());
            ps.setInt(2, paciente.getNro_socio());
            ps.setString(3, paciente.getCliente());
            ps.setInt(4, paciente.getCelular());
            ps.setString(5, paciente.getCalle_altura());
            ps.setString(6, paciente.getPiso_departamento());
            ps.setString(7, paciente.getEntrecalles());
            ps.setString(8, paciente.getLocalidad());
            ps.setString(9, paciente.getZona());

            ps.execute();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                paciente.setId_paciente(rs.getInt(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void remove(Paciente paciente) {
    };

    public void update(Paciente paciente) {
    };

    public List<Paciente> getAll() {
        List<Paciente> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from pacientes")) {
            while (rs.next()) {
                list.add(new Paciente(
                        rs.getInt("id_paciente"),
                        rs.getString("nombre"),
                        rs.getInt("nro_socio"),
                        rs.getString("cliente"),
                        rs.getInt("celular"),
                        rs.getString("calle_altura"),
                        rs.getString("piso_departamento"),
                        rs.getString("entrecalles"),
                        rs.getString("localidad"),
                        rs.getString("zona")));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Paciente getById(int id_paciente) {
        return getAll()
                .stream()
                .filter(a -> a.getId_paciente() == id_paciente)
                .findFirst()
                .orElse(new Paciente());
    }

    public List<Paciente> getLikeNombre(String nombre) {
        if (nombre == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(a -> a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .toList();
    }
}
