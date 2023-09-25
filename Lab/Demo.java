public class Demo {
    public static void main(String[] args){
  Music M1=new Music("new song","10 min","jazz",new Date(01,03,2023),new Singer("Ali Zafar","Male","Pakistan",new Date(01,03,2002)));
  Music M2=new Music("new song","10 min","jazz",new Date(01,03,2023),new Singer("Ali Zafar","Male","Pakistan",new Date(01,03,2002)));

        System.out.println(M1);

        System.out.println(M1.equals(M2));
    }
}
