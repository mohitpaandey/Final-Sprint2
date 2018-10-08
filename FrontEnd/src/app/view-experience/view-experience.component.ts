import { Component, OnInit } from '@angular/core';
import { CertificationService } from '../services/certification.service';
import { Certification } from '../model/certification';

@Component({
  selector: 'app-view-experience',
  templateUrl: './view-experience.component.html',
  styleUrls: ['./view-experience.component.css']
})
export class ViewExperienceComponent implements OnInit {

  constructor(private certificationService:CertificationService) { }
  certification:Certification=new Certification();
  ngOnInit() {
    this.certificationService.getCertification().subscribe(
      data=> this.certification=data
    );
  }
}
