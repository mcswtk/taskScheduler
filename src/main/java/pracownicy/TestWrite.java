package pracownicy;

import java.util.LinkedList;
import java.util.List;

public class TestWrite {

	public static void main(String[] args) {
		 List<Task> tasks = new LinkedList<>();
	   	 tasks.add(new Task("taskE", "Kowalski", "2014-04-23", "kelner"));
	   	 tasks.add(new Task("taskD", "Kowalska", "2013-03-23", "barmanka"));
	   //	 tasks.remove(o)

	   	 System.out.println("Writing to file...");
	   	 serviceCSV.writeToFile(tasks, "test1.csv");
	   	 System.out.println("Done");
	    }

	
	
	}


