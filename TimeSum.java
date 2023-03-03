import java.util.Scanner;

public class TimeSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER HOURS AND MINUTES OF TIME1= ");
		Time t1=new Time();
		t1.hrs=sc.nextInt();
		t1.min=sc.nextInt();

		System.out.println("ENTER HOURS AND MINUTES OF TIME2= ");
		Time t2=new Time();
		t2.hrs=sc.nextInt();
		t2.min=sc.nextInt();

		t2.addTime(t1.hrs,t1.min);
	}
}

class Time
{
	int hrs;
	int min;

	void addTime(int hrs1,int min1)
	{
		hrs=hrs1+hrs;
		min=min1+min;

		if(min>=60)
		{
			min=min-60;
			hrs++;
		}

		System.out.println("TOTAL TIME= "+hrs+":"+min);
	}
}