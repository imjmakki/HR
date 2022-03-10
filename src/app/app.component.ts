import { Component } from '@angular/core';
import {Employee} from "./model/employee";
import {EmployeeService} from "./service/employee.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public employees: Employee[] | undefined;

  constructor(private employeeService: EmployeeService) {}

  public getEmployees(): void {
    this.employeeService.getEmployees().subscribe(
      (response: Employee[]) => {
        this.employees = response;
      },
      (error: HttpErrorResponse) => {
          alert(error.message);
      }
    );
  }
}
