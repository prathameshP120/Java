class Human{
    
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age=a;
    }
    public String getName(){
        return name;
    }
    public void setName(String val){
        this.name=val;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.setAge(20);
        obj.setName("Prathamesh");
        obj.age=10;

        System.out.println("Age : "+obj.getAge()+" Name : "+obj.getName());

        
    }
}
