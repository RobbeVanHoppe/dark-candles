import {Component} from "@angular/core";
import {faLock, faUser, faEnvelope, faIdCard, faHouse, faLocationDot, faPhone} from "@fortawesome/free-solid-svg-icons";

@Component({
  selector: 'RegisterPage',
  templateUrl: 'register-page.component.html'
})

export class RegisterPage {
  faUser = faUser;
  faLock = faLock;
  faEnvelope = faEnvelope;
  faIdCard = faIdCard;
  faHouse = faHouse;
  faLocationdot = faLocationDot;
  faPhone = faPhone;
}
