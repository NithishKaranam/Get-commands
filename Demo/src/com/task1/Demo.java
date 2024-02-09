package com.task1;
import java.util.*;
public class Demo {
     public static void main(String[] args) {
		Employee e1=new Employee("vamshi","hyderabad");
		Employee e2=new Employee("gopi","kphp");
		Employee e3=new Employee("krishna","nizampet");
		System.out.println("1.Read Employee");
		System.out.println("2.Read multi Employee");
		System.out.println("3.Delet a Employee");
		System.out.println("4.update a Employee");
		System.out.println("\n");
		System.out.println("please seslect your option");
		Map<Integer,Employee> m=new HashMap<Integer,Employee>();
		m.put(100, e1);
		m.put(102,e2);
		m.put(103, e3);
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		switch(option)
		{
		case 1:{
			System.out.println("your option is to read Employee record");
			System.out.println("select Employee Record");
			int getId=sc.nextInt();
			Employee read=m.get(getId);
			System.out.println(read);
			break;
			
		}
		case 2:
		{
			System.out.println("your opion is to read multiple records");
			System.out.println("your fetching multiple records");
			Set set=m.entrySet();
			Iterator itr=set.iterator();
			while(itr.hasNext());
			{
				System.out.println(itr.next());
			}
			break;
		}
		case 3:
		{
			System.out.println("your opion is to delect employee id");
			System.out.println("select which record your going to delete");
			int getId=sc.nextInt();
			m.remove(getId);
			System.out.println("record delete successfully ");
			break;
		}
		case 4:
		{
			System.out.println("your opion is to update employee record");
			System.out.println("select ehich record your going to update");
			int getId=sc.nextInt();
			System.out.println("Insert employee name");
			Employee update=m.get(getId);
			System.out.println(update .getEmpName()+" " +update.getEmpAddress());
			update.setEmpAddress("banglore");
			System.out.println("after update Employee Record");
			System.out.println(update.getEmpName()+" " +update.getEmpAddress());
			break;
		}

			case 5:
			{
				System.out.println("your option is insert employree record");
				System.out.println("insert Employee record data key");
				int key=sc.nextInt();
				System.out.println("insert Employee Name ");
				String empName=sc.next();
				System.out.println("insert Employee Address");
				System.out.println("\n");
				String empAddress=sc.next();
				Employee e=new Employee(empName,empAddress);
				m.put(key, e);
				System.out.println("After insert employee record");
				System.out.println(m);
				break;

			}
		default:{
			System.out.println("Entered options doesn't exist");
		}
		}
		
	}
}
