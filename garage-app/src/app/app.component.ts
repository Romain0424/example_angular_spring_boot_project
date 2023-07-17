import { Component } from '@angular/core';
import { GarageService } from './garage.service';
import { OnInit } from '@angular/core/'
import { Cars } from './data';
import { HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ GarageService ]
})
export class AppComponent implements OnInit {
  title = 'garage-app';
  cars: Cars[] = [];


  constructor(private garageService: GarageService){
  }

  ngOnInit(): void {
    console.log("OnInit....")
    this.garageService.getCars()
      .subscribe(datas => this.cars=datas as Cars[]) 
  }
}
