import { Component, OnInit } from '@angular/core';
import { Personal } from '../model/personal';
import { PersonalService } from '../services/personal.service';
import { TokenStorage } from '../core/token.storage';


@Component({
  selector: 'app-personal-data',
  templateUrl: './personal-data.component.html',
  styleUrls: ['./personal-data.component.css']
})
export class PersonalDataComponent implements OnInit {
  personal:Personal=new Personal();
  
  constructor(private personalService:PersonalService,private token:TokenStorage) {
    this.personal.userId=token.getUserId();
    this.personal.userName=token.getUserName();

   }
  
  ngOnInit() {
  }
  onSubmit(personal:Personal){
    this.personal=personal;
    console.log(this.personal);
      this.personalService.postPersonal(this.personal).subscribe(
        data=> console.log(data)
      );
  }

}
