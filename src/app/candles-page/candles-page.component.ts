import {Component} from "@angular/core";
import {Candle} from "./Candle";

@Component({
  selector: 'candles-page',
  templateUrl: 'candles-page.component.html',
  styleUrls: ['candles-page.component.scss'],
})

export class CandlesPage {
  candles: Candle[] = [
    new Candle(0, 12, 5, 'Mooie Kaars met hartjes ofzo weet ik veel'),
    new Candle(1, 15, 10, 'Zwarte kaars met witte randjes en andere shit'),
    new Candle(2, 10, 20, 'Kaars met bolletjes en andere gekke vormpjes'),
    new Candle(3, 12, 5, 'Mooie Kaars met hartjes ofzo weet ik veel'),
    new Candle(4, 15, 10, 'Zwarte kaars met witte randjes en andere shit'),
    new Candle(5, 10, 20, 'Kaars met bolletjes en andere gekke vormpjes')
  ]
}
