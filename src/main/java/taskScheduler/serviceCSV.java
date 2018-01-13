package taskScheduler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// przyklad "klasy narzedziowej" (util, utility class)
public class serviceCSV {

	public static List<Task> readTasks(String plik)  {
		 
		 List<Task> lista = new ArrayList<>();
	   	 
	   	 try(Scanner sc = new Scanner(new File(plik))) {
	   		 while(sc.hasNextLine()) {
	   			 String linia = sc.nextLine();
	   			 String[] pola = linia.split(";");
	   			 // System.out.println("pola: " + Arrays.toString(pola));
	   			 
	   		
	   			 Task p = new Task(pola[0], pola[1], pola[2], pola[3]);
	   			 lista.add(p);
	   		 }
	   	 } catch (FileNotFoundException e) {
	   		 e.printStackTrace();
	   	 }
	   	 return lista;
	    }
	    
	    public static void writeToFile(List<Task> tasks, String plik) {
	   	 try(PrintWriter out = new PrintWriter(plik)) {
	   		 for (Task task : tasks) {
	   			 out.print(task.getTask());
	   			 out.print(";");
	   			 out.print(task.getDescription());
	   			 out.print(";");
	   			 out.print(task.getStartDate());
	   			 out.print(";");
	   			 out.print(task.getContacts());
	   			 out.println();
	   		 }
	   	 } catch (FileNotFoundException e) {
	   		 e.printStackTrace();
	   	 }
	    }
	    
	    public static Task addTask() {
	    	 System.out.println("\n");
	    	System.out.println("Enter task data: ");
	    	
	    	System.out.println("task name >> ");
	    	Scanner sc1 = new Scanner(System.in);
			String task = sc1.nextLine();
			
			System.out.println("task decription >> ");
			Scanner sc2 = new Scanner(System.in);
			String description = sc2.nextLine();
			
			System.out.println("task start date >> ");
			Scanner sc3 = new Scanner(System.in);
			String data = sc3.nextLine();
			
			System.out.println("task contacts >> ");
			Scanner sc4 = new Scanner(System.in);
			String contacts = sc4.nextLine();
			
			Task tasks = new Task(task,description,data,contacts);
			
			return tasks;

	    	}
	    
	}


