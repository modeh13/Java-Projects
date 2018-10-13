package com.macpollo.api.rest.services;

import com.macpollo.api.rest.entities.*;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;

//@Path("/MacPolloApi")
@Path("")

public class LoginService {

	@GET
	//@Path("/validateUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public User getUser() {
		User user = new User();
		user.setUserName("gramirez");
		user.setPassword("123456");
		return user;
	}
	
	@POST
	@Path("/validateUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public User validateUser(User user) {
		return new User();
	}
}