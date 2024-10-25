package tp4ing_grupo16.Clases;


/**
 * @author agus1
 * @version 1.0
 * @created 24-oct.-2024 20:47:29
 */
public interface Madre {

	public static final double FORTUNA = 50000.0;
	public static final int NROSUERTE = 36;

	public void bailar();

	public double getFortuna();

	public int jugarLoteria();

}