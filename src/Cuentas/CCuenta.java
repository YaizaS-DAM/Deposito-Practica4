package Cuentas;

/**
* Clase Cuenta 
* Define las propiedades y métodos de un objeto de esta clase. 
*  
* @author: Yaiza Serna Sans
* @since 02/04/2026
* @version 1.0
*/


public class CCuenta {

		   
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    
    /**
     * Método constructor - Permite la instanciación de un objeto de tipo CCuenta vacío
     */
    public CCuenta()
    {
    }

    /**
     * Método constructor - Permite la instanciación de un objeto de tipo CCuenta
     * @param nom - Nombre de la cuenta
     * @param cue - Número de cuenta
     * @param sal - Saldo de la cuenta
     * @param tipo - Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
	 * Método getTipoInterés 
	 * @return Tipo de interés de la cuenta
	 */
    private double getTipoInterés() {
		return tipoInterés;
	}
    
    /**
	 * Método setTipoInterés - Establece el tipo de interés de la cuenta
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Método getSaldo 
	 * @return saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Método setSaldo - Establece el saldo de la cuenta
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método getCuenta 
	 * @return Número de cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Método setCuenta - Establece el número de cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Método getNombre 
	 * @return Nombre de la cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Método nombre - Establece el nombre de la cuenta
	 * @param nombre
	 */
	private void nombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Método estado
	 * @return saldo de la cuenta
	 */
	public double estado()
    {
        return getSaldo();
    }

	
	/**Método "ingresar" Permite ingresar una cantidad de la cuenta
     * @param Cantidad a ingresar
     * @throws Exception e - "No se puede ingresar una cantidad negativa"
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**Método "retirar". Pemrite retirar una cantidad de la cuenta
     * @param Cantidad a retirar
     * @throws Exception e - "No se puede retirar una cantidad negativa"
     * @throws Exception e - "No se hay suficiente saldo"
     * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
