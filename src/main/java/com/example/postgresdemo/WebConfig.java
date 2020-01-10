//package com.example.postgresdemo;
//
////package com.concretepage;
//import javax.servlet.http.HttpServlet;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.example.postgresdemo.servlet.HelloCountryServlet;
//import com.example.postgresdemo.servlet.HelloStateServlet;
//
//@Configuration
//public class WebConfig {
//   @Bean	
//   public ServletRegistrationBean<HttpServlet> countryServlet() {
//	   ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
//	   servRegBean.setServlet(new HelloCountryServlet());
//	   servRegBean.addUrlMappings("/country/*");
//	   servRegBean.setLoadOnStartup(1);
//	   return servRegBean;
//   }
//   @Bean	
//   public ServletRegistrationBean<HttpServlet> stateServlet() {
//	   ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
//	   servRegBean.setServlet(new HelloStateServlet());
//	   servRegBean.addUrlMappings("/state/*");
//	   servRegBean.setLoadOnStartup(1);
//	   return servRegBean;
//   }   
//} 
