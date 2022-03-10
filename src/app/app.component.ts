import { Component } from '@angular/core';
import {Employee} from "./model/employee";
import {EmployeeService} from "./service/employee.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public employees: Employee[];

  constructor(private employeeService: EmployeeService) {
  }
}
