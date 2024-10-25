package tp4ing_grupo16.Clases;

import java.util.ArrayList;
import java.util.List;

/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:29
 */
public class Padre {

    protected String apellido;
    protected Auto auto;
    private List<Auto> autos;
    protected Casa casa;
    protected String nombre;

    public Padre() {
        this.nombre = "Papa";
        this.apellido = "Lopez";
        this.casa = new Casa("centro", 2);
        this.autos = new ArrayList<>();
    }

    /**
     *
     * @param nombre
     * @param apellido
     * @param auto
     */
    public Padre(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.autos = new ArrayList<>();
    }

    /**
     *
     * @param auto
     */
    public void addAuto(Auto auto) {
        autos.add(auto);
    }

    protected String cantar() {
        return "";
    }

    /**
     *
     * @param Auto
     */
    protected void comprarAuto(Auto Auto) {
        autos.add(auto);
    }

    /**
     *
     * @param Casa
     */
    protected void construirCasa(Casa casa) {
        this.casa = casa;
    }

    /**
     *
     * @param auto
     */
    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos disponibles.");
            return;
        }
        for (Auto auto : autos) {
            System.out.println("Auto: " + auto.getModelo());
        }
    }

    public Auto getAuto(int index) {
        if (index >= 0 && index < autos.size()) {
            return autos.get(index);
        } else {
            return null;
        }
    }

    public String getApellido() {
        return apellido;
    }
}//end Padre
