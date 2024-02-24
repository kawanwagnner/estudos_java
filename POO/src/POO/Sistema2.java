package POO;

import models.Cliente;
import models.Usuario;

public class Sistema2 {

	public static void main(String args) {

		Usuario u = new Usuario("Arthur", 22, "505.323.654-34");
		
		Cliente cliente = new Cliente("Arthur", 22, "505.323.654-34", 01);
		
		u.Login();
		cliente.Login();
	}
	
}