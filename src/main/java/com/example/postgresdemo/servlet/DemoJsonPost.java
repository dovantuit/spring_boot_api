package com.example.postgresdemo.servlet;
import java.io.IOException;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
public class DemoJsonPost {
  public static void main(String[] args) throws ClientProtocolException, IOException {
    CloseableHttpClient client = HttpClients.createDefault();
    HttpPost httpPost = new HttpPost("http://localhost:9097/users");
    
    StringEntity entity = new StringEntity("{\"email\":\"hello@gmail.com\""
    		+ ",\"password\":\"111\""
    		+ ",\"description\":\"this is just the description\""
    		+ ",\"full_name\":\"do van tien\""
    		+ ",\"birthday\":\"20-10-2019\""
    		+ ",\"title\":\"boss\"}"
    		);
    httpPost.setEntity(entity);
    httpPost.setHeader("Accept", "application/json");
    httpPost.setHeader("Content-type", "application/json");
    HttpResponse httpResponse = client.execute(httpPost);
    
      System.out.println("+++Protocol: " + httpResponse.getProtocolVersion());
      System.out.println("+++Status:" + httpResponse.getStatusLine().toString());
      System.out.println("+++Content type:" + httpResponse.getEntity().getContentType());
      System.out.println("+++Locale:" + httpResponse.getLocale());
      System.out.println("+++Content:");
      String content = IOUtils.toString(httpResponse.getEntity().getContent(), "UTF-8");
      System.out.println("--------------------------------------------------------");
      System.out.println(content);
  }
}