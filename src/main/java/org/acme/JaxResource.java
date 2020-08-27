package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/jax")
public class JaxResource {

    @GET
    public String jax() {
        return "JAX Hello";
    }
}
