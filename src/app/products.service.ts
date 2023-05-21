import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Candle } from './product-page/Candle';

@Injectable()
export class ProductsService {
  private BASE_URL = 'http://localhost:8080/api/products';

  constructor(private http: HttpClient) {}

  getAllCandles(): Observable<Candle[]> {
    return this.http
      .get(`${this.BASE_URL}/type/CANDLE`)
      .pipe(map((data: any) => this.convertToCandles(data)));
  }

  private convertToCandles(data: any[]): Candle[] {
    return data.map((c: any) => {
      return new Candle(
        c.id,
        c.productType,
        c.description,
        c.stock,
        c.price,
        c.created,
        c.color,
        c.scent,
        c.shape
      );
    });
  }
}
