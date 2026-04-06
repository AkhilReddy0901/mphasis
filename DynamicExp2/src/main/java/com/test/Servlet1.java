package com.test;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fname");
		String company = request.getParameter("cmp");
		String lc = request.getParameter("loc");
		String data = name+" "+company+" "+lc;
		ServletContext ctx = getServletContext();
		String ct = ctx.getInitParameter("city");
		String st = ctx.getInitParameter("state");
		String data1 = ct+" "+st;
		ctx.setAttribute("info",data1);
		ServletConfig cfg = getServletConfig();
		out.println("form servlet-1 : "+data1);
		out.println("<a href = 'Servlet2'> next page </a>");
		
		
	}

}
