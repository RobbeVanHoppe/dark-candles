export class Candle {
  private CandleId: number;
  Price: number;
  Stock: number;
  private Description: string;

  constructor(CandleId: number, Price: number, Stock: number, Description: string) {
    this.CandleId = CandleId;
    this.Price = Price;
    this.Stock = Stock;
    this.Description = Description;
  }

  public ToString(): string {
    return `${this.Description}`;
  }
}
