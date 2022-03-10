import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Employee} from "../model/employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiServerUrl = '';

  constructor(private http: HttpClient) { }

  public getEmployees(): Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/list`);
  }
}
