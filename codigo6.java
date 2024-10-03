/* Este programa genera de forma aleatoria 20 números, los cuales se van guardando en un vector.
 * Posteriormente, se pregunta por consola qué números queremos resaltar.
 * La opción 1 resalta los números que son múltiplos de 5.
 * La opción 2 resalta los números que son múltiplos de 7.
 * Posteriormente, nos muestra el vector con los números resaltados de acuerdo a la opción elegida.
 */


import java.util.Scanner; //Importamos la libreria

public class codigo6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    int[] n = new int[20]; //Agregamos new despues de =

	    for (int i = 0; i < 20; i++) { //Agregamos el ++ a i
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //Agregamos el .out
	    } //for
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //Cambiamos printl por println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    //Cambiamos la siguiente linea por un Scanner
	    //int opcion = Integer.parseInt(System.console().readLine()); 
	    int opcion = sc.nextInt();
	    
	    int multiplo = (opcion == 1) ? 5 : 7; //Cambiamos de orden los signos, primero ? y luego :
	    
	    for (int e : n) { //cambiamos la palabra foreach por for y el tipo de dato de e, de char a un int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	        } // if corregimos la llave 
	       else {
	        System.out.print(e + " "); //cambiamos .in por .out
	      } // else
	    }
	    
	    sc.close(); //Cerramos sc
	    
	} //main
}//codigo 6