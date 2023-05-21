export abstract class Product {
  private _id: string;
  private _productType: string;
  private _description: string;
  private _stock: number;
  private _price: number;
  private _created: Date;

  protected constructor(id: string, productType: string, description: string, stock: number, price: number, created: Date) {
    this._id = id;
    this._productType = productType;
    this._description = description;
    this._stock = stock;
    this._price = price;
    this._created = created;
  }

  getStock(): string {
    return String(this._stock);
  }

  getPrice(): string {
    return String(this._price);
  }

  getId(): string {
    return this._id;
  }

  getProductType(): string {
    return this._productType;
  }

  getDescription(): string {
    return this._description;
  }

  getCreated(): Date {
    return this._created;
  }
}
