import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import dominio.Password;

public class TestPassword {
	
	@Test
	public void queLaLongitudDeLaContraseñaSeaMayorQueOcho() {
		Integer longitud = 9;
		Password contra = new Password(longitud);
		//contra.longitudMayorQue8();
		assertEquals(longitud, contra.getLongitud());
	}
	
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
			
			/* hay un 70% de posibilidades de q tire contraseña segura si la longitud es mayor a 8, 
			 * mientras mas larga sea la longitud de la contraseña mejor.*/
	
		}

	}
}
