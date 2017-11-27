package pl.aplication.rest;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

import pl.aplication.model.Agent;

import javax.ws.rs.*;

@RequestScoped
@Path("/endpoint")
public class EndPioint {
	
	Agent agent = new Agent();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String showSomething() {
		
		
		
		
		
		return
				
				
				agent.getAgentName();
	}
	
	
	
}
