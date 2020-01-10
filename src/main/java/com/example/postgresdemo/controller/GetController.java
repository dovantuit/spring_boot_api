package com.example.postgresdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
//package com.concretepage.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.User;
import com.example.postgresdemo.repository.UserRepository;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.io.IOException;
//import org.apache.commons.io.IOUtils;
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;

@RestController
public class GetController extends HttpServlet {  
	// tao user
	@Autowired
    private UserRepository userRepository;
	//
	 public User createUser(@Valid @RequestBody User user) {
	        return userRepository.save(user);
	    }
	
    @RequestMapping("/get")
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		
		printWriter.println("<form action='/daura/' method='post'>");
		printWriter.println("user's name: <input type='text' name='name'></br>");
		printWriter.println("password: <input type='text' name='password'></br>");	
		printWriter.println("email: <input type='text' name='email'></br>");
		printWriter.println("<input type='submit' value='submit'>");
		printWriter.println("</form>");
//		resp.sendRedirect("https://tinhte.vn");
	}
    
   
	
	@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
		// tao user
		User user = new User();
		user.setBirthday("1111");
		user.setEmail("hacker");
		user.setFull_name("hhhhhhhh");
		createUser(user);
		
		
		
		//
			
	}
} 
