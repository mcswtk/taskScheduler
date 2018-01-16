package taskScheduler;
/*
 * this is a test
 */
import java.time.LocalDate;

public class Task {
	
    private String task;
    private String description;
    private LocalDate startDate;
    private String contacts;
    
    
    public Task() {
    }

    
    
    public Task(String task, String description, LocalDate startDate, String contacts) {
		super();
		this.task = task;
		this.description = description;
		this.startDate = startDate;
		this.contacts = contacts;
	}



	public Task(String task, String description, String startDate, String contacts) {
   	 this(task, description, LocalDate.parse(startDate), contacts);
    }

	
    
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getContacts() {
		return contacts;
	}
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contacts == null) ? 0 : contacts.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((task == null) ? 0 : task.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (contacts == null) {
			if (other.contacts != null)
				return false;
		} else if (!contacts.equals(other.contacts))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return task + ", " + description + ", " + startDate + ", "
				+ contacts ;
	}

	
	
}




	


