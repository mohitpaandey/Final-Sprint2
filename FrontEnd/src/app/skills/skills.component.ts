import { Component, OnInit } from '@angular/core';
import { Skills } from '../model/skills';
import { SkillsService } from '../services/skills.service';

@Component({
  selector: 'app-skills',
  templateUrl: './skills.component.html',
  styleUrls: ['./skills.component.css']
})
export class SkillsComponent implements OnInit {
  skills:Skills=new Skills();
  constructor(private skillService:SkillsService) { }

  ngOnInit() {
  }
  onSubmit(skills:Skills){
    this.skills=skills;
    console.log(this.skills);
      this.skillService.postSkills(this.skills).subscribe(
        data=> console.log(data)
      );
  }
}
