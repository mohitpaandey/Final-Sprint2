import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpErrorResponse} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
import {Personal} from "../model/personal";
import { TokenStorage } from '../core/token.storage';
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};

@Injectable({
  providedIn: 'root'
})
export class SearchService {
  query:string;
  constructor(private http: HttpClient) { }
  private searchUrl: string = "http://localhost:8095";
   postQuery(query){
     this.query=query;
     console.log(query);
     return this.http.get<String>(`${this.searchUrl}/api/v1/search/`+this.query);
  }
}
