import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import {Location} from "../model/location";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable({
  providedIn: 'root'
})
export class LocationService {

  private upstreamUrl: string = "http://localhost:8081";
  private downstreamUrl: string = "http://localhost:8067";
  userId:string;
  constructor(private http: HttpClient,private token:TokenStorage) {
    this.userId=token.getUserName();
  }
  postLocation(location) {
    console.log(location);
    return this.http.post<Location>(`${this.upstreamUrl}/api/v1/loc`, location);
    
  }
  getLocation() {
    
    return this.http.get<Location>(`${this.downstreamUrl}/api/v1/loc/`+this.userId);
    
  }
}
