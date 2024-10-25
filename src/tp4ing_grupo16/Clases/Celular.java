package tp4ing_grupo16.Clases;


/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:29
 */
public class Celular {

	private String compania;
	private String numero;
	private double saldo;



	public Celular(String compania, String numero, double saldo){
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
	}

	public String getCompania(){
		return compania;
	}

	public String getNumero(){
		return numero;
	}

	public double getSaldo(){
		return saldo;
	}
}//end Celular