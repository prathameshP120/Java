package Inheritance;
class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
          return (n1-n2);
    }

}

//AdvCalc inherites the properties from the parent class(Calc)
class AdvCalc extends Calc{
      public int multi(int n1,int n2){
          return n1*n2;
      }
      public int division(int n1,int n2){
         return n1/n2;
      }

} 
//Single Level Inheritance => here AdvCalc is taking the features form the Calc class 

public class Inheritance{
    public static void main(String[] args) {
        AdvCalc obj=new AdvCalc();
        int r1=obj.add(3, 5);
        int r2=obj.sub(4, 2);
        int r3=obj.multi(8, 7);
        int r4=obj.division(10, 5);
        System.out.println("add : "+r1+"  sub : "+r2+"   multification : "+r3+"   division : "+r4);
    }
}
