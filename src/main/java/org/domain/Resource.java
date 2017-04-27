package org.domain;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;

@Path("/service")
public class Resource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String test(){
		
		return "Test OK! Changes in Test Message Change 12 Updated with latest changes";
	
	}
}
