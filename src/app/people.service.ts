import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

@Injectable()
export class PeopleService {
  private BASE_URL = 'http://localhost:8080/api/people';

  constructor(private http: HttpClient) {
  }

  login(email: string, password: string) {
    return this.http.post(this.BASE_URL + '/login', {email, password})
  }
}
