package Salarry;
import java.util.Scanner;
public class Employee 
{
public static int initial_salary;
public static int wages;
public static int net_salary;
public static int hour;
public static int taxation;
public static int healthinsurance;
public static int expenses;
public static int hours;
public static int extrahours;
public static int rate;
public static int initial_salaryweek;
public static void main(String args[])
{
System.out.println("enter the wages amount, hourly incomes");
Scanner in = new Scanner(System.in);
int wages = in.nextInt();
System.out.println("enter worked hours in one week");
int hours = in.nextInt();
extrahours = hours - 40;
rate = extrahours * 10 *wages/100;
if (hours > 40)
initial_salaryweek = (wages * 40) + rate ;
else
initial_salaryweek = hours * wages ;
taxation=(wages*25)/100;
healthinsurance=(wages*10)/100;
expenses=taxation+healthinsurance;
initial_salary=wages*160;
net_salary=initial_salary-expenses;
System.out.println("extra hours: " +extrahours);
System.out.println("money from extra hours:" +rate);
System.out.println("daily income incomes " +wages*8);
System.out.println("weekly incomes:" +initial_salaryweek);
System.out.println("monthly gross_salary: "+initial_salary);
System.out.println("netsalary: "+net_salary);
}	
}
class hourlyemployee extends Employee{
public  int hoursalary() 
{
System.out.println("enter the wages amount, incomes per hour");
Scanner in = new Scanner(System.in);
int wages = in.nextInt();
return wages*8;		

}
class weeklyemployee extends Employee{
public  int weeklysalary()
{
System.out.println("enter the salary amount");
Scanner in = new Scanner(System.in);
int wages = in.nextInt();
initial_salary = wages*40;
return initial_salary;
}
}
class monthlyemployee extends Employee{
public  int monthlysalary() {
		System.out.println("enter the salary amount");
		Scanner in = new Scanner(System.in);
	int wages = in.nextInt();
		taxation=(wages*25)/100;
		healthinsurance=(wages*10)/100;
		expenses=taxation+healthinsurance;
		initial_salary=wages*160;
		net_salary=initial_salary-expenses;
	return  net_salary;
	}		
}


public static void main(String args[])
{
System.out.println("enter the salary amount");
Scanner in = new Scanner(System.in);
int wages = in.nextInt();
int initial_salary = in.nextInt();
int net_salary = in.nextInt();
System.out.println("initial_salary:"+ initial_salary);
System.out.println("net_salary:"+ net_salary);
System.out.println("salary" +wages*8);
}
}
