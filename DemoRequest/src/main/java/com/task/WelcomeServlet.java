package com.task;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	
    public void doGet(HttpServletRequest request,HttpServletResponse responce) throws IOException, ServletException{
	      responce.setContentType("text/html");
	      PrintWriter pw=responce.getWriter();
	      String uname=request.getParameter("username");
	      String pwd=request.getParameter("password");
			if(uname.equals("admin")&& pwd.equals("admin"))
			{
				pw.println("Login is Success");
				RequestDispatcher rd=request.getRequestDispatcher("/servlet1");
				rd.forward(request, responce);
			}
			else
			{
				pw.println("Login is failed & Please check your credentials");
				RequestDispatcher rd=request.getRequestDispatcher("home.html");
				rd.include(request, responce);
			}
		}

	
	      
    }

