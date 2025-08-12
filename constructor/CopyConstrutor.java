package constructor;
class Person{
    private int age;
    private String name;

    //Regular constructor
    public Person(int a,String val){
        this.age=a;
        this.name=val;
    }

    //copy constructor 
    public Person(Person obj){  //constructor that takes an object of the same class 
        this.age=obj.age;
        this.name=obj.name;
        
    }

    //Display Mathod 
    public void display(){
        System.out.println("Name : "+name+" Age : "+age);
    }
}
public class CopyConstrutor {
    public static void main(String[] args) {
        //creating the original object using the constructor
        Person p1=new Person(10,"Abc");
        
        //creating copied object using the copy construtor 
        Person p2=new Person(p1);

        //display both the object 

        System.out.println("Original Person");
        p1.display();

        System.out.println("Copied Person");
        p2.display();

    }
}
