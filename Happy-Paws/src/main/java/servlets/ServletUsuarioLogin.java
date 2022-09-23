package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.UsuarioController;


@WebServlet("/ServletUsuarioLogin")
public class ServletUsuarioLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletUsuarioLogin() {
        super();
        
    }


        @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		UsuarioController usuario = new UsuarioController();
		String userName = request.getParameter("user_name");
		String pin = request.getParameter("pin");
		String result = usuario.login(userName, pin);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(result);
		out.flush();
		out.close();
	}


        @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
