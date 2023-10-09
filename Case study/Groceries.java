public class Groceries extends Product{
    String Expirydate;
    String weight;
    int nutritionvalue;

    public Groceries(String name, double price, int stockquantity, int productID, String expirydate, String weight, int nutritionvalue) {
        super(name, price, stockquantity, productID);
        Expirydate = expirydate;
        this.weight = weight;
        this.nutritionvalue = nutritionvalue;
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "Expirydate='" + Expirydate + '\'' +
                ", weight='" + weight + '\'' +
                ", nutritionvalue=" + nutritionvalue +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}
