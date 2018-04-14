package Assigment;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int tot=0;
		double avg = 0;
		
		System.out.println("Enter Number of subjectd =>");
		int sbj=sc.nextByte();
		int a[]=new int[sbj];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter Marks");
			a[i]=sc.nextInt();
			tot=tot+a[i];
		
		}
		sc.close();
		avg=tot/a.length;
		System.out.print("\n");
		System.out.println("Total is ="+tot);
		System.out.println("Avaerage is ="+avg);
		
		
	
		}

}
