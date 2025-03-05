package bjitAcademy.example.CRUD_demo.repository;

import bjitAcademy.example.CRUD_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
