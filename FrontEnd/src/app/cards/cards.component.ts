import { Component, OnInit } from "@angular/core";
import { User } from "../model/user";
import { LoginService } from "../login.service";
import { Input } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { TokenStorage } from "../core/token.storage";

@Component({
  selector: "app-cards",
  templateUrl: "./cards.component.html",
  styleUrls: ["./cards.component.css"]
})
export class CardsComponent implements OnInit {
  isCollapsed: boolean = true;
  userName: string;
  userId: string;

  constructor(
    private loginService: LoginService,
    private route: ActivatedRoute,
    private tokenStorage: TokenStorage
  ) {
    this.userId = tokenStorage.getUserId();
    this.userName = tokenStorage.getUserName();
  }

  toggleCollapse() {
    this.isCollapsed = !this.isCollapsed;
  }

  ngOnInit() {
    console.log(this.userName);
  }

  step = 0;
  setStep(index: number) {
    this.step = index;
  }
  nextStep() {
    this.step++;
  }
  prevStep() {
    this.step--;
  }
}
