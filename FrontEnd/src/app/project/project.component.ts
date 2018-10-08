import { Component, OnInit } from '@angular/core';
import { Projects } from '../model/projects';
import { ProjectsService } from '../services/projects.service';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {
  projects:Projects=new Projects();
  constructor(private projectService:ProjectsService) { }

  ngOnInit() {
  }
  onSubmit(projects:Projects){
    this.projects=projects;
    console.log(this.projects);
      this.projectService.postProjects(this.projects).subscribe(
        data=> console.log(data)
      );
  }

}
