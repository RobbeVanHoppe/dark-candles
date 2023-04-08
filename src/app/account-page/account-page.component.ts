import { Component } from "@angular/core";

@Component({
  selector: 'account-page',
  templateUrl: 'account-page.component.html',
  styleUrls: ['account-page.component.scss'],
})

export class AccountPage {
  activeDiv: number = 1;
  SelectActive(id: number): void {
    this.activeDiv = id;
  }

}