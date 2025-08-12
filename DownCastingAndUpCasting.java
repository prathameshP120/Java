class A{
    public static void show1(){
        System.out.println("in show A");
    }
}
class B extends A{
     public static void show2(){
        System.out.println("in show B");
    }
}
public class DownCastingAndUpCasting {
    public static void main(String[] args) {
          A obj = new B();  // Upcasting: B object in A reference
        obj.show1();      // Valid: show1() is in A

        // obj.show2();   // ❌ Error: show2() is not visible via A reference

        // ✅ Downcasting
         B  obj1=((B) obj); // Now we can access show2()
         obj1.show2();
    }
}

