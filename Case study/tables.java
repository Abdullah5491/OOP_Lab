public class tables extends Furniture{
    String Shape;

    public tables(String name, double price, int stockquantity, int productID, String materialtype, double length, double width, double height, String shape) {
        super(name, price, stockquantity, productID, materialtype, length, width, height);
        Shape = shape;
    }

    @Override
    public String toString() {
        return "tables{" +
                "Shape='" + Shape + '\'' +
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
