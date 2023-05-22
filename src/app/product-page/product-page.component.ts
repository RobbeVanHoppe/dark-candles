import {Component, OnInit} from "@angular/core";
import {Candle} from "./Candle";
import {ProductsService} from "../products.service";

@Component({
  selector: 'product-page',
  templateUrl: 'product-page.component.html',
  styleUrls: ['product-page.component.scss'],
})

export class ProductPage implements OnInit {
  candles: Candle[] = [];

  constructor(private productsService: ProductsService) {
  }

  ngOnInit() {
    this.productsService.getAllCandles().subscribe((candles: Candle[]) => {
      this.candles = candles;
    });
  }

  activeDiv: number = 1;

  SelectActive(id: number): void {
    this.activeDiv = id;
  }
}
