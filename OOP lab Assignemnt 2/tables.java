public class tables extends Furniture{
    String Shape;

    public tables(String name, double price, int stockquantity, int productID, String materialtype, double length, double width, double height, String shape) {
        super(name, price, stockquantity, productID, materialtype, length, width, height);
        Shape = shape;
    }

    @Override
    public String toString() {
        return String.format("Category= tables , Shape='%s', materialtype='%s', length=%f meter, width=%f meter, height=%f meter, name='%s', price=%.2f Rs, stockquantity=%d, productID=%d",
                Shape, materialtype, length, width, height, name, price, stockquantity, productID);
    }

}
