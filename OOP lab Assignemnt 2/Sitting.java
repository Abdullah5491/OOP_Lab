public class Sitting extends Furniture{
    String loadcapacity;

    public Sitting(String name, double price, int stockquantity, int productID, String materialtype, double length, double width, double height, String loadcapacity) {
        super(name, price, stockquantity, productID, materialtype, length, width, height);
        this.loadcapacity = loadcapacity;
    }

    @Override
    public String toString() {
        return String.format("Category= Sitting , loadcapacity='%s', materialtype='%s', length=%f meter, width=%f meter, height=%f meter, name='%s', price=%.2f Rs, stockquantity=%d, productID=%d",
                loadcapacity, materialtype, length, width, height, name, price, stockquantity, productID);
    }

}
