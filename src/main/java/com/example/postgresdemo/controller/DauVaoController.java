package com.example.postgresdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//package com.concretepage.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DauVaoController extends HttpServlet {     
	
    @RequestMapping("/dauvao")
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<form action='/daura/' method='post'>");
		printWriter.println("message: <input type='text' name='message'>");
		printWriter.println("<input type='submit' value='submit'>");
		printWriter.println("</form>");
//		resp.sendRedirect("https://tinhte.vn");
	}
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
} 
