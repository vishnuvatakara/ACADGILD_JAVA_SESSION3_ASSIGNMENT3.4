
public class StudentResultProcesing extends Student {
	public void dispaly()
	{
		System.out.println("the student details you enterd and result are");
		System.out.println();
		System.out.printf("student name :"+getName());
		System.out.printf("student class :"+getClas());
		System.out.printf("\nstudent roll number :"+getRolno());
		System.out.println("\nstudent phone num :"+getPhone());
		if(avg>=75)
			System.out.println("passed");
		else
			System.out.println("failed");


	}
	public static void main(String args[])
	{
		StudentResultProcesing st=new StudentResultProcesing();
		st.dispaly();
		
	}

}
