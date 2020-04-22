/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mipackage;

/**
 *
 * @author El Mikel papas
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Account cuentita;
		double saldo;

		cuentita = new Account("Pepa Santanass", "3333-1111-99-123456789");

		try {
			System.out.println("Ingreso en tu cuentillass");
			cuentita.ingresar(169577);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar la pastas");
		}

		try {
			cuentita.retirar(10);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al retirar los dineross");
		}

		try {
			System.out.println("Ingreso en nuestra cuenta bancaria");
			cuentita.ingresar(300);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fallo al ingresar el money");
		}

		saldo = cuentita.disponible();
		System.out.println("El saldo actual ess " + saldo);
	}

}
