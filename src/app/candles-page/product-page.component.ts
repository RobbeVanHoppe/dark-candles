import { Component } from "@angular/core";
import { Candle } from "./Candle";
import { ProductsService } from "../products.service";

@Component({
  selector: 'product-page',
  templateUrl: 'product-page.component.html',
  styleUrls: ['product-page.component.scss'],
})

export class ProductPage {
  candles: Candle[] = [];
  constructor(private productsService: ProductsService) {
    this.productsService.getAllProducts().subscribe(data => {
      

    });
   };


  activeDiv: number = 1;
  SelectActive(id: number): void {
    this.activeDiv = id;
  }
}
