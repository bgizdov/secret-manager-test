package org.acme.resources;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.acme.repositories.EmployeeRepository;

@Path("/employee")
public class EmployeeResource {
  @Inject EmployeeRepository employeeRepository;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String employeesCount() {
    return "Count " + employeeRepository.count();
  }
}