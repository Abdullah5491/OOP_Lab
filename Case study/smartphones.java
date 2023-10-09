public class smartphones extends Electonics{
    String Operatingsystem;
    String Screensize;
    String Cameraresolution;

    public smartphones(String name, double price, int stockquantity, int productID, int power, String warranty, String operatingsystem, String screensize, String cameraresolution) {
        super(name, price, stockquantity, productID, power, warranty);
        Operatingsystem = operatingsystem;
        Screensize = screensize;
        Cameraresolution = cameraresolution;
    }

    @Override
    public String toString() {
        return "smartphones{" +
                "Operatingsystem='" + Operatingsystem + '\'' +
                ", Screensize='" + Screensize + '\'' +
                ", Cameraresolution='" + Cameraresolution + '\'' +
                ", power=" + power +
                ", warranty='" + warranty + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stockquantity=" + stockquantity +
                ", productID=" + productID +
                '}';
    }
}
