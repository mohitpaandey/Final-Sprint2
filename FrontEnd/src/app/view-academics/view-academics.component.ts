import { Component, OnInit } from '@angular/core';
import { AcademicsService } from '../services/academics.service';
import { Academic } from '../model/academic';

@Component({
  selector: 'app-view-academics',
  templateUrl: './view-academics.component.html',
  styleUrls: ['./view-academics.component.css']
})
export class ViewAcademicsComponent implements OnInit {

  constructor(private academicService:AcademicsService) { }
  academic:Academic=new Academic();
  ngOnInit() {
    this.academicService.getAcademic().subscribe(
      data=> this.academic=data
    );
  }

}
