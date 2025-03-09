package com.test;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
@WebServlet("/Addservlet")
public class Addservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i=Integer.parseInt(request.getParameter("n1"));
		int j=Integer.parseInt(request.getParameter("n2"));
		int k=i+j;
		request.setAttribute("kem", k);
		RequestDispatcher rd=request.getRequestDispatcher("sq");
		rd.forward(request,response);
	}

}
