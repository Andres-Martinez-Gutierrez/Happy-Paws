
package beans;

public class Servicio {
    private String tipoServicio;
    private String costo;
    private String descripcion;
    private String recomendacion;

    public Servicio(String tipoServicio, String costo, String descripcion, String recomendacion) {
        this.tipoServicio = tipoServicio;
        this.costo = costo;
        this.descripcion = descripcion;
        this.recomendacion = recomendacion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "tipoServicio=" + tipoServicio + ", costo=" + costo + ", descripcion=" + descripcion + ", recomendacion=" + recomendacion + '}';
    }
    
    
    
}
