import java.util.ArrayList;

public class InventoryManagement {

    Product [] list;
    static int counter = 0;
    int totalstock, laptopstock, smartphonestock,tablestock,sittingstock,Groceriesstock,audiostock;

    double totalvalue;


    public InventoryManagement(int capacity) {
        this.list = new Product[capacity];
    }
    public InventoryManagement(){

    }
    public void updateInventoryCapacity(int capacity){
        this.list = new Product[capacity];
    }


    public boolean add(Object o) {
        Product p = (Product) o;

        for (int i = 0; i < counter; i++) {
            if (this.list[i].getProductID() == p.getProductID()) {
                throw new RuntimeException("Product with the same ID is already present");
            }
        }
        if (counter < list.length) {
            list[counter++] = p;
            return true;
        }

        return false;
    }

    public void remove(Object o) {

        Product p = (Product) o;
        for (int i = 0; i < list.length; i++) {
            if (p.equals(this.list[i])) {
                list[i] = null;
                break;
            }
        }
    }
    public Product search(Object o){

        Product p =(Product) o;
        for (int i = 0; i < list.length; i++) {
            if (p.equals(this.list[i])) {
                return p;
            }
        }
        return null;
    }
    public Product search(int ID){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getProductID()==ID)
                return list[i];
         return null;
    }
    public Product search(String name){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getName().equals(name))
                return list[i];
        return null;
    }
    public void remove(String name) {

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getName().equals(name)) {
                list[i] = null;
                break;
            }
        }
    }
    public void remove(int ID) {

        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getProductID()==ID) {
                list[i] = null;
                break;
            }
        }
    }


    //    public void displayList(){
//        for(Product p:list)
//            if(p!=null)
//                System.out.println(p);
//
//    }
    public void displayList() {
        for (int i = 0; i < list.length; i++)
            if (list[i] != null) {
                System.out.println(list[i]);

            }

    }
    public void updateProduct(Object o1,Object o2){
        Product P1 =(Product) o1;
        Product P2 =(Product) o2;
        for (int i = 0; i < list.length; i++) {
            if (P1.equals(this.list[i])) {
                this.list[i] = P2;
            }
        }
    }
    public void updateProduct(int ID,Object o){
        Product P1 =(Product) o;
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].getProductID()==ID) {
                this.list[i] = P1;
            }
        }
    }
    public void updatePrice(int ID,double price){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getProductID()==ID)
                this.list[i].setPrice(price);

    }
    public void updatePrice(String name,double price){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getName().equals(name))
                this.list[i].setPrice(price);

    }
    public void updateID(String name,int ID){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getName().equals(name))
                this.list[i].setProductID(ID);

    }
    public void updateID(int ID,int id){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getProductID()==ID)
                this.list[i].setProductID(id);

    }
    public void updateStockQty(int ID,int qty){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getProductID()==ID)
                this.list[i].setStockquantity(qty);

    }
    public void updateStockQty(String name,int qty){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i].getName().equals(name))
                this.list[i].setStockquantity(qty);

    }
    public int calculateTotalstock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null ) {
                totalstock +=list[i].getStockquantity();

            }
        return totalstock ;
    }
    public double getTotalvalue(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null )
        totalvalue +=list[i].getPrice();
        return totalvalue;
    }
    public int laptopstock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i] instanceof laptop) {
                laptopstock +=list[i].getStockquantity();
            }
        return laptopstock;
    }
    public int Smartphonestock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i] instanceof smartphones) {
                smartphonestock+=list[i].getStockquantity();
            }
        return smartphonestock;
    }
    public int tablestock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i] instanceof tables) {
               tablestock+=list[i].getStockquantity();
            }
        return tablestock;
    }
    public int Sittingstock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i] instanceof Sitting) {
                sittingstock+=list[i].getStockquantity();
            }
        return sittingstock;
    }
    public int GroceriesStock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i] instanceof Groceries) {
                Groceriesstock+=list[i].getStockquantity();
            }
        return Groceriesstock;
    }
    public int AudioDevicesstock(){
        for (int i = 0; i < list.length; i++)
            if (list[i] != null && list[i] instanceof audiodevices) {
                audiostock+=list[i].getStockquantity();
            }
        return audiostock;
    }
    public void Displaystats(){
        System.out.println("Total Stock of Laptops ="+laptopstock());
        System.out.println("Total Stock of Smart Phones = "+Smartphonestock());
        System.out.println("Total Stock of Audio Devices = "+AudioDevicesstock());
        System.out.println("Total Stock of Groceries Stock = "+GroceriesStock());
        System.out.println("Total Stock of Sitting Furniture = "+Sittingstock());
        System.out.println("Total Stock of Tables = "+tablestock());
        System.out.println("Total Value of all products in stock = "+getTotalvalue());
        System.out.println("Total stock Quantity of all products in store = "+calculateTotalstock());
    }
}

