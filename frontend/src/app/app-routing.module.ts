import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LoginComponent } from './login/login.component';
import {RouterModule, Routes,RouterLink} from '@angular/router';



const routes: Routes = [
  {
    path: 'login', component: LoginComponent,
  },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule,RouterLink]
})
export class AppRoutingModule { }

