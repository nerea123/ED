import java.util.Random;
import java.util.Scanner;
public class Adivina {

	public static void main(String[] args) {
		Random random= new Random();
		int numeroAleatorio;
		
		numeroAleatorio= random.nextInt(1000) + 1;
		System.out.println("numeroAleatorio="+numeroAleatorio);
		int cont=0;
		int numeroUsuario;
		Scanner scanner=new Scanner(System.in);//escaner asociado al teclado
		while (true){
			System.out.println("Introduce un numero");
	        String Linea = scanner.nextLine();
	        System.out.println("has escrito: " + Linea);
	        numeroUsuario= Integer.parseInt(Linea);
	        cont ++;
	        if (numeroUsuario== numeroAleatorio)
	        	break;
	        else if (numeroUsuario<numeroAleatorio)
	        	System.out.println("Prueba con un numero mayor");
	        else
	        	System.out.println("Prueba con un numero menor");
		}
		System.out.println("Has acertado y has hecho " +cont+" intentos");
	}


}
