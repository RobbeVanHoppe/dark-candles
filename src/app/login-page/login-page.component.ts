import {Component} from "@angular/core";
import {faLock, faUser} from  "@fortawesome/free-solid-svg-icons";


@Component({
  selector: 'LoginPage',
  templateUrl: 'login-page.component.html'
})

export class LoginPage {
  faLock = faLock
  faUser = faUser;
}
