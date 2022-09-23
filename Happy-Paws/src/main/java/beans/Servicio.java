
package beans;

public class Servicio {
    private String tipoServicio;
    private String costo;
    private String descripcion;
    private String recomendaciones;

    public Servicio(String tipoServicio, String costo, String descripcion, String recomendaciones) {
        this.tipoServicio = tipoServicio;
        this.costo = costo;
        this.descripcion = descripcion;
        this.recomendaciones = recomendaciones;
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

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    @Override
    public String toString() {
        return "Servicio{" + "tipoServicio=" + tipoServicio + ", costo=" + costo + ", descripcion=" + descripcion + ", recomendaciones=" + recomendaciones + '}';
    }
    
    
    
}
