public class audiodevices extends Electonics{
    String volumeindex;

    public audiodevices(String name, double price, int stockquantity, int productID, int power, String warranty, String volumeindex) {
        super(name, price, stockquantity, productID, power, warranty);
        this.volumeindex = volumeindex;
    }

    @Override
    public String toString() {
        return String.format("Category= audiodevices , volumeindex='%s', power=%d watt, warranty='%s', name='%s', price=%.2f Rs, stockquantity=%d, productID=%d",
                volumeindex, power, warranty, name, price, stockquantity, productID);
    }

}
