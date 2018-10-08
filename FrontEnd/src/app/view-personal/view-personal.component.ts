import { Component, OnInit } from '@angular/core';
import { PersonalService } from '../services/personal.service';
import { Personal } from '../model/personal';

@Component({
  selector: 'app-view-personal',
  templateUrl: './view-personal.component.html',
  styleUrls: ['./view-personal.component.css']
})
export class ViewPersonalComponent implements OnInit {

  constructor(private personalService:PersonalService) { }
  personal:Personal=new Personal();
  ngOnInit() {
    this.personalService.getPersonal().subscribe(
      data=> this.personal=data
    );
  }
  

}
