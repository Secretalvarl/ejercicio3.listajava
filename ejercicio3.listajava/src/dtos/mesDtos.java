package dtos;

public class mesDtos {

	int numeroMes;
	String nombreMes;

	public mesDtos (int numeroMes, String nombreMes) {
	        this.numeroMes = numeroMes;
	        this.nombreMes = nombreMes;
	    }

	public int getNumeroMes() {
		return numeroMes;
	}

	public String getNombreMes() {
		return nombreMes;
	}
}
