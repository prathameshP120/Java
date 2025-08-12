
abstract class Car
{
//	public void drive()
//	{
//
//	}
	//abstract method without implementation 
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

//abstract subclass which implements one method 
//second  abstract method will get implemented in other subclass which is not abstract 
abstract class WagnoR extends Car
{
//	public void fly()
//	{
//		System.out.println("Flying...");
//	}
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdateWagnoR extends WagnoR   //concrete class
{
	public void fly()
	{
		System.out.println("flying...");
	}
}

public class abstraction {
    public static void main(String[] args) {

      //here only the object of subclass which is not the abstract should be created and you have to use the reference of the parent class 
	  

    	Car obj=new UpdateWagnoR();
    	obj.drive();
    	obj.playMusic();
    }
}

