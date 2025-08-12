package constructor;
class Human{
    private int age;
    private String name;
   //Default Constructor
    public Human(){ 
        age=12;
        name="prathamesh";
    }

    //Parameterized Constructor
    public Human(int a,String val){
          this.age=a;
          this.name=val;
    }
    public void setAge(int a){
          this.age=a;
    }
    public int getAge(){
        return age;
    }

    public void setName(String val){
         this.name=val;
    }
    public String getName(){
        return name;
    }
}
public class DefaultConstructorAndParameterizedConstructor {
    public static void main(String[] args) {
        //Default construtor
        Human obj=new Human();
        System.out.println("Name :"+obj.getName()+" Age : "+obj.getAge());

        obj.setName("abc");
        System.out.println(obj.getName());

        ///Parameterized constructor
        Human obj1=new Human(9,"lmn");
        System.out.println(obj1.getAge());
    }
}
//for running the above program 
// PS C:\Users\hp\Desktop\java\JavaOOP> javac constructor/DefaultConstructor.java
// PS C:\Users\hp\Desktop\java\JavaOOP> java constructor/DefaultConstructor