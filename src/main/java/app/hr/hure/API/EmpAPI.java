package app.hr.hure.API;

import app.hr.hure.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmpAPI {

    private EmployeeService employeeService;

    @Autowired
    public EmpAPI(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
}
