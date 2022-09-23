package controller;

import java.sql.ResultSet;
import java.sql.Statement;
import com.google.gson.Gson;
import java.sql.Date;

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
                String correo = rs.getString("email");
                String nombreMascota = rs.getString("nombre_mascota");
                String especie = rs.getString("especie");
                Date fecha = rs.getDate("fecha_nacimiento");
                String color = rs.getString("color");
                String sexo = rs.getString("sexo");
                String raza = rs.getString("raza");

                Usuario usuario
                        = new Usuario(userName, cedula, nombreUsuario, apellido, direccion, telefono, correo, pin, nombreMascota, especie, fecha, color, sexo, raza);
                return gson.toJson(usuario);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return "false";
    }

}
