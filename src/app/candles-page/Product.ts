export abstract class Product {
    private id: string;
    private productType: string;
    private description: string;
    private stock: number;
    private price: number;
    private created: Date;

    constructor(id: string, productType: string, description: string, stock: number, price: number, created: Date) {
        this.id = id;
        this.productType = productType;
        this.description = description;
        this.stock = stock;
        this.price = price;
        this.created = created;
    }
}