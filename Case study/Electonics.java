public class Electonics extends Product{
    int power;
    String warranty;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public Electonics(String name, double price, int stockquantity, int productID, int power, String warranty) {
        super(name, price, stockquantity, productID);
        this.power = power;
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return "Electonics{" +
                "power=" + power +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}
