import { Injectable } from "@angular/core";
import { JwtHelperService } from "@auth0/angular-jwt";

const TOKEN_KEY = "AuthToken";
const USER_ID = "UserId";
const USER_NAME = "UserName";
const USER_ROLE = "UserRole";
const helper = new JwtHelperService();

@Injectable()
export class TokenStorage {
  decodedToken: any;
  userName: any;
  userRole:any;
  constructor() {}

  public saveToken(token: string, userId: string) {
    this.decodedToken = helper.decodeToken(token);
    this.userName = this.decodedToken.name;
    console.log(this.userName);
    this.userRole=this.decodedToken.sub;
    window.sessionStorage.removeItem(TOKEN_KEY);
    window.sessionStorage.removeItem(USER_ID);
    window.sessionStorage.removeItem(USER_NAME);
    window.sessionStorage.removeItem(USER_ROLE);
    window.sessionStorage.setItem(TOKEN_KEY, token);
    window.sessionStorage.setItem(USER_ID, userId);
    window.sessionStorage.setItem(USER_NAME, this.userName);
    window.sessionStorage.setItem(USER_ROLE, this.userRole);
   
  }

  public getToken(): string {
    return sessionStorage.getItem(TOKEN_KEY);
  }

  public getUserId(): string {
    return sessionStorage.getItem(USER_ID);
  }
  public getUserName(): string {
    console.log(this.userName);
    return sessionStorage.getItem(USER_NAME);
    
  }
  public getUserRole(): string {
    return sessionStorage.getItem(USER_ROLE);
  }
}
