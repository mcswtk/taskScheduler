package taskScheduler;

import java.util.Scanner;

public class testS {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		String task = sc1.nextLine();
		
		Scanner sc2 = new Scanner(System.in);
		String description = sc2.nextLine();
		
		Scanner sc3 = new Scanner(System.in);
		String data = sc3.nextLine();
		
		Scanner sc4 = new Scanner(System.in);
		String contacts = sc4.nextLine();
		
		Task taskF = new Task(task,description,data,contacts);
		
		System.out.println(taskF);
	}

}
