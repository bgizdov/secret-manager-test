package org.acme.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.repositories.EmployeeRepository;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {
  @Inject EmployeeRepository employeeRepository;

  @ConfigProperty(name = "custom.username")
  String username;

  // This doesnt work
  //@ConfigProperty(name = "${sm//db-user}")
  //String username2;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "Hello " + username;
  }
}