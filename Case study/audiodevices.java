public class audiodevices extends Electonics{
    String volumeindex;

    public audiodevices(String name, double price, int stockquantity, int productID, int power, String warranty, String volumeindex) {
        super(name, price, stockquantity, productID, power, warranty);
        this.volumeindex = volumeindex;
    }

    @Override
    public String toString() {
        return "audiodevices{" +
                "volumeindex='" + volumeindex + '\'' +
                ", power=" + power +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}
