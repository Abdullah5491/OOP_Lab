public class laptop extends Electonics{
    String RAM;
    String Screensize;

    public laptop(String name, double price, int stockquantity, int productID, int power, String warranty, String RAM, String screensize) {
        super(name, price, stockquantity, productID, power, warranty);
        this.RAM = RAM;
        Screensize = screensize;
    }

    @Override
    public String toString() {
        return "laptop{" +
                "RAM='" + RAM + '\'' +
                ", Screensize='" + Screensize + '\'' +
                ", power=" + power +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}
