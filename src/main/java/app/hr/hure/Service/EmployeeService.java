package app.hr.hure.Service;

import app.hr.hure.Domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employee addEmployee(Employee employee);
    Employee getEmployee(Long id);
    List<Employee> allEmployees();
    Employee editEmployee(Employee employee);
    void deleteEmployee(Long id);
}
