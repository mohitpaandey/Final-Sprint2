import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import {Academic} from "../model/academic";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable({
  providedIn: 'root'
})
export class AcademicsService {
  private upstreamUrl: string = "http://localhost:8081";
  private downstreamUrl: string = "http://localhost:8067";
  userId:string;
  constructor(private http: HttpClient,private token:TokenStorage) {
    this.userId=token.getUserName();
  }
  postAcademic(academic) {
    console.log(academic);
     return this.http.post<Academic>(`${this.upstreamUrl}/api/v1/acad`, academic);
   
  }
  getAcademic() {
    
     return this.http.get<Academic>(`${this.downstreamUrl}/api/v1/acad/`+this.userId);
   
  }

}
