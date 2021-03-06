package app.hr.hure.API;

import app.hr.hure.Domain.Employee;
import app.hr.hure.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("employee")
@CrossOrigin(origins = "*")
public class EmpAPI {

    private EmployeeService employeeService;

    @Autowired
    public EmpAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee, CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> listEmployees () {
        List<Employee> employees = employeeService.allEmployees();
        return new ResponseEntity<>(employees, OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long id) {
        Employee employee = employeeService.getEmployee(id);
        return new ResponseEntity<>(employee, OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Employee> editEmployee(@RequestBody Employee employee) {
        Employee editEmployee = employeeService.editEmployee(employee);
        return new ResponseEntity<>(editEmployee, OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<?> removeEmployee(@PathVariable("id") Long id) {
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(OK);
    }
}
