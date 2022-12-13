import { Component, OnInit } from '@angular/core';
import {User} from "../user.model";

@Component({
  selector: 'app-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.css']
})
export class FeedComponent implements OnInit {

  users: User[];

  constructor(){
    // Adding User instances to users array
    this.users = [new User('Jack', 56, new Date('2005-03-25')),
      new User('Lisa', 32, new Date('2012-05-09')),
      new User('Jayesh', 28, new Date('2014-10-21'))] ;
  }

  ngOnInit(): void {
  }

  likeUser(user: User) {

  }

  passUser(user: User) {

  }
}
