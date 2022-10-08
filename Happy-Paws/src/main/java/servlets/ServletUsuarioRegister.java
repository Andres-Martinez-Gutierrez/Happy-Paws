package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UsuarioController;

/**
 * Servlet implementation class ServletUsuarioRegister
 */
@WebServlet("/ServletUsuarioRegister")
public class ServletUsuarioRegister extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsuarioRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UsuarioController usuario = new UsuarioController();

        String username = request.getParameter("user_name");
        String cedula = request.getParameter("cedula");
        String nombreUsuario = request.getParameter("nombre_usuario");
        String apellido = request.getParameter("apellido");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String email = request.getParameter("email");
        String pin = request.getParameter("pin");
        String nombreMascota = request.getParameter("nombre_mascota");
        String especie = request.getParameter("especie");
        String color = request.getParameter("color");
        String sexo = request.getParameter("sexo");
        String raza = request.getParameter("raza");

        String result = usuario.register(username, cedula, nombreUsuario, apellido, direccion, telefono, email, pin, nombreMascota, especie, color, sexo, raza);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(result);
        out.flush();
        out.close();
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
