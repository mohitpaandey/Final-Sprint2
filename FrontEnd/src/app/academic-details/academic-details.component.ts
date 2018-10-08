import { Component, OnInit } from '@angular/core';
import { Academic } from '../model/academic';
import { AcademicsService } from '../services/academics.service';

@Component({
  selector: 'app-academic-details',
  templateUrl: './academic-details.component.html',
  styleUrls: ['./academic-details.component.css']
})
export class AcademicDetailsComponent implements OnInit {
  academic:Academic=new Academic();
  constructor(private academicService:AcademicsService) { }

  ngOnInit() {
  }
  onSubmit(academic:Academic){
    this.academic=academic;
    console.log(this.academic);
      this.academicService.postAcademic(this.academic).subscribe(
        data=> console.log(data)
      );
  }

}
