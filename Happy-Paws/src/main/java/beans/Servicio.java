
package beans;

public class Servicio {
    private String tipoServicio;// Se importa como sql.Date

    public Servicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Servicio{" + "tipoServicio=" + tipoServicio + '}';
    }
    
    
}
