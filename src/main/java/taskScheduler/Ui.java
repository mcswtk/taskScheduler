package taskScheduler;

import java.util.List;
import java.util.Scanner;

public class Ui {
	static String menu(int numer) {
		switch (numer) {
		case 1:
			return "1. Load tasks list";
		case 2:
			return "2. Add new task";
		case 3:
			return "3. Remove task";
		case 4:
			return "4. Exit";

		default:
			throw new IllegalArgumentException("wrong input number");
		}

	}

	public static void main(String[] args) {
		System.out.println("Menu:");
		System.out.println("1. Load tasks list");
		System.out.println("2. Add new task");
		System.out.println("3. Remove task");
		System.out.println("4. Exit");
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose menu item number: ");
			System.out.println(">>");
			int numer = sc.nextInt();

			String nameMenu = menu(numer);

			if (numer == 1) {
				List<Task> tasks = serviceCSV.readTasks("tasks.csv");

				System.out.println("Reading... " + tasks.size() + " tasks");

				for (Task task : tasks) {
					System.out.println(" * taskId: " + tasks.indexOf(task) + "-> " + task);
				}
				System.out.println("\n");
				tasks.add(serviceCSV.addTask());

				System.out.println("\n");
				System.out.println("Task will be saved:");
				for (Task task : tasks) {

					System.out.println(task);
				}

				System.out.println("Writing to file...");
				serviceCSV.writeToFile(tasks, "test1.csv");
				System.out.println("Done");
			}

			else if (numer == 4) {
				System.out.println("You are close scheduler");
				return;
			}
			System.out.println("To jest " + nameMenu);
		} catch (Exception e) {
			System.out.println("Był wyjątek " + e);
		}
	}
}
