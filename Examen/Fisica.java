/**
 * Clase que proporciona ecuaciones F�sicas determinando unos parametros
 * @author �lvaro 
 * @version 1.0
 */
import java.util.Scanner;

public class Fisica {
	/**
	 * Constante que representa la gravedad terrestre
	 */
	public static final double ACELERACION_GRAVEDAD = 9.8;
	/**
	 * M�todo que calcula la velocidad con la que un cuerpo llega al suelo
	 * @param altura que es la longitud desde la cual se deja caer dicho objeto
	 * @return double representando la ecuaci�n fisica de la velocidad de caida
	 */
	public static double velocidadLlegaSuelo(double altura) {
		return Math.sqrt(2 * ACELERACION_GRAVEDAD * altura);
	}
	/**
	 * M�todo que calcula el tiempo de caida de un cuerpo desde una altura
	 * @param altura que es la longitud desde la cual se deja caer dicho objeto
	 * @return double representando la ecuaci�n fisica del tiempo que pasa mientras que un cuerpo cae desde una dicha altura hasta el suelo
	 */
	public static double tiempoLlegaSuelo( double altura) {
		return Math.sqrt((2 * altura) / ACELERACION_GRAVEDAD);
	}
	public static void main(String[] args) {
		System.out.println("Introduce la altura.");
		Scanner sc = new Scanner(System.in);
		double altura = sc.nextDouble();
	
		sc.close();
		
		System.out.printf("La velocidad con la que un cuerpo llega al suelo desde una altura %.2f y " + "bajo una gravedad de %.1f vale %.2f%n",
				altura, ACELERACION_GRAVEDAD, velocidadLlegaSuelo( altura));
		
		System.out.printf("El tiempo que dicho cuerpo tendr� al caer al suelo sera: %.2f%n", tiempoLlegaSuelo(altura));
				
	
	}
}
