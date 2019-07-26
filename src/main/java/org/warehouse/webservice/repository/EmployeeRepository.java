package org.warehouse.webservice.repository;
import org.springframework.data.repository.CrudRepository;
import org.warehouse.webservice.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
