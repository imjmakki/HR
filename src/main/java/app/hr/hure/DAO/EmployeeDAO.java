package app.hr.hure.DAO;

import app.hr.hure.Domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);
    Employee findEmployeeById(Long id);
}
