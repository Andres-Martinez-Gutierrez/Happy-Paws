package controller;

import java.sql.Date;

public interface IUsuarioController {

    public String login(String userName, String pin);

    public String registrar(String username, String cedula,
            String nombreUsuario, String apellido, String direccion, String telefono, String correo,
            String pin, String nombreMascota,
            String especie, Date fecha, String color, String sexo, String raza);

}
