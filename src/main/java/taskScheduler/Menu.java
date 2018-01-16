package taskScheduler;

import java.util.List;
import java.util.Scanner;

public class Menu {
	boolean exit;

	public static void main(String[] args) {

		Menu menu = new Menu();
		menu.runMenu();
	}

	public void runMenu() {
		printHeader();
		while (!exit) {
			printMenu();
			int choise = getinput();
			performActions(choise);
		}
	}

	private void printHeader() {
		System.out.println("+-------------------------------+");
		System.out.println("*	 Welcome to scheduler	*");
		System.out.println("+-------------------------------+");
	}

	private void printMenu() {
		System.out.println("\nPlease make a selection");
		System.out.println("1. Load the tasks");
		System.out.println("2. Add new task");
		System.out.println("3. Remove task");
		System.out.println("4. Exit from scheduler");
	}

	private int getinput() {
		Scanner sc = new Scanner(System.in);
		int choise = -1;
		while (choise < 1 || choise > 4) {
			try {
				System.out.print("\nChoose from menu option : ");
				choise = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid selection, please try again");
			}
		}
		return choise;
	}

	public void performActions(int choise) {
		switch (choise) {
		case 1:
			List<Task> tasks = serviceCSV.readTasks("tasks.csv");
			System.out.println("Reading... " + tasks.size() + " tasks");

			for (Task task : tasks) {
				System.out.println("taskId " + tasks.indexOf(task) + " ; " + task);
			}
			break;
		case 2:
			List<Task> tasksAdd = serviceCSV.readTasks("tasks.csv");
			tasksAdd.add(serviceCSV.addTask());
			System.out.println("Writing to file...");
			serviceCSV.writeToFile(tasksAdd, "tasks.csv");
			System.out.println("Done");
			break;
		case 3:
			System.out.println("Removing task mode...");
			System.out.println("Please choose taskId: ");
			int taskIdRemove;
			Scanner kb = new Scanner(System.in);
			taskIdRemove = kb.nextInt();
			List<Task> tasksRemove = serviceCSV.readTasks("tasks.csv");
			
			tasksRemove.remove(taskIdRemove);
			System.out.println("Writing to file...");
			serviceCSV.writeToFile(tasksRemove, "tasks.csv");
			System.out.println("Done");

			break;
		case 4:
			exit = true;
			System.out.println("Closing scheduler... done");
			break;

		default:
			System.out.println("fatal error...");
		}
	}
}
