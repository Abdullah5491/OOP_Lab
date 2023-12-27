import javax.swing.text.StyleContext;
import java.util.InputMismatchException;
import java.util.Scanner;

public class userInterface {

    int add,error=0;
    int remove;
    int choice;
    int update;
    int ID, IDprev;
    String name, capacity;
    double price, length, width, height;
    int stockqty;
    int exit=1;
    int power, nutrients;
    String decibel, screensize, Camerares, OS, warranty, Ram, weight, material, shape;

    Scanner s1 = new Scanner(System.in);

    InventoryManagement I1;

    public userInterface(InventoryManagement inventory)
    {
        this.I1 = inventory;
    }

    public void commondetails() {
        System.out.println("Enter the Product ID");
        while (error==0){
            try {
                ID = s1.nextInt();
                for (int i = 0; i < InventoryManagement.counter; i++) {
                    if (I1.list[i].getProductID() == ID) {
                        System.out.println("Product with same ID is Already present");
                        System.out.println("Please enter valid ID");
                        error=0;
                    }
                    else error=1;
                }
            }catch (InputMismatchException e){
                error=0;
                System.out.println("Please enter valid ID");
                ID = s1.nextInt();
                error=1;

            }
        }

        System.out.println("Enter the name of the product");
        s1.nextLine();
        name = s1.nextLine();
        System.out.println("Enter the Price of the product");
        try {
            price = s1.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid number");

        }

        System.out.println("Enter the Stock Quantity of the product");
        try {
            stockqty = s1.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Please enter valid number");
        }


    }

    public void electronics() {
        System.out.println("Enter the Power of device in watts");
       try {
            power = s1.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Please enter valid number");

        }

        System.out.println("Enter the Warranty end date of device");
        s1.nextLine();
        warranty = s1.nextLine();
    }

