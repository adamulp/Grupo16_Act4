package tp4ing_grupo16.Clases;


/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:28
 */
public class Casa {

	private int pisos;
	private String zona;

	public Casa(){

	}

	/**
	 * 
	 * @param zona
	 * @param pisos
	 */
	public Casa(String zona, int pisos){
            this.zona = zona;
            this.pisos = pisos;
	}

	public int getPisos(){
		return pisos;
	}

	public String getZona(){
		return zona;
	}
}//end Casa