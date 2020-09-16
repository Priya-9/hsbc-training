package day2ClassAssign;

import java.util.Scanner;

public class EmpDb {
	Emp arr[] = new Emp[10];
	private int siz;
	
	public EmpDb()
	{	siz=2;
		arr[0] = new Emp(1, "abc");
		arr[1] = new Emp(2, "xyz");
	}
	
	public void searchbyID(int id)
	{	for(int i=0; i<siz; i++)
		{	if(arr[i].getempID() == id) 
			{
				System.out.println("Found the Employee. Credentials are : "+ arr[i].getempID() + "  " + arr[i].getname());
			}
		}
	}
	
	public void searchbyname(String name)
	{	for(int i=0; i<siz; i++)
		{	if(arr[i].getname().compareTo(name) == 0) 
			{
				System.out.println("Found the Employee. Credentials are : "+ arr[i].getempID() + "  " + arr[i].getname());
			}
		}
	}
	
	public void add(int id, String nam)
	{	if(siz == 10)
			System.out.println("Database full");
		else {
			arr[siz] = new Emp(id, nam);
			siz++;
		}
	}
	
	public void show()
	{	for(int i=0; i<siz; i++)
			System.out.println(arr[i].getempID() + "  " + arr[i].getname());
	}
	
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		EmpDb obj = new EmpDb();
		
		int flag=1, op;
		do
		{
			System.out.println("Your Database : ");
			obj.show();
			System.out.println("Operations : \n1. Search Employee by ID\n2. Search Employee by Name \n3. Add an Employee \nOperations you want to do : ");
			op = sc.nextInt();
			switch(op)
			{	case 1: System.out.println("Enter employee id :");
						int inid;
						inid = sc.nextInt();
						obj.searchbyID(inid);
						break;
			
				case 2: System.out.println("Enter employee name :");
						String nam;
						nam = sc.next();
						obj.searchbyname(nam);
						break;
				
				case 3: System.out.println("Enter Employee id and name :");
						String nam1;
						int inid1;
						inid1 = sc.nextInt();
						nam1 = sc.next();
						obj.add(inid1, nam1);
						break;
			}
			System.out.println("Want to enter more (y or n)");
			char c = 'a';
			c = sc.next().charAt(0);
			if(c == 'y')
				flag = 1;
			
		}while(flag == 1);
		
		
	}
}
