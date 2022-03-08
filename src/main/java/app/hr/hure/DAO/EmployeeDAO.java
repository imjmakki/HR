package app.hr.hure.DAO;

import app.hr.hure.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);
    Optional findEmployeeById(Long id);
}
