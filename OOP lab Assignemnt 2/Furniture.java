public abstract class Furniture extends Product{
    String materialtype;
    double length;
    double width;
    double height;

    public Furniture(String name, double price, int stockquantity, int productID, String materialtype, double length, double width, double height) {
        super(name, price, stockquantity, productID);
        this.materialtype = materialtype;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "materialtype='" + materialtype + '\'' +
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

