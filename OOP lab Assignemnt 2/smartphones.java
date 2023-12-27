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
        return String.format("Category= smartphones , Operatingsystem='%s', Screensize='%s' Inches, Cameraresolution='%s', power=%d watt, warranty='%s', name='%s', price=%.2f Rs, stockquantity=%d, productID=%d",
                Operatingsystem, Screensize, Cameraresolution, power, warranty, name, price, stockquantity, productID);
    }

}
