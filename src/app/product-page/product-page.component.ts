import { Component } from "@angular/core";
import { Candle } from "./Candle";
import {ProductsService} from "../products.service";

@Component({
  selector: 'product-page',
  templateUrl: 'product-page.component.html',
  styleUrls: ['product-page.component.scss'],
})

export class ProductPage {
  candles: Candle[] = [];

  constructor(private candleService: ProductsService) {}

  ngOnInit() {
    this.candleService.getAllCandles().subscribe((candles: Candle[]) => {
      this.candles = candles;
      // Do something with the retrieved Candle objects
    });
  }



  activeDiv: number = 1;
  SelectActive(id: number): void {
    this.activeDiv = id;
  }
}
