import { Product } from "./Product";

export class Candle extends Product {
  private color: string;
  private scent: string;
  private shape: string;

  constructor(id: string, productType: string, description: string, stock: number, price: number, created: Date, color: string, scent: string, shape: string) {
    super(id, productType, description, stock, price, created);
    this.color = color;
    this.scent = scent;
    this.shape = shape;
  }

  getShape(): string {
    return this.shape;
  }

  getScent(): string {
    return this.scent;
  }

  getImgPath(): string {
    return `assets/images/${this.getId()}.webp`;
  }

  override toString(): string {
    return `${this.getShape()} candle that smells like ${this.getScent().toLowerCase()}.`;
  }
}
