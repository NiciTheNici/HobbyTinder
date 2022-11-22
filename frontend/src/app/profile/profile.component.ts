import { Component } from '@angular/core';

@Component({
  selector: 'app-profile',
  templateUrl: 'profile.component.html',
  styleUrls: ['profile.component.css']
})
export class ProfileComponent {

  edit: boolean = false;

  editProfile() {
    this.edit = true;
  }

  goBack() {
    this.edit = false;
  }
}
