package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResource {

    @Inject
    Instance<SomeBean> bean;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello:" + bean.isResolvable();
    }

}
