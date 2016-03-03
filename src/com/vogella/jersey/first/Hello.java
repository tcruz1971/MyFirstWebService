package com.vogella.jersey.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {

//  // This method is called if TEXT_PLAIN is request
//  @GET
//  @Produces(MediaType.TEXT_PLAIN)
//  public String sayPlainTextHello() {
//    return "Hello Jersey";
//  }

  // This method is called if XML is request
  @GET
  @Produces(MediaType.APPLICATION_XML)
  public String sayXMLHello() {
	String output = "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey";
	File[] paths;
	File f = new File("/");
	paths = f.listFiles();
	for (File path:paths) {
		output = output + "<file>" + path + "</file>";  
	}
    return output + "</hello>";
  }

//  // This method is called if HTML is request
//  @GET
//  @Produces(MediaType.TEXT_HTML)
//  public String sayHtmlHello() {
//	String output = "<html> " + "<title>" + "Hello Jersey" + "</title>" + "<body><h1>" + "Hello Jersey" + "</h1>";
//	File[] paths;
//	File f = new File("/");
//	paths = f.listFiles();
//	for (File path:paths) {
//		output = output + path + "<br>";  
//	}
//	output = output + "</body>" + "</html> ";
//    return output;
//  }
} 