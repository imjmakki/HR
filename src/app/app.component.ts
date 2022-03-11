import {Component, OnInit} from '@angular/core';
import {Employee} from "./model/employee";
import {EmployeeService} from "./service/employee.service";
import {HttpErrorResponse} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  public employees: Employee[] | undefined;

  constructor(private employeeService: EmployeeService) {}

  ngOnInit() {
    this.getEmployees();
  }

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

  public onOpenModel(employee: Employee, mode: string): void {
    const button = document.createElement('button');
    button.type = 'button';
  }
}
