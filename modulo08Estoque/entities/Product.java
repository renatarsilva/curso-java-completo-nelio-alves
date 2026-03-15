package modulo08Estoque.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    // this.quantity representa o atribitubo quantity da classe e nao o parametro quantity

    public void addProcuts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $"
                + String.format("%.2f", price) +
                ", " +
                quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());

    }
}
