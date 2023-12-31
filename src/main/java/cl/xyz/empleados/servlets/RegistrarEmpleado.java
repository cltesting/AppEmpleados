package cl.xyz.empleados.servlets;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrarEmpleados
 */
@WebServlet("/RegistrarEmpleado")
public class RegistrarEmpleado extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombre = request.getParameter("nombre")+".......";
        String apellido =request.getParameter("apellido");
        String correo = request.getParameter("correo");

        request.setAttribute("nombre", nombre+".....");
        request.setAttribute("apellido", apellido.toUpperCase());
        request.setAttribute("correo", correo.toUpperCase());
        request.getRequestDispatcher("resumenEmpleado.jsp").forward(request, response);

    }

}