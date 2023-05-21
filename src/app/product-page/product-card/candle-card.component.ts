import { Component, Input } from "@angular/core";
import { Candle } from "../Candle";

@Component({
  selector: 'CandleCard',
  templateUrl: 'candle-card.component.html',
  styles: [`
    .card-footer {
      border: 0 !important;
    }

    #description {
      min-height: 70px;
    }`]
})
export class CandleCard {
  @Input() candle: Candle;
}