    public void userinterface() {
        do {
                System.out.println("\t\t\tWelcome to Our Store\n");
                System.out.println("Please select the Option\n");

                System.out.println("Search product =1 \nAdd Product = 2\nRemove Product= 3\nUpdate Product = 4");
                try {
                    choice = s1.nextInt();
                }
                catch (InputMismatchException e){
                    System.out.println("Please enter a valid number");
                }

                if (choice == 1) {
                    System.out.println("Please enter the ID  of the Product");
                    try {
                        ID = s1.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("Please enter a valid ID");
                    }
                    System.out.println(I1.search(ID));
                } else if (choice == 2) {
                    System.out.println("Please Select the Category of the  Product");
                    System.out.println("Electonics= 1\nGroceries=2\nFurniture=3");
                    choice = s1.nextInt();
                    if (choice == 1) {
                        System.out.println("Please Select the Sub-Category");
                        System.out.println("Audio Devices=1\nSmartphones=2\nLaptops=3");
                        try {
                            choice = s1.nextInt();
                        }
                        catch (InputMismatchException e){
                            System.out.println("Please enter a valid number");
                        }
                        if (choice == 1) {
                            commondetails();
                            electronics();
                            System.out.println("Enter the Volume index of device in decibel");
                            decibel = s1.nextLine();
                            audiodevices A1 = new audiodevices(name, price, stockqty, ID, power, warranty, decibel);
                            I1.add(A1);
                            System.out.println("\nYou product is successfully Added\n");

                        } else if (choice == 2) {
                            commondetails();
                            electronics();
                            System.out.println("Enter the Operating System of the device");
                            OS = s1.nextLine();
                            System.out.println("Enter the Camera Resolution");
                            Camerares = s1.nextLine();
                            System.out.println("Enter the Screen Size");
                            screensize = s1.nextLine();
                            smartphones S1 = new smartphones(name, price, stockqty, ID, power, warranty, OS, Camerares, screensize);
                            I1.add(S1);
                            System.out.println("\nYou product is successfully Added\n");
                        } else if (choice == 3) {
                            commondetails();
                            electronics();
                            System.out.println("Enter the Ram of Laptop");
                            Ram = s1.nextLine();
                            System.out.println("Enter the Screen Size of laptop");
                            screensize = s1.nextLine();
                            laptop L1 = new laptop(name, price, stockqty, ID, power, warranty, Ram, screensize);
                            I1.add(L1);
                            System.out.println("\nYou product is successfully Added\n");

                        } else {
                            System.out.println("Invalid input");
                        }
                    } else if (choice == 2) {
                        commondetails();
                        System.out.println("Enter the expiry date of the Product");
                        warranty = s1.nextLine();
                        System.out.println("Enter the weight of the Product");
                        weight = s1.nextLine();
                        System.out.println("Enter the nutritional value of the Product");
                        try {
                            nutrients = s1.nextInt();
                        }
                        catch (InputMismatchException e){
                            System.out.println("Please enter valid number");
                        }
                        Groceries G1 = new Groceries(name, price, stockqty, ID, warranty, weight, nutrients);
                        I1.add(G1);
                    } else if (choice == 3) {
                        System.out.println("Please Select the Sub-Category");
                        System.out.println("Tables=1\nSitting=2");
                        try {
                            choice = s1.nextInt();
                        }
                        catch (InputMismatchException e){
                            System.out.println("Please enter a valid number");
                        }
                        if (choice == 1) {
                            commondetails();
                            System.out.println("Enter the material type");
                            material = s1.nextLine();
                            System.out.println("Enter the length,width and height");
                            length = s1.nextDouble();
                            width = s1.nextDouble();
                            height = s1.nextDouble();
                            System.out.println("Enter the shape of Furniture");
                            tables t1 = new tables(name, price, stockqty, ID, material, length, width, height, shape);
                            System.out.println("\nYou product is successfully Added\n");
                        } else if (choice == 2) {
                            commondetails();
                            System.out.println("Enter the material type");
                            material = s1.nextLine();
                            System.out.println("Enter the length,width and height");
                            try {
                                length = s1.nextDouble();
                                width = s1.nextDouble();
                                height = s1.nextDouble();
                            }catch (InputMismatchException e){
                                System.out.println("Please enter length in numerical value");
                            }

                            System.out.println("Enter the load Capacity");
                            capacity = s1.nextLine();
                            Sitting sit1 = new Sitting(name, price, stockqty, ID, material, length, width, height, capacity);
                            System.out.println("\nYou product is successfully Added\n");
                        } else {
                            System.out.println("Invalid input");
                        }


                    } else {
                        System.out.println("Invalid input");
                    }

                } else if (choice == 3) {
                    System.out.println("Enter the id of the product to remove");
                    ID = s1.nextInt();
                    I1.remove(ID);
                    System.out.println("\nYour Product is Successfully removed\n");

                } else if (choice == 4) {
                    System.out.println("Enter the id of the product to Update");
                    try {
                        IDprev = s1.nextInt();
                    }catch (InputMismatchException e){
                        System.out.println("Please enter valid Id");
                    }
                    {
                        System.out.println("Please Select the Category of the  Product");
                        System.out.println("Electonics= 1\nGroceries=2\nFurniture=3");
                        try {
                            choice = s1.nextInt();
                        }
                        catch (InputMismatchException e){
                            System.out.println("Please enter a valid number");
                        }

                        if (choice == 1) {
                            System.out.println("Please Select the Sub-Category");
                            System.out.println("Audio Devices=1\nSmartphones=2\nLaptops=3");
                            choice = s1.nextInt();
                            if (choice == 1) {
                                commondetails();
                                electronics();
                                System.out.println("Enter the Volume index of device in decibel");
                                decibel = s1.nextLine();
                                audiodevices A1 = new audiodevices(name, price, stockqty, ID, power, warranty, decibel);
                                I1.updateProduct(IDprev, A1);
                                System.out.println("\nYour Product is Successfully Updated\n");
                            } else if (choice == 2) {
                                commondetails();
                                electronics();
                                System.out.println("Enter the Operating System of the device");
                                OS = s1.nextLine();
                                System.out.println("Enter the Camera Resolution");
                                Camerares = s1.nextLine();
                                System.out.println("Enter the Screen Size");
                                screensize = s1.nextLine();
                                smartphones S1 = new smartphones(name, price, stockqty, ID, power, warranty, OS, Camerares, screensize);
                                I1.updateProduct(IDprev, S1);
                                System.out.println("\nYour Product is Successfully Updated\n");

                            } else if (choice == 3) {
                                commondetails();
                                electronics();
                                System.out.println("Enter the Ram of Laptop");
                                Ram = s1.nextLine();
                                System.out.println("Enter the Screen Size of laptop");
                                screensize = s1.nextLine();
                                laptop L1 = new laptop(name, price, stockqty, ID, power, warranty, Ram, screensize);
                                I1.updateProduct(IDprev, L1);
                                System.out.println("\nYour Product is Successfully Updated\n");

                            } else {
                                System.out.println("Invalid input");
                            }
                        } else if (choice == 2) {
                            commondetails();
                            System.out.println("Enter the expiry date of the Product");
                            warranty = s1.nextLine();
                            System.out.println("Enter the weight of the Product");
                            weight = s1.nextLine();
                            System.out.println("Enter the nutritional value of the Product");
                            nutrients = s1.nextInt();
                            Groceries G1 = new Groceries(name, price, stockqty, ID, warranty, weight, nutrients);
                            I1.updateProduct(IDprev, G1);
                            System.out.println("\nYour Product is Successfully Updated\n");

                        } else if (choice == 3) {
                            System.out.println("Please Select the Sub-Category");
                            System.out.println("Tables=1\nSitting=2");
                            try {
                                choice = s1.nextInt();
                            }
                            catch (InputMismatchException e){
                                System.out.println("Please enter a valid number");
                            }

                            if (choice == 1) {
                                commondetails();
                                System.out.println("Enter the material type");
                                material = s1.nextLine();
                                System.out.println("Enter the length,width and height");
                                length = s1.nextDouble();
                                width = s1.nextDouble();
                                height = s1.nextDouble();
                                System.out.println("Enter the shape of Furniture");
                                tables t1 = new tables(name, price, stockqty, ID, material, length, width, height, shape);
                                I1.updateProduct(IDprev, t1);
                                System.out.println("\nYour Product is Successfully Updated\n");

                            } else if (choice == 2) {
                                commondetails();
                                System.out.println("Enter the material type");
                                material = s1.nextLine();
                                System.out.println("Enter the length,width and height");
                                length = s1.nextDouble();
                                width = s1.nextDouble();
                                height = s1.nextDouble();
                                System.out.println("Enter the load Capacity");
                                capacity = s1.nextLine();
                                Sitting sit1 = new Sitting(name, price, stockqty, ID, material, length, width, height, capacity);
                                I1.updateProduct(IDprev, sit1);
                                System.out.println("\nYour Product is Successfully Updated\n");

                            } else {
                                System.out.println("Invalid input");
                            }

                        } else {
                            System.out.println("Invalid input");
                        }

                    }

                }
                System.out.println("Enter 0 to exit or press other number to continue");
                  exit=s1.nextInt();

            }while (exit!=0);

}
    }

