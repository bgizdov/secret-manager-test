package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;
import org.acme.entities.Emploeye;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Emploeye> {
}
