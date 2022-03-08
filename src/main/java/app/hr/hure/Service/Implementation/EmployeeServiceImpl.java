package app.hr.hure.Service.Implementation;

import app.hr.hure.DAO.EmployeeDAO;
import app.hr.hure.Domain.Employee;
import app.hr.hure.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeDAO.save(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return employeeDAO.findEmployeeById(id).orElseThrow(() -> new EmployeeNotFoundException("There is no employee with this id: " + id + "in the system"));
    }

    @Override
    public List<Employee> allEmployees() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee editEmployee(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeDAO.deleteEmployeeById(id);
    }
}
