import java.util.Scanner;

public class Attendance
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER STARTING ROLL NO.= ");
		int start=sc.nextInt();

		int absent[]=new int [100];
		int i=0,total=0,countAbsent=0;
		char attendance='1';
		
		while(true)
		{
			System.out.println("ENTER 'y' FOR PRESENT & 'n' FOR ABSENT= ");
			System.out.println("ENTER 0 TO STOP= ");
			System.out.println(start);
			attendance=sc.next().charAt(0);

			if(attendance=='0')
			{
				break;
			}

			if(attendance=='n')
			{
				absent[i]=start;
				countAbsent++;
				i++;
			}

			start++;
			total++;
		}

		System.out.println("TOTAL STUDENTS= "+total);
		System.out.println("NO. OF PRESENT STUDENTS= "+(total-countAbsent));
		System.out.println("NO. OF ABSENT STUDENTS= "+countAbsent);
		String displayAbsent="";
		
		for(i=0;i<countAbsent;i++)
		{
			displayAbsent += absent[i];
			displayAbsent += ", ";
		}
	
		System.out.println("ABSENT ROLL NO. = "+displayAbsent.substring(0,displayAbsent.length()-2));
	}
}