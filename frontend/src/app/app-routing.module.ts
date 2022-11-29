import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import {RouterModule, Routes,RouterLink} from '@angular/router';
import {ProfileComponent} from "./profile/profile.component";



const routes: Routes = [
  {
    path: 'login', component: LoginComponent},
  { path: 'profile', component: ProfileComponent},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule,RouterLink]
})
export class AppRoutingModule { }

