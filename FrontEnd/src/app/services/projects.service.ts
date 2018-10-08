import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import {Projects} from "../model/projects";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};

@Injectable({
  providedIn: 'root'
})
export class ProjectsService {

  private upstreamUrl: string = "http://localhost:8081";
  private downstreamUrl: string = "http://localhost:8067";
  userId:string;
  constructor(private http: HttpClient,private token:TokenStorage) {
    this.userId=token.getUserName();
  }
  postProjects(projects) {
    console.log(projects);
    return this.http.post<Projects>(`${this.upstreamUrl}/api/v1/proj`, projects);
   
  }
  getProjects() {
    return this.http.get<Projects>(`${this.downstreamUrl}/api/v1/proj/`+this.userId);
   
  }
}
