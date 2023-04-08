import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePage } from "./home-page/home-page.component";
import { CandlesPage } from "./candles-page/candles-page.component";
import { AboutPage } from "./about-page/about-page.component";
import { LoginPage } from "./login-page/login-page.component";
import { RegisterPage } from "./register-page/register-page.component";
import { AccountPage } from './account-page/account-page.component';

const routes: Routes = [
  { path: '', component: HomePage },
  { path: 'home', component: HomePage },
  { path: 'candles', component: CandlesPage },
  { path: 'about', component: AboutPage },
  { path: 'login', component: LoginPage },
  { path: 'register', component: RegisterPage },
  { path: 'account', component: AccountPage },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
