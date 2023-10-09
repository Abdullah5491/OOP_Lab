public class Sitting extends Furniture{
    String loadcapacity;

    public Sitting(String name, double price, int stockquantity, int productID, String materialtype, double length, double width, double height, String loadcapacity) {
        super(name, price, stockquantity, productID, materialtype, length, width, height);
        this.loadcapacity = loadcapacity;
    }

    @Override
    public String toString() {
        return "Sitting{" +
                "loadcapacity='" + loadcapacity + '\'' +
                ", materialtype='" + materialtype + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}
