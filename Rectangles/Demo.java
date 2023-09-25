public class Demo {
    public static void main(String[] args){
        Rectangle R1=new Rectangle(10,20,13,43);
        Rectangle R2=new Rectangle(20,1,299,332);
        Rectangle minrec= R1.getMinrec(R1,R2);

        System.out.println("The Area of the rectangle is "+R1.FindArea());
        System.out.println("The circumfernce of rectangle is "+R1.Findcircumference());
        System.out.println("The Smaller rectangle is "+minrec);
        if (R1.isOverlapping(R2)) {
            System.out.println("R1 and R2 are overlapping.");
        } else {
            System.out.println("R1 and R2 are not overlapping.");
        }

    }
}
