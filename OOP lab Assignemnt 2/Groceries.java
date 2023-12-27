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
        return String.format("Category= Groceries , Expirydate='%s', weight='%s', nutritionvalue=%.2f, name='%s', price=%.2f Rs, stockquantity=%d, productID=%d",
                Expirydate, weight, nutritionvalue, name, price, stockquantity, productID);
    }

}
