
package beans;

import java.sql.Date;

public class Agenda {
    private Date fechaHoraServicio;// Se importa como sql.Date
    private String user_name;
    private String tipoServicio;

    public Agenda(Date fechaHoraServicio, String user_name, String tipoServicio) {
        this.fechaHoraServicio = fechaHoraServicio;
        this.user_name = user_name;
        this.tipoServicio = tipoServicio;
    }

    public Date getFechaHoraServicio() {
        return fechaHoraServicio;
    }

    public void setFechaHoraServicio(Date fechaHoraServicio) {
        this.fechaHoraServicio = fechaHoraServicio;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Agenda{" + "fechaHoraServicio=" + fechaHoraServicio + ", user_name=" + user_name + ", tipoServicio=" + tipoServicio + '}';
    }

    
    
}
