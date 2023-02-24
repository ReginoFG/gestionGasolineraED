package aplicacion.entidades;

public class Repostaje {

	//Atributos
	private int id;
	
	private double litros = 0;
	
	private double importe = 0;
	
	private String fchRepostaje = "aaaaaaaaaa";
	
	private String dni = "aaaaaaaaaa";
	
	private String matricula = "aaaaaaaaaa";
	
	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getFchRepostaje() {
		return fchRepostaje;
	}

	public void setFchRepostaje(String fchRepostaje) {
		this.fchRepostaje = fchRepostaje;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Repostaje [id=" + id + ", litros=" + litros + ", importe=" + importe + ", fchRepostaje=" + fchRepostaje
				+ ", dni=" + dni + ", matricula=" + matricula + "]";
	}	
	
}
