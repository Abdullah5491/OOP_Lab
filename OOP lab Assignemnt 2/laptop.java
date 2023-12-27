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
        return String.format("Category= laptop , RAM='%s' GB, Screensize='%s' Inches, power=%d, warranty='%s', name='%s', price=%.2f Rs, stockquantity=%d, productID=%d",
                RAM, Screensize, power, warranty, name, price, stockquantity, productID);
    }

}
