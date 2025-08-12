class Calculator{
      public int add(int n1,int n2){
          return n1+n2;
      }
}
class AdvCalculator extends Calculator{
     public int add(int n1,int n2){
        return n1+n2+1;

     }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvCalculator obj=new AdvCalculator();
        int r1=obj.add(9, 9);
        System.out.println(r1);
    }
}
