package org.tw.spike.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/fu")
public class FuService {

    @GET
    @Path("/get")
    @Produces(APPLICATION_JSON)
    public User testGet() {
        User user = new User();
        user.setName("John Doe");
        user.setCity("Some City");
        return user;
    }

    @POST
    @Path("/post")
    @Consumes(APPLICATION_JSON)
    public Response testPost(User user) {
        String result = "User saved : " + user;
        return Response.status(201).entity(result).build();

    }
}
