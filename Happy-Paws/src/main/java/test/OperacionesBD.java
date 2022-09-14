package test;

import beans.Servicio;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
        actualizarServicio(" ", " ");
        listarServicio();

    }

    public static void actualizarServicio(String tipoServicio, String costo) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE servicio SET tipo_servicio = '" + costo + "' WHERE id = " + tipoServicio;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }

    public static void listarServicio() {

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM servicio";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String tipoServico= rs.getString("tipo_servicio");
                String costo= rs.getString("costo");
                String descripcion= rs.getString("descripcion");
                String recomendacion= rs.getString("recomendacion");
              
                Servicio servicios = new Servicio(tipoServico, costo, descripcion, recomendacion);

                System.out.println(servicios.toString());

            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }
    }
}
