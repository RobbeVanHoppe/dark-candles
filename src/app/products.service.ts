import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from './candles-page/Product';
import { Candle } from './candles-page/Candle';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {
  BASE_URL:string;
  products: Product[] = [];

  constructor(private http: HttpClient) {
    this.BASE_URL = "http://localhost:8080/api/products";
  }

  getAllProducts() {
    this.getAllCandles().forEach(c => {
      this.products.push(c as Product);
    });
    this.products.push()
  }
  getAllCandles(): Candle[] {
    return this.http.get(`${this.BASE_URL}/type/CANDLE`);
  };
}
