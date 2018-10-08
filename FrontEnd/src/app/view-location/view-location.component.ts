import { Component, OnInit } from '@angular/core';
import { LocationService } from '../services/location.service';
import {Location} from "../model/location";
@Component({
  selector: 'app-view-location',
  templateUrl: './view-location.component.html',
  styleUrls: ['./view-location.component.css']
})
export class ViewLocationComponent implements OnInit {

  constructor(private locationService:LocationService) { }
  location:Location=new Location();
  ngOnInit() {
    this.locationService.getLocation().subscribe(
      data=> this.location=data
    );
  }


}
