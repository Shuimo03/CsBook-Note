package chapter5;

public class Overloading {

   public int test(int t1){
       return t1;
   }

   public int test(int t2,int t3){
       return t2+t3;
   }

    public static void main(String[]args){
      Overloading overloading= new Overloading();
      int test = overloading.test(147483647);
      System.out.print(test);
    }
}
