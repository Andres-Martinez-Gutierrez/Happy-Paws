package test;

import beans.Mascota;
import connection.DBConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        actualizarMascota(1, "Gato");
        listarMascota();

    }

    public static void actualizarMascota(int id, String especie) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE mascota SET genero = '" + especie + "' WHERE id = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void listarMascota() {

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM mascota";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int i = rs.getInt("id");
                String userName = rs.getString("userName");
                String nombre= rs.getString("nombre");
                String especie= rs.getString("especie");
                String color= rs.getString("color");
                Date fecha= rs.getDate("fecha");
                String sexo= rs.getString("sexo");
                String raza= rs.getString("raza");

                Mascota mascotas = new Mascota(i, userName, nombre,especie,color, fecha, sexo, raza);

                System.out.println(mascotas.toString());

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }
}
