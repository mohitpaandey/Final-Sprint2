import { Component, OnInit } from "@angular/core";
import { CardsComponent } from "../cards/cards.component";
import { User } from "../model/user";
import { LoginService } from "../login.service";
import { error } from "@angular/compiler/src/util";
import { TokenStorage } from "../core/token.storage";
import { Router } from "@angular/router";
import { NgForm } from "@angular/forms";
import { FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  userEmail: string = "";
  userPassword: string = "";
  userName: string = "";
  user: User = new User();
  error: any;
  userRole:string;

  constructor(
    private loginService: LoginService,
    private token: TokenStorage,
    private router: Router
  ) {
    this.userRole=token.getUserRole();
  }

  ngOnInit() {}

  email = new FormControl('', [Validators.required, Validators.email]);

 getErrorMessage() {
   return this.email.hasError('required') ? 'You must enter a value' :
       this.email.hasError('email') ? 'Not a valid email' :
           '';
 }

  onLogin() {
    this.user.userEmail = this.userEmail;
    this.user.userPassword = this.userPassword;

    this.loginService.login(this.user).subscribe(data => {
      this.token.saveToken(data["token"], this.user.userEmail);
      if(this.userRole=="Employee")
      this.router.navigate(["cards"]);
      else
      this.router.navigate(["employer"]);
      error => (this.error = error);
    });
  }
  // getUser(user) {
  //   this.user.userEmail = this.userEmail;
  //   this.user.userPassword = this.userPassword;
  //   this.user.userName = this.userName;
  //   this.onLogin();
  // }
}
