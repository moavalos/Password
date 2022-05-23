import java.util.Scanner;

import dominio.Password;

public class TestPassword {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Hola.\nEstás acá para generar una contraseña completamente segura");
		
		System.out.println("Ingrese cuantas contraseñas quiere");
		Integer cantidad = teclado.nextInt();
		
		System.out.println("Ingrese la longitud de las contrasena"); 
		Integer longitud = teclado.nextInt();

		Password password[] = new Password[cantidad];
		String contraFuerte[] = new String[cantidad];

		for (int i = 0; i < password.length; i++) {
			password[i] = new Password(longitud);
			contraFuerte[i] = password[i].generarPassword();
			System.out.println(password[i].getContrasena() + password[i].esFuerte());
	
		}

	}
}
