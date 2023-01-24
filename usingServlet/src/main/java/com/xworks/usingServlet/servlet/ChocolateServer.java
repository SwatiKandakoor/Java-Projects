package com.xworks.usingServlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 3,urlPatterns = "/choco")
public class ChocolateServer extends HttpServlet {

	public ChocolateServer() {
		System.out.println("created " + this.getClass().getSimpleName());
		;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created chocolate");
	}
}
