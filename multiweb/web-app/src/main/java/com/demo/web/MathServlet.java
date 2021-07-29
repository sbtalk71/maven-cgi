package com.demo.web;
import com.demo.Calculator;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MathServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		Calculator cal=new Calculator();
		res.getWriter().write("<h1>"+cal.concat(fname,lname)+"</h1>");
	}
	
}