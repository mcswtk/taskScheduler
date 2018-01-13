package taskScheduler;

import java.util.List;

public class TestReading {

	public static void main(String[] args) {
		
		 List<Task> pracownicy
   		 = serviceCSV.readTasks("tasks.csv");
   	 
   	 System.out.println("Reading... " + pracownicy.size() + " tasks");
   	 
   	 for (Task pracownik : pracownicy) {
   		 System.out.println(" * " + pracownik);
   	 }
    }

}
