import { SkillsComponent } from "./skills/skills.component";
import { ProjectComponent } from "./project/project.component";
import { PersonalDataComponent } from "./personal-data/personal-data.component";
import { LocationComponent } from "./location/location.component";
import { CertificationComponent } from "./certification/certification.component";
import { AcademicDetailsComponent } from "./academic-details/academic-details.component";
import { AppRoutingModule } from "./app-routing.module";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MatButtonModule, MatCheckboxModule } from "@angular/material";
import { MatToolbarModule } from "@angular/material/toolbar";
import { BrowserModule } from "@angular/platform-browser";
import { MatIconModule } from "@angular/material/icon";
import { NgModule } from "@angular/core";
import { MatCardModule } from "@angular/material/card";
import { AppComponent } from "./app.component";
import { MatInputModule } from "@angular/material/input";
import { MatFormFieldModule } from "@angular/material/form-field";
import { RegisterComponent } from "./register/register.component";
import { FormsModule, ReactiveFormsModule  } from "@angular/forms";
import { LoginComponent } from "./login/login.component";
import { HomeComponent } from "./home/home.component";
import { CommonModule } from "@angular/common";
import { MatSelectModule } from "@angular/material";
import { HttpClientModule } from "@angular/common/http";
import { TokenStorage } from "./core/token.storage";
import { CardsComponent } from "./cards/cards.component";
import { MatExpansionModule } from "@angular/material/expansion";
import { MatDatepickerModule } from "@angular/material/datepicker";
import { MatNativeDateModule } from "@angular/material";
import { LoginService } from "./login.service";
import { JwtModule, JWT_OPTIONS } from "@auth0/angular-jwt";
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatRadioModule} from '@angular/material/radio';
import { ViewPersonalComponent } from './view-personal/view-personal.component';
import { ViewAcademicsComponent } from './view-academics/view-academics.component';
import { ViewSkillsComponent } from './view-skills/view-skills.component';
import { ViewProjectsComponent } from './view-projects/view-projects.component';
import { ViewLocationComponent } from './view-location/view-location.component';
import { ViewExperienceComponent } from './view-experience/view-experience.component';
import { EmployerComponent } from "./employer/employer.component";



@NgModule({
  declarations: [
    AcademicDetailsComponent,
    SkillsComponent,
    ProjectComponent,
    PersonalDataComponent,
    LocationComponent,
    CertificationComponent,
    AppComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
    CardsComponent,
    ViewPersonalComponent,
    ViewAcademicsComponent,
    ViewSkillsComponent,
    ViewProjectsComponent,
    ViewLocationComponent,
    ViewExperienceComponent,
    EmployerComponent
  ],
  imports: [
    AppRoutingModule,
    MatDatepickerModule,
    FormsModule,
    MatExpansionModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatCheckboxModule,
    MatToolbarModule,
    MatIconModule,
    MatCardModule,
    MatInputModule,
    HttpClientModule,
    MatFormFieldModule,
    CommonModule,
    MatSelectModule,
    BrowserModule,
    MatNativeDateModule,
    JwtModule,
    ReactiveFormsModule,
    MatProgressBarModule,
    MatRadioModule,
    MatDatepickerModule
  ],
  providers: [TokenStorage, MatDatepickerModule, LoginService],

  bootstrap: [AppComponent]
})
export class AppModule {}
