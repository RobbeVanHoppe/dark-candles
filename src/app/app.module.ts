import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {NavBar} from "./navbar.component";
import {CommonModule} from "@angular/common";
import {CandlesPage} from "./candles-page/candles-page.component";
import {AboutPage} from "./about-page/about-page.component";
import {CandleCard} from "./candles-page/candle-card.component";
import {LoginPage} from "./login/login-page.component";

@NgModule({
  declarations: [
    AppComponent,
    NavBar,
    CandlesPage,
    AboutPage,
    CandleCard,
    LoginPage
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
