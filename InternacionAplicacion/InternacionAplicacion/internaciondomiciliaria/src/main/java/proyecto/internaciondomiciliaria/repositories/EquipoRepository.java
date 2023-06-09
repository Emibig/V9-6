package proyecto.internaciondomiciliaria.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.el.stream.Stream;

import proyecto.internaciondomiciliaria.connectors.*;
import proyecto.internaciondomiciliaria.entities.Equipo;

public class EquipoRepository {

    private Connection conn = Connector.getConnection();

    public void save(Equipo equipo) {
        if (equipo == null)
            return;

        try (PreparedStatement ps = conn.prepareStatement(
                "insert into equipo (descripcion, codigo_interno, cantidad) values (?,?,?)",

                PreparedStatement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, equipo.getDescripcion());
            ps.setInt(2, equipo.getCodigo_interno());
            ps.setInt(3, equipo.getCantidad());

            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next())
                equipo.setId_equipo(rs.getInt(1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public List<Equipo> getAll() {
        List<Equipo> list = new ArrayList();
        try (ResultSet rs = conn.createStatement().executeQuery("select * from equipo")) {
            while (rs.next()) {
                list.add(new Equipo(
                        rs.getString("descripcion"), // descripcion
                        rs.getInt("codigo_interno"), // codigo interno del equipo
                        rs.getInt("cantidad") // cantidad

                ));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Equipo getById(int id_descripcion) {
        return getAll()
                .stream()
                .filter(c -> c.getId_equipo() == id_descripcion)
                .findFirst()
                .orElse(new Equipo());
    }

    public List<Equipo> getLikeDescripcion(String Descripcion) {
        if (Descripcion == null)
            return new ArrayList();
        return getAll()
                .stream()
                .filter(c -> c.getDescripcion().toLowerCase().contains(Descripcion.toLowerCase()))
                .toList();
    }
    
    public Equipo getByCodigoInterno(int codigo_interno) {
        return getAll()
                .stream()
                .filter(a -> a.getCodigo_interno() == codigo_interno)
                .findFirst()
                .orElse(new Equipo());
    }

    /*public Equipo getLikeCodigoInterno(int codigo_interno){
        return getAll()
            .stream()
            .filter(v-> v.getCodigo_interno().contains(codigo_interno))
            .findAny();
            .toList;*/
        
        }
    


