package entities;

public class Student {

	public String nome;
	public String email;
	public int room;

	public double[] notasTrimeste = new double[3];
	double somaNota;

	public Student() {

	}

	public Student(String nome, String email, int room) {
		this.nome = nome;
		this.email = email;
		this.room = room;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double notaFinal() {
		somaNota = 0;
		for (int i = 0; i < notasTrimeste.length; i++) {
			somaNota += notasTrimeste[i];
		}
		return somaNota;
	}

	public String toString() {
		if (somaNota >= 60) {
			return "FINAL GRADE = " + String.format("%.2f %nPASS", somaNota);
		} else {
			return "FINAL GRADE = " + String.format("%.2f %nFAILED%nMISSING ", somaNota)
					+ String.format("%.2f POINTS", 60 - somaNota);
		}
	}
}
