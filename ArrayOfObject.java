class Student{
    int rn;
    String name;
    int mark;
}
public class ArrayOfObject {
    public static void main(String[] args) {
       Student s1=new Student();
		s1.rn=1;
		s1.name="Navin";
		s1.mark=88;
		
		Student s2=new Student();
		s2.rn=2;
		s2.name="Harsh";
		s2.mark=67;
		
		Student s3=new Student();
		s3.rn=3;
		s3.name="Kiran";
		s3.mark=97;

        System.out.println(s1.name + ":"+ s1.mark);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].mark);
		}
		
        
    }
}
