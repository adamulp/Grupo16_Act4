package tp4ing_grupo16.Clases;


/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:28
 */
public class Auto {

	private double combustible;
	private String modelo;
	private String patente;

	public Auto(){

	}

	/**
	 * 
	 * @param modelo
	 * @param patente
	 * @param combustible
	 */
	public Auto(String modelo, String patente, double combustible){
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = combustible;
	}

	public double getCombustible(){
		return combustible;
	}

	public String getModelo(){
		return modelo;
	}

	public String getPatente(){
		return patente;
	}

    @Override
    public String toString() {
        return "Auto{" + "combustible=" + combustible + ", modelo=" + modelo + ", patente=" + patente + '}';
    }
        
        
}//end Auto