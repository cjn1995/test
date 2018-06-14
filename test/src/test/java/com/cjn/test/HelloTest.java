package com.cjn.test;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;


public class HelloTest {
	
	@Test
	public void test() {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet get = new HttpGet("http://localhost:8080/test/hello");
		
		try {
			CloseableHttpResponse response = client.execute(get);
			try {
				HttpEntity entity = response.getEntity(); 
				if (entity != null) {  
	                System.out.println("--------------------------------------");  
	                System.out.println("Response content: " + EntityUtils.toString(entity, "UTF-8"));  
	                System.out.println("--------------------------------------");  
	            }  
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				response.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
				
	}

}
