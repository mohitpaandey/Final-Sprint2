import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import {Skills} from "../model/skills";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};

@Injectable({
  providedIn: 'root'
})
export class SkillsService {
  private upstreamUrl: string = "http://localhost:8081";
  private downstreamUrl: string = "http://localhost:8067";
  userId:string;
  constructor(private http: HttpClient,private token:TokenStorage) {
    this.userId=token.getUserName();
  }
  postSkills(skills) {
    console.log(skills);
    return this.http.post<Skills>(`${this.upstreamUrl}/api/v1/skills`, skills);
   
  }
  getSkills() {
    
    return this.http.get<Skills>(`${this.downstreamUrl}/api/v1/skills/`+this.userId);
   
  }
}
