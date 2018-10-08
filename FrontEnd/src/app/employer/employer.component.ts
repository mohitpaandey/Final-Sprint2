import { Component, OnInit } from '@angular/core';
import { TokenStorage } from '../core/token.storage';
import { SearchService } from '../services/search.service';

@Component({
  selector: 'app-employer',
  templateUrl: './employer.component.html',
  styleUrls: ['./employer.component.css']
})
export class EmployerComponent implements OnInit {
  userName: string;
  userId: string;
  query:string;

  constructor(private tokenStorage: TokenStorage,private searchService:SearchService) { 
    this.userId = tokenStorage.getUserId();
    this.userName = tokenStorage.getUserName();
  }

  ngOnInit() {
  }
  postQuery(query){
    this.query=query;
    console.log(query);
    this.searchService.postQuery(this.query).subscribe(
      data=> console.log(data)
    );
  }

}
