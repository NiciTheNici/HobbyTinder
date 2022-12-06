import { Component } from '@angular/core';
import {COMMA, ENTER} from '@angular/cdk/keycodes';
import {MatChipInputEvent} from "@angular/material/chips";
export interface Hobby {
  name: string;
}
@Component({
  selector: 'app-profile',
  templateUrl: 'profile.component.html',
  styleUrls: ['profile.component.css']
})


export class ProfileComponent {
  visible = true;
  selectable = true;
  removable = true;
  addOnBlur = true;

  readonly separatorKeysCodes: number[] = [ENTER, COMMA];
  hobbys: Hobby[] = [
    {name: 'Climbing'},
    {name: 'Dancing'},
    {name: 'Football'},
  ];

  add(event: MatChipInputEvent): void {
    const input = event.input;
    const value = event.value;

    // Add our hobby
    if ((value || '').trim()) {
      this.hobbys.push({name: value.trim()});
    }

    // Reset the input value
    if (input) {
      input.value = '';
    }
  }

  remove(hobby: Hobby): void {
    const index = this.hobbys.indexOf(hobby);

    if (index >= 0) {
      this.hobbys.splice(index, 1);
    }
  }
}
