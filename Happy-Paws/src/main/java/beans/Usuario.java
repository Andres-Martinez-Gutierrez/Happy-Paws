        
package beans;
 import java.sql.Date;

public class Usuario {
    
    private String userName;
    private String cedula;
    private String nombreUsuario;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String pin;
    private String nombreMascota;
    private String especie;
    private Date fecha;            // Se importa como sql.Date
    private String color;
    private String sexo;
    private String raza;

    public Usuario(String userName, String cedula, String nombreUsuario, String apellido, String direccion, String telefono, String correo, String pin, String nombreMascota, String especie, Date fecha, String color, String sexo, String raza) {
        this.userName = userName;
        this.cedula = cedula;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.pin = pin;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.fecha = fecha;
        this.color = color;
        this.sexo = sexo;
        this.raza = raza;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
        return "Usuario{" + "userName=" + userName + ", cedula=" + cedula + ", nombreUsuario=" + nombreUsuario + ", apellido=" + apellido + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + ", pin=" + pin + ", nombreMascota=" + nombreMascota + ", especie=" + especie + ", fecha=" + fecha + ", color=" + color + ", sexo=" + sexo + ", raza=" + raza + '}';
    }

   
   
    
}
