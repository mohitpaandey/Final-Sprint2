import { Register } from "./register";
import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class RegisterService {
  _url = "http://localhost:8085";
  constructor(private _http: HttpClient) {}

  createUser(register) {
    return this._http.post<Register>(`${this._url}/api/v1/user`, register);
  }
}
