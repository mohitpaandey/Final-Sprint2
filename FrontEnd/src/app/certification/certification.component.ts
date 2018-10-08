import { Component, OnInit } from '@angular/core';
import { Certification} from "../model/certification";
import { CertificationService } from '../services/certification.service';
@Component({
  selector: 'app-certification',
  templateUrl: './certification.component.html',
  styleUrls: ['./certification.component.css']
})
export class CertificationComponent implements OnInit {
  certification:Certification=new Certification();
  constructor(private certificationService:CertificationService) { }

  ngOnInit() {
  }
  onSubmit(certification:Certification){
    this.certification=certification;
    console.log(this.certification);
      this.certificationService.postCertification(this.certification).subscribe(
        data=> console.log(data)
      );
  }
}
