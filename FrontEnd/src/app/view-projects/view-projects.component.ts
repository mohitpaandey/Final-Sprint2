import { Component, OnInit } from '@angular/core';
import { ProjectsService } from '../services/projects.service';
import { Projects } from '../model/projects';

@Component({
  selector: 'app-view-projects',
  templateUrl: './view-projects.component.html',
  styleUrls: ['./view-projects.component.css']
})
export class ViewProjectsComponent implements OnInit {

  constructor(private projectsService:ProjectsService) { }
  projects:Projects=new Projects;
  ngOnInit() {
    this.projectsService.getProjects().subscribe(
      data=> this.projects=data
    );
  }

}
