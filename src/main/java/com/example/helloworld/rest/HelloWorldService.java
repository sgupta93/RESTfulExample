package com.example.helloworld.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String result1 = "Jersey Helllo world first application say Welcome to world!********!!: " + msg;
 
		return Response.status(200).entity(result1).build();
 
	}
 
}
