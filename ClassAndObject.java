class Calculater {
    int a;   //instance variable 
    //a is available to all non-static methods like print(), add(), etc.
    public void print(){
        System.out.println(a);
    }
    public int add(int n1, int n2) {
        System.out.println("in add");
        int res = n1 + n2;

        return res;
    }
    public void multiply(int n1,int n2){
        System.out.println(n1*n2);
    }
}

public class ClassAndObject {

    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 9;
        Calculater calc = new Calculater(); // calc object is created
        int r1 = calc.add(num1, num2);
        System.out.println(r1);
    }
}

// "In this program, the Calculater class has one property a, and three behaviors: add, multiply, and print. Using the object calc, we call these methods to perform actions. This clearly demonstrates object-oriented principles like encapsulation and code reuse."

//for running 
// PS C:\Users\hp\Desktop\java\JavaOOP> javac classAndobject.java
// PS C:\Users\hp\Desktop\java\JavaOOP> java classAndobject
// Error: Could not find or load main class classAndobject
// Caused by: java.lang.NoClassDefFoundError: classAndobject (wrong name: ClassAndObject)
// PS C:\Users\hp\Desktop\java\JavaOOP> java ClassAndObject
// in add
// 17
