
package beans;

import java.sql.Date;

public class Agenda {
    private Date fechaHoraServicio;// Se importa como sql.Date
    private int id;
    private String tipoServicio;

    public Agenda(Date fechaHoraServicio, int id, String tipoServicio) {
        this.fechaHoraServicio = fechaHoraServicio;
        this.id = id;
        this.tipoServicio = tipoServicio;
    }

    public Date getFechaHoraServicio() {
        return fechaHoraServicio;
    }

    public void setFechaHoraServicio(Date fechaHoraServicio) {
        this.fechaHoraServicio = fechaHoraServicio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Agenda{" + "fechaHoraServicio=" + fechaHoraServicio + ", id=" + id + ", tipoServicio=" + tipoServicio + '}';
    }
    
    
}
