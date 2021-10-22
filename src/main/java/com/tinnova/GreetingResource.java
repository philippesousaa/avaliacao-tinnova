package com.tinnova;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("hello")
public class GreetingResource {

	/**
	 * Método para testar se a aplicação está funcionando ok
	 * 
	 * @return String
	 */
	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello world!";
    }
}