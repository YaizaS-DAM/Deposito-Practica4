package Cuentas;

/**
 * Clase Principal 
 * Permite la creación de una cuenta bancaria, consultar su saldo, y añadir o retirar dinero de la misma.
 * 
* @author: Yaiza Serna Sans
* @since 02/04/2026
* @version 1.0
*/

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        //Creación de la cuenta. Instanciación de la variable cuenta1 de tipo CCuenta. 
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        //Llamada al método  operativa_cuenta
        operativa_cuenta(cuenta1, 0);
    }

	/**
	 * Método operativa_cuenta
	 * Permite consultar su saldo, y añadir o retirar dinero de la misma.
	 * 
	 * @param cuenta1 - Cuenta con la que se va a trabajar
	 * @param cantidad - Cantidad de la cuenta
	 */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		//Llamada al método estado para consultar el saldo de la cuenta
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        
		//Llamada al retirar para retirar una cantidad de la cuenta, 2300    
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
      //Llamada al ingresar para ingresar una cantidad de la cuenta, 695     
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
