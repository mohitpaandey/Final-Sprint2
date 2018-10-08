import { Component, OnInit } from '@angular/core';
import { LocationService } from '../services/location.service';
import {Location} from "../model/location";

@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {
  location:Location=new Location();
  constructor(private locationService:LocationService) { }

  ngOnInit() {
  }
  onSubmit(location:Location){
    this.location=location;
    console.log(this.location);
      this.locationService.postLocation(this.location).subscribe(
        data=> console.log(data)
      );
  }

}
