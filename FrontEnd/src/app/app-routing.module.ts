import { AcademicDetailsComponent } from "./academic-details/academic-details.component";
import { CertificationComponent } from "./certification/certification.component";
import { ProjectComponent } from "./project/project.component";
import { PersonalDataComponent } from "./personal-data/personal-data.component";
import { CardsComponent } from "./cards/cards.component";
import { LoginComponent } from "./login/login.component";
import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { RegisterComponent } from "./register/register.component";
import { HomeComponent } from "./home/home.component";
import { SkillsComponent } from "./skills/skills.component";
import { LocationComponent } from "./location/location.component";
import { ViewPersonalComponent } from "src/app/view-personal/view-personal.component";
import { ViewAcademicsComponent } from "src/app/view-academics/view-academics.component";
import { ViewSkillsComponent } from "src/app/view-skills/view-skills.component";
import { ViewProjectsComponent } from "src/app/view-projects/view-projects.component";
import { ViewLocationComponent } from "src/app/view-location/view-location.component";
import { ViewExperienceComponent } from "src/app/view-experience/view-experience.component";
import { EmployerComponent } from "src/app/employer/employer.component";



const routes: Routes = [
  {
    path: "",
    component: HomeComponent
  },
  {
    path: "register",
    component: RegisterComponent
  },
  {
    path: "login",
    component: LoginComponent
  },
  {
    path: "employer",
    component:EmployerComponent
  },

  {
    path: "cards",
    component: CardsComponent
  },
  {
    path: "personal-data",
    component: PersonalDataComponent
  },
  {
    path: "view-personal",
    component: ViewPersonalComponent
  },
  {
    path: "skills",
    component: SkillsComponent
  },{
    path: "view-skills",
    component: ViewSkillsComponent
  }, 
  {
    path: "project",
    component: ProjectComponent
  }, 
  {
    path: "view-projects",
    component: ViewProjectsComponent
  },
  {
    path: "location",
    component: LocationComponent
  },
  {
    path: "view-location",
    component: ViewLocationComponent
  },
  {
    path: "certification",
    component: CertificationComponent
  },
  {
    path: "view-experience",
    component:ViewExperienceComponent
  },
  {
    path: "academic-details",
    component: AcademicDetailsComponent
  },
  {
    path: "view-academics",
    component: ViewAcademicsComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
