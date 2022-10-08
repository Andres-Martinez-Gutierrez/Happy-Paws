package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;

import beans.Usuario;
import connection.DBConnection;

public class UsuarioController implements IUsuarioController {

    @Override
    public String login(String userName, String pin) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();

        String sql = "Select * from usuario where user_name = '" + userName
                + "' and pin = '" + pin + "'";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String cedula = rs.getString("cedula");
                String nombreUsuario = rs.getString("nombre_usuario");
                String apellido = rs.getString("apellido");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String nombreMascota = rs.getString("nombre_mascota");
                String especie = rs.getString("especie");
                String color = rs.getString("color");
                String sexo = rs.getString("sexo");
                String raza = rs.getString("raza");

                Usuario usuario
                        = new Usuario(userName, cedula, nombreUsuario, apellido, direccion, telefono, email, pin, nombreMascota, especie, color, sexo, raza);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

    @Override
    public String register(String user_name, String cedula,
            String nombre_usuario, String apellido, String direccion, String telefono, String email,
            String pin, String nombre_mascota,
            String especie, String color, String sexo, String raza) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into usuario values('" + user_name + "', '" + cedula + "', '" + nombre_usuario + "', '" + apellido + "', '" + direccion + "', '" + telefono + "', '" + email + "', '" + pin + "', '" + nombre_mascota + "', '" + especie + "', '" + color + "', '" + sexo + "', '" + raza + "')";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Usuario usuario = new Usuario(user_name, cedula, nombre_usuario, apellido, direccion, telefono, email, pin, nombre_mascota, especie, color, sexo, raza);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";
    }

}
