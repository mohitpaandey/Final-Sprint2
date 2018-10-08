import { Component, OnInit } from '@angular/core';
import { SkillsService } from '../services/skills.service';
import { Skills } from '../model/skills';

@Component({
  selector: 'app-view-skills',
  templateUrl: './view-skills.component.html',
  styleUrls: ['./view-skills.component.css']
})
export class ViewSkillsComponent implements OnInit {

  constructor(private skillsService:SkillsService) { }
  skills:Skills=new Skills();
  ngOnInit() {
    this.skillsService.getSkills().subscribe(
      data=> this.skills=data
    );
  }
}
