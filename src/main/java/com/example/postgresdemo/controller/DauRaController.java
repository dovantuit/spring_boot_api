package com.example.postgresdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.kafka.clients.producer.KafkaProducer;
//import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
//package com.concretepage.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//
import com.example.postgresdemo.repository.UserRepository;
import com.example.postgresdemo.model.User;
@RestController
public class DauRaController extends HttpServlet {   
//	@Autowired
//    private UserRepository userRepository;
	
	
    @RequestMapping("/daura")
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter printWriter = resp.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		printWriter.println("created user:");
		printWriter.println("</br>user name: " + name);
		printWriter.println("</br>email: "+ email);
		printWriter.println("</br>password: " + password);
		
		//
//		User user = new User();
//		user.setBirthday("1111");
//		user.setEmail("hacker");
//		user.setFull_name("hhhhhhhh");
//		userRepository.save(user);
		
		
		//
		// kafka 
		
//          String topicName = "demo-topic1";
//          String key = "Key";
//          System.out.println("key okie");
//          String value = req.getParameter("message");

//        Properties props = new Properties();
//  		props.put("bootstrap.servers", "10.0.2.15:9092");
//  		System.out.println("bootstrap server okie");
//  		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//  		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
//  		KafkaProducer<String, String> tom_Producer = new KafkaProducer<String, String>(props);
//  		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topicName, key, email);
//
//  		try {
//  			System.out.println("sendding");
//  			tom_Producer.send(record);
//  		} catch (Exception e) {
//  			System.out.print(e);
//  		} finally {
//  			System.out.println("now end close");
//  			tom_Producer.close();
//  		}
          
		
		//
	}
} 
