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

    public Hijo() {
        super();
    }

    /**
     *
     * @param nombre
     * @param celular
     * @param billetara
     * @param auto
     */
    public Hijo(String nombre, Celular celular, double billetera, Auto auto) {
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = billetera;
        this.auto = auto;
    }

    public Auto getAuto() {
        return auto;
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como a mi madre");
    }

    @Override
	protected String cantar(){
        String cantoPadre = super.cantar();
        System.out.println("Así canta tu padre, Don " + apellido);
        System.out.println("Así canta " + nombre);
 
        return cantoPadre;
    }

    /**
     *
     * @param Auto
     */
    public void conducirAuto(Auto Auto) {

    }

    @Override
    public int hacerGoles(int goles) {
        return goles;
    }

    /**
     *
     * @param double
     */
    public void heredarDinero(double cantidad) {
        this.billetera += cantidad;
        System.out.println("MSJ de tio Lucas: disfruta la herencia Addams, sumas "
                + cantidad + " dolaritos");
    }

    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    public double getFortuna() {
        return FORTUNA;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int jugarLoteria() {
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de tu madre la ROSA!!");
        System.out.println("Ahora tienes " + FORTUNA + " U$$ !!!");
        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + NROSUERTE);
        this.billetera += FORTUNA;
        return NROSUERTE;
    }
}//end Hijo
