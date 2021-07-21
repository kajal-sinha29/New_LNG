package hacker_Rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LotterySystem {
	
	static void lotterySystem() {
		
Scanner sc = new Scanner(System.in);
		
		//int arr[] = new int[12];
		List <Integer> list = new ArrayList<Integer>();
		//int arr[] = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
		
		System.out.print("Enter the number of tickets : ");
		int t = sc.nextInt();
		t = t+1;
		int arr[] = new int[t];
		
		for(int i=0; i<t;i++) {
			arr[i] = i;
		}
		
		System.out.println("Tickets are : ");
		for(int i=0; i<arr.length; i++)
		{
	
			int sum = 0;
			int r;
			int x = arr[i];
			int temp = x;
			
			x = x-1;
			sum = x%9;
			sum = sum+1;
			
			
			list.add(sum);
			if(i>0) {
				System.out.print(temp+",  ");
					
			}		
		}
		
		//System.out.println("\nEnter the winner lottery : ");
		//int s = sc.nextInt();
		int max;
		if(arr.length<10) {
			max = t-1;
		}
		else {
			max = 9;
		}
		int min = 1;
		int range = max - min + 1;
		int s=0;
		 for (int i = 0; i < 10; i++) {
	            s = (int)(Math.random() * range) + min;
		 }
		 System.out.println("\nLottery ticket number is : "+s);
		 
		System.out.println("Winner ticket numbers are : ");
		for(int k=0; k<list.size(); k++) {
			if(list.get(k)==s) {
				System.out.println(arr[k]);
				
			}
		}
		
		
	}
	
	
	public static void main(String args[]) {
		
		lotterySystem();
		System.out.println("Just adding additional features second !!!");
		System.out.println("Just adding additional features again feature branch 2!!!");
		}
}
