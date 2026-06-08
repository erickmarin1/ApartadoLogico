import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		Scanner Lectura = null;
		String dato;
		
		do {
			do {
				System.out.println("Menu de Ejercicios");
				System.out.println("1.- Imprimir números impares descendente entre 1-100");
				System.out.println("2.- Ordenar numeros de menor a mayor");
				System.out.println("3.- Leer 3 números y determinar cual es el mayor");
				System.out.println("4.- Salir");
				
				Lectura = new Scanner(System.in);
				dato = Lectura.nextLine();
				
			} while (validaDatos(dato) == false);
			
			menu = Integer.parseInt(dato);
			
			switch (menu) {
			case 1:
				for(int i=100;i>0;i--) {
					if(i%2 != 0)
						System.out.println(i);
				}
								
				break;
			case 2:
				int num[] = {250, 100, 23, 145, 122, 432, 107, 109, 265, 194, 1};
				int control;
				
				for(int i=0;i<10;i++) {
					for(int f=0;f<10-i;f++){
						if(num[f] > num[f+1]) {
							control = num[f];
							num[f] = num[f+1];
							num[f+1] = control;
						}
					}
				}
				for(int i=0;i<11;i++) {
				System.out.println(num[i]);}
				
				break;
			case 3:
				int a,b,c;
				System.out.println("Ingresa en primer valor: ");
				Lectura = new Scanner(System.in);
				a = Lectura.nextInt();
				
				System.out.println("Ingresa en segundo valor: ");
				Lectura = new Scanner(System.in);
				b = Lectura.nextInt();
				
				System.out.println("Ingresa en tercer valor: ");
				Lectura = new Scanner(System.in);
				c = Lectura.nextInt();
				
				if(a>b && a>c)
					System.out.println("El numero mayor es: "+a);
				
				else if (b>c)
					System.out.println("El numero mayor es:"+b);
				
				else
					System.out.println("El numero mayor es "+c);
				
				break;
			case 4:
				
				break;
				
			}
			
		} while (0 < menu && menu < 4);

	}
	
	
	public static boolean validaDatos (String text) {
		try {
			int rango = Integer.parseInt(text);
			if (0 < rango && rango < 4)
			return true;
			else {
				System.out.println("Opcion no valida");
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No es un valor numerico");
			return false;
		}
	}

}
