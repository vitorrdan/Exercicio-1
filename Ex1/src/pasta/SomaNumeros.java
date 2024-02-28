package pasta;
import java.util.*;

public class SomaNumeros {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		int num1,num2,soma;
		
		//Entrada
		System.out.println("Digite dois numeros: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//Processamento
		
		soma = num1 + num2;
		
		//Saida
		
		System.out.println("Resultado: " + soma);
	}

}
