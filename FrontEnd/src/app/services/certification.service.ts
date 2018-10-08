import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import {Certification} from "../model/certification";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
 headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable({
 providedIn: 'root'
})
export class CertificationService {

 private upstreamUrl: string = "http://localhost:8081";
 private downstreamUrl: string = "http://localhost:8067";
userId:string;
 constructor(private http: HttpClient,private token:TokenStorage) {
  this.userId=token.getUserName();
 }
 postCertification(certification) {
  console.log(certification);
    return this.http.post<Certification>(`${this.upstreamUrl}/api/v1/certi`, certification);
  
 }
 getCertification() {
  
    return this.http.get<Certification>(`${this.downstreamUrl}/api/v1/certi/`+this.userId);
  
 }

}