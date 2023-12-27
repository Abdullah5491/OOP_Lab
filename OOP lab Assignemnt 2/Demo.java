public class Demo {
    public static void main(String[] args) {

        smartphones s1 =new smartphones("Oppo",2000,4,4,222,"12-21-2023","window","14 inch","40 mp");
        Sitting  sit1 =new Sitting("Bed",3000,4,3,"wood",4,4,3,"40 kg");
        InventoryManagement I1= new InventoryManagement(500);
        laptop L1=new laptop("HP",50000,5,121,455,"20/10/2022","4gb","13 ich");
        Product p1=new Product("a",20,4,22);

//        I1.productlist.add(p1);
//        I1.pro2ductlist.add(s1);
//        I1.productlist.add(sit1);

        I1.add(s1);
        I1.add(sit1);
        I1.add(L1);


       // System.out.println(I1.productlist);

        //System.out.println(I1.productlist.get(0));
       // System.out.println(I1.list[0]);
        //I1.remove(p1);
        //System.out.println();
       // System.out.println(I1.Search(p1));

        //I1.displayList();2
        //I1.updateProduct(p1,p2);
        //I1.displayList();

       // System.out.println(I1.search(3121));
        //System.out.println(I1.search("Car"));
       // I1.updateInventoryCapacity(2);
    // I1.displayList();
   // System.out.println(I1.calculateTotalstock());
       userInterface u1=new userInterface(I1);
        u1.userinterface();
//          I1.displayList();
     I1.Displaystats();


    }

}
 