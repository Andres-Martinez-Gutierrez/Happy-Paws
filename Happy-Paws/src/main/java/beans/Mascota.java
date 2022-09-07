
package beans;

import java.sql.Date;

public class Mascota {
    private int id;
    private String userName;
    private String nombre;
    private String especie;
    private String color;
    private Date fecha;// Se importa como sql.Date
    private String sexo;
    private String raza;

    public Mascota(int id, String userName, String nombre, String especie, String color, Date fecha, String sexo, String raza) {
        this.id = id;
        this.userName = userName;
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.fecha = fecha;
        this.sexo = sexo;
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", userName=" + userName + ", nombre=" + nombre + ", especie=" + especie + ", color=" + color + ", fecha=" + fecha + ", sexo=" + sexo + ", raza=" + raza + '}';
    }
    
    
    
}
