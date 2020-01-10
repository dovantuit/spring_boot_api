//package com.example.postgresdemo.servlet;
//
////package com.concretepage.servlets;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(urlPatterns = "/country/*", loadOnStartup = 1)
//public class HelloCountryServlet extends HttpServlet   {
//	private static final long serialVersionUID = 1L;
//	@Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		resp.setContentType("text/html");
//		
//		PrintWriter printWriter = resp.getWriter();
//		
//		printWriter.println("<form action='/tom_servlet/' method='post'>");
//		printWriter.println("message: <input type='text' name='message'>");
//		printWriter.println("<input type='submit' value='submit'>");
//		printWriter.println("</form>");
////		resp.sendRedirect("https://tinhte.vn");
//	}
//	
//	@Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doGet(req, resp);
//	}
//}  