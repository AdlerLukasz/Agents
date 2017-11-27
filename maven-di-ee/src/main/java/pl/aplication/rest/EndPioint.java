package pl.aplication.rest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import pl.aplication.model.Agent;

import javax.ws.rs.*;

@RequestScoped
@Path("/endpoint")
public class EndPioint {
	
	Agent agent = new Agent();

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public List<String> getAll(@QueryParam("orderBy") @DefaultValue("asc") String order){
		List<String> people = new ArrayList<>(Arrays.asList(new String[] {
			"Person 2", "Person 1", "Person 3"
		}));
		
		
		 
	    return people;
		
	}
 	
	
	
}
