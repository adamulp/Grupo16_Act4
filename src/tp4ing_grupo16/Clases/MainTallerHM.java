package tp4ing_grupo16.Clases;


/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:29
 */
public class MainTallerHM {

public static void main(String[] args) {
    Auto cascajo = new Auto("Renault 12","123LATA", 50.0);
    Auto fordFocus = new Auto("Ford Focus","999POWR", 40.0);
    Padre padre = new Padre();
    padre.addAuto(fordFocus);
    padre.addAuto(cascajo);
    Celular cel = new Celular("Nokia", "123456789", 100.0);
    
    Hijo hijo = new Hijo("Juan Carlos", cel, 150.0, cascajo);
    
     System.out.println("Hijo: " + hijo.nombre + " " + hijo.apellido + ", Auto: " + hijo.getAuto());
}
}//end MainTallerHM