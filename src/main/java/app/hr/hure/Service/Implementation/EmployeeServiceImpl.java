package app.hr.hure.Service.Implementation;

import app.hr.hure.Domain.Employee;
import app.hr.hure.Service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee addEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmployee(Long id) {
        return null;
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Employee editEmployee(Employee employee) {
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {

    }
}
