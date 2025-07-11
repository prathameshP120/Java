public class Class_Obj_Computer {
    public static void main(String[] args) {
        Computer c=new Computer();
        c.playmusic();
        
        
    }
}
class Computer{
    int x=9;
    public void playmusic(){
        System.out.println("Play music");
        System.out.println(x);
    }
    public String getMeApen(int cost){
           return "Pen";
    }
}