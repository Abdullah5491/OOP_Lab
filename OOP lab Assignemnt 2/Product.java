public  class Product {
    String name;
    double price;
    int stockquantity;
    int productID;
    InventoryManagement I1;

    public Product(String name, double price, int stockquantity, int productID) {
            this.name = name;
            this.price = price;
            this.stockquantity = stockquantity;
            this.productID = productID;
        }

        public int getProductID () {
            return productID;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public double getPrice () {
            return price;
        }

        public void setPrice ( double price){
            this.price = price;
        }

        public int getStockquantity () {
            return stockquantity;
        }

        public void setStockquantity ( int stockquantity){
            this.stockquantity = stockquantity;
        }

        public void setProductID ( int productID){
            this.productID = productID;
        }

        //    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", stockquantity=" + stockquantity +
//                ", productID=" + productID +
//                '}';
//    }
        @Override
        public String toString () {
            return String.format("Category= Product , name= %s ,price= %.2f Rs ,stockquantity= %d ,productID= %d", name, price, stockquantity, productID);
        }
    }

