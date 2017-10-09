import java.util.Scanner;

public class Student {
	//initializing variables
	private String name,clas,phone;
	private int rolno;
	int mark1,mark2,mark3;
	float avg;
	//getter setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setClas(String clas) {
		this.clas = clas;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String getClas() {
		return clas;
		
	}
	public int getRolno() {
		return rolno;
	}
	public String getPhone() {
		return phone;
	}
	Student() //inside default constructor declaring all the input statements 
	{	System.out.println("enter the student details");
		Scanner s=new Scanner(System.in);
		System.out.println("enter the student name");
		String name=s.nextLine();
		setName(name);
		System.out.println("enter the student class");
		String clas=s.nextLine();
		setClas(clas);
		System.out.println("enter the student rollnum");
		int rolno=s.nextInt();
		setRolno(rolno);
		System.out.println("enter the student phone num");
		String phone=s.next();
		setPhone(phone);
		System.out.println("enter the student three subject marks");
		mark1=s.nextInt();
		mark2=s.nextInt();
		mark3=s.nextInt();
		result(mark1,mark2,mark3,rolno);
		
	}
	public void result(int mark1,int mark2,int mark3,int rolno)
	{
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		avg=(mark1+mark2+mark3)/3;
		
		
		
	}
	
	public static void main(String args[])
	{	
		Student obj=new Student();
		
		
	}

}
