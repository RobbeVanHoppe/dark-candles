import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomePage} from "./home-page/home-page.component";
import {CandlesPage} from "./candles-page/candles-page.component";
import {AboutPage} from "./about-page/about-page.component";
import {LoginPage} from "./login/login-page.component";

const routes: Routes = [
  {path: 'home', component: HomePage},
  {path: 'candles', component: CandlesPage},
  {path: 'about', component: AboutPage},
  {path: 'login', component: LoginPage}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
