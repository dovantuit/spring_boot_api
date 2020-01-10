//package com.example.postgresdemo.controller;
//
////package com.BaiduWeather.Servlets;
//
//import java.io.IOException;
//import java.util.List;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
////import com.BaiduWeather.Entities.HeWeatherDataService30;
////import com.BaiduWeather.Entities.Root;
////import com.BaiduWeather.Services.BaiduWeatherService; 
///**
// * Servlet implementation class WeatherServlet
// * 
// *  We can use 。jsp instead of servlet
// */
//@WebServlet("/weather")
//public class WeatherServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;    
//
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public WeatherServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//    /**
//     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
//                      throws ServletException, IOException {
//        //Get weather json info and convert it to object
//        String city=request.getParameter("city");
//        Root wheatherInfoObject=BaiduWeatherService.getWeatherInfo(city);
//        if(wheatherInfoObject!=null){
//            List<HeWeatherDataService30> weatherlist= wheatherInfoObject.getHeWeatherDataService30();            
//            if(weatherlist!=null)
//            {
//                //output the weather content on web page.
//                StringBuilder outputContent=new StringBuilder();//Unless the need of thread-safe,
//                //Use StringBuilder not StringBuffer,because the latter takes more erformance overhead because of Synchronization
//                //More cities can be store in a database or file，then load them into an array,then generators options of selection here
//                outputContent.append("<!DOCTYPE html><html><head><meta charset=\"UTF-8\">
//                 <title>Insert title here</title></head><body><form action=\"weather\" 
//                 method=\"GET\"><select name=\"city\"><option value =\"beijing\">北京</option> 
//                 <option value =\"shanghai\">上海</option><option value =\"xian\">西安</option>
//                 </select><input type=\"submit\" value=\"Submit\"></form>");
//                outputContent.append(weatherlist.get(0).getBasic().getCity());
//                outputContent.append("<br/>");
//                outputContent.append(weatherlist.get(0).getNow().getTmp());
//                outputContent.append("℃");
//                outputContent.append("<br/>");
//                outputContent.append(weatherlist.get(0).getNow().getCond().getTxt());
//                outputContent.append("<br/>");
//                outputContent.append(weatherlist.get(0).getNow().getWind().getDir());
//                outputContent.append("</body></html>");
//                
//                response.setContentType("text/html; charset=utf-8");
//                response.getWriter().write(outputContent.toString());
//            }
//        }
//    }
//
//    /**
//     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//     */
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
//                throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        doGet(request, response);
//    }
//}
