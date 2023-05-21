import {Component} from "@angular/core";
import {faLock, faUser} from  "@fortawesome/free-solid-svg-icons";
import {PeopleService} from "../people.service";


@Component({
  selector: 'LoginPage',
  templateUrl: 'login-page.component.html'
})


export class LoginPage {
  faLock = faLock
  faUser = faUser;
  email: string = '';
  password: string = '';

  constructor(private peopleService: PeopleService) {}

  login(email: string, password: string) {
    this.peopleService.login(this.email, this.password).subscribe((data: any) => {
      console.log('Login successful' + data);

    });
  }

}
