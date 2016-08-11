package exercise_step4_7_06;

public class TitledSalariedEmployee extends SalariedEmployee{

	String title;
	
	public TitledSalariedEmployee() {
		super();
		this.title = "No title";
	}
	
	
	/**
	 * 
	 * @return
	public String getName() {
		return title + name;
	}
	
	public String getTitle() {
		return (title + super.getName);
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return (super.toString + "\n$" + salary + " per year")
	}

	 * Exercise 7-20 but for TitledSalariedEmployee
	public boolean equals(Object otherObject) {
		if (otherObject == null) {
			return false;
		} else if (this.getClass() != otherObject.getClass()) {
			return false;
		} else {
			TitleSalariedEmployee otherTitledSalariedEmployee = (Employee)otherObject;
			return (super.equals(otherTitledSalariedEmployee
					&& this.title.equals(otherTitledSalariedEmployee.title));
		}
	}
	*/
	
}