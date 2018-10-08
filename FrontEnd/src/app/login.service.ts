import { Injectable } from "@angular/core";
import { User } from "./model/user";
import {
  HttpClient,
  HttpHeaders,
  HttpErrorResponse
} from "@angular/common/http";
import { Observable, throwError } from "rxjs";
import { catchError } from "rxjs/operators";
const httpOptions = {
  headers: new HttpHeaders({ "Content-type": "application/json" })
};
@Injectable({
  providedIn: "root"
})
export class LoginService {
  private loginUrl: string = "http://localhost:8076/api/login";

  constructor(private http: HttpClient) {}

  // loginUser(login) {
  //   console.log(login);
  //    return this._http.post<Login>(`${this._url}/api/login`,login);

  // }
  localUser: User;
  login(user: User): Observable<any> {
    // console.log(user);
    this.localUser = user;
    return this.http
      .post<any>(this.loginUrl, user, httpOptions)
      .pipe(catchError(this.handleError));
  }
  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      console.log("An error occured: ", error.error.message);
    } else {
      console.log(
        `Backend returned code ${error.status}`,
        +`body was:- ${error.error}`
      );
    }
    console.log(
      `Backend returned code ${error.status}`,
      +`body was:- ${error.error}`
    );
    return throwError("Something went wrong please try again");
  }
}
