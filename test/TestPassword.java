import java.util.Scanner;

import dominio.Password;

public class TestPassword {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Estás acá para generar una contraseña completamente segura");
		
		System.out.println("Ingrese cuantas contraseñas quiere");
		Integer tamano = teclado.nextInt();
		
		System.out.println("Ingrese la longitud de las contrasena"); // no importa si pongo de longitud 0, por defecto es 10 en la clase password.
		Integer longitud = teclado.nextInt();

		Password password[] = new Password[tamano];
		Boolean contraFuerte[] = new Boolean[tamano];

		for (int i = 0; i < password.length; i++) {
			password[i] = new Password(longitud);
			contraFuerte[i] = password[i].esFuerte();
			System.out.println(password[i].getContrasena() + " " + contraFuerte[i]);
		}

	}
}
