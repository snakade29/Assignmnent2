package problem;

import java.util.Scanner;

public class Trainer {
	
	public String  name ;
	public String department ;
	public String email ;
	public int id  ;
	
	
	public Trainer() {} 
	
	public Trainer (String Tname,String Tdepartment,String Temail,int Tid)
	{
		name = Tname ;
		department =Tdepartment ;
		email = Temail ;
		id = Tid ;
		
		
	}
	public static void  input(Trainer[] t)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0 ,j=1 ; i < t.length ;i++,j++)
		{
			 System.out.println("Please Enter the name :");
			 String Tname =sc.nextLine(); 
			 System.out.println("Please Enter the department   :");
			 String Tdepartment =sc.nextLine(); 
			 System.out.println("Please Enter the  email :");
			 String Temail =sc.nextLine();
			 int Tid =j ;
			 t[i]=new Trainer(Tname,Tdepartment,Temail,Tid);
			 
			 
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter the Number of Student :");
		int num = sc.nextInt();
		Trainer[] t = new Trainer[num];
		input(t);
		System.out.print("Please Enter which Student  Number  you are looking for :");
		num=sc.nextInt();
		for (int i=0 ,j=1; i<num; i++,j++)
		{
			int k =j -1 ;
			if(num == t[k].id) {
				
				System.out.println(t[k].id);
				System.out.println(t[k]. name);
				System.out.println(t[k]. department);
				System.out.println(t[k].email);
			}
		}
		
		 
		

	}

}
