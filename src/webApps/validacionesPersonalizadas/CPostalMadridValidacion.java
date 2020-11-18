package webApps.validacionesPersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String> {

	@Override
    public void initialize(CPostalMadrid elCodigo) { 
	
		prefijoCodigoMadrid = elCodigo.value();
    }
	
	@Override
	public boolean isValid(String here, ConstraintValidatorContext wooh) {
		// TODO Auto-generated method stub
		
		boolean valCodigo;
		
		if(here!=null) valCodigo=here.startsWith(prefijoCodigoMadrid);
		
		else return valCodigo=true;
		
		return valCodigo;
	}
	
	private String prefijoCodigoMadrid;
}

/*

	public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String> 

La clase est� implementando la interfaz ConstraintValidator, que trae dos parametros.
Se est�n sobreescribiendo dos m�todos, initializa e isValid.

*/

/*
    public void initialize(CPostalMadrid elCodigo) { 

Este m�todo est� recibiendo como par�metro un objeto de CPostalMadrid, al cual llamamos elCodigo.
Dicho objeto contiene un Value ("28") y un message("El cod...")

	prefijoCodigoMadrid = elCodigo.value();
	
Estamos extrayendo el value del objeto/referencia y asignandolo a prefijoCodigoMadrid, el cual es 28.

*/

/*

	public boolean isValid(String here, ConstraintValidatorContext wooh) {

Este m�todo nos dir� si la validaci�n es pasada, de los par�metros here es el que almacena el dato/valor ingresado por el usuario.

	boolean valCodigo;

Representa el resultado. 

	if(here!=null) valCodigo=here.startsWith(prefijoCodigoMadrid);

El m�todo compara el valor/dato ingresado con el valor/prefijoCodigoMadrid y determina si el primero contiene al segundo.
Si no hay dato ingresado se le permite continuar, con valCodigo=true.

*/


