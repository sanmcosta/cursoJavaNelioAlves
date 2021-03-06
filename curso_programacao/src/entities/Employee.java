package entities;

public class Employee {

	private int id;
	private String name;
	private double grossSalary;
	public double tax;

	public Employee() {

	}

	public Employee(int id, String name, double grossSalary) {
		setId(id);
		setName(name);
		setGrossSalary(grossSalary);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percente) {
		if (percente < 1)
			percente *= 100;
		grossSalary = grossSalary * (1 + (percente / 100));
	}

	public String toString() {
		return name + " , $ " + String.format("%.2f", netSalary());
	}

}
