import { NgModule, isDevMode } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavBar } from "./navbar.component";
import { CommonModule } from "@angular/common";
import { CandlesPage } from "./candles-page/candles-page.component";
import { AboutPage } from "./about-page/about-page.component";
import { CandleCard } from "./candles-page/candle-card/candle-card.component";
import { LoginPage } from "./login-page/login-page.component";
import { FontAwesomeModule } from "@fortawesome/angular-fontawesome";
import { RegisterPage } from "./register-page/register-page.component";
import { AccountPage } from './account-page/account-page.component';
import { NG_STORE_CONFIG, NgStoreModule, StoreConfiguration } from '@ssougnez/ng-store';
import { initial } from "./store/states/app.state";


@NgModule({
  declarations: [
    AppComponent,
    NavBar,
    CandlesPage,
    AboutPage,
    CandleCard,
    LoginPage,
    RegisterPage,
    AccountPage,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CommonModule,
    FontAwesomeModule,
    NgStoreModule
  ],
  providers: [
    {
      provide: NG_STORE_CONFIG,
      useValue: {
        initialValue: initial,
        httpClientType: null
      } as StoreConfiguration
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
