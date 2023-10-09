public class Product {
    String name;
    double price;
    int stockquantity;
    int productID;

    public Product(String name, double price, int stockquantity, int productID) {
        this.name = name;
        this.price = price;
        this.stockquantity = stockquantity;
        this.productID = productID;
    }
   public void addproduct(){

   }
    public void updateproduct(){

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}