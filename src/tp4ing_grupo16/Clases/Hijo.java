package tp4ing_grupo16.Clases;

import java.util.List;


/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:29
 */
public class Hijo extends Padre implements Madre, Hermano, Tio {

	private double billetera;
	private Celular celular;
	protected String nombre;

	public Hijo(){
            super();
	}
	/**
	 * 
	 * @param nombre
	 * @param celular
	 * @param billetara
	 * @param auto
	 */
	public Hijo(String nombre, Celular celular, double billetera, Auto auto){
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = billetera;
        this.auto = auto;
	}
        
        public Auto getAuto() {
        return auto;
        }

        
        @Override
	public void bailar(){

	}
        @Override
	protected String cantar(){
        return "Y así canta " + nombre;
	}

	/**
	 * 
	 * @param Auto
	 */
	public void conducirAuto(Auto Auto){

	}

	public int hacerGoles(){
		return 0;
	}

	/**
	 * 
	 * @param double
	 */
	public void heredarDinero(double cantidad){
            this.billetera += cantidad;
	}

	public void jugarFutbol(){

	}

	public double getFortuna(){
		return FORTUNA;
	}

    @Override
    public int jugarLoteria() {
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + NROSUERTE);
        this.billetera += FORTUNA;
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de la ROSA!!");
        return NROSUERTE;
    }
}//end Hijo