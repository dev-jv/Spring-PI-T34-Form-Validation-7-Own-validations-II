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

La clase está implementando la interfaz ConstraintValidator, que trae dos parametros.
Se están sobreescribiendo dos métodos, initializa e isValid.

*/

/*
    public void initialize(CPostalMadrid elCodigo) { 

Este método está recibiendo como parámetro un objeto de CPostalMadrid, al cual llamamos elCodigo.
Dicho objeto contiene un Value ("28") y un message("El cod...")

	prefijoCodigoMadrid = elCodigo.value();
	
Estamos extrayendo el value del objeto/referencia y asignandolo a prefijoCodigoMadrid, el cual es 28.

*/

/*

	public boolean isValid(String here, ConstraintValidatorContext wooh) {

Este método nos dirá si la validación es pasada, de los parámetros here es el que almacena el dato/valor ingresado por el usuario.

	boolean valCodigo;

Representa el resultado. 

	if(here!=null) valCodigo=here.startsWith(prefijoCodigoMadrid);

El método compara el valor/dato ingresado con el valor/prefijoCodigoMadrid y determina si el primero contiene al segundo.
Si no hay dato ingresado se le permite continuar, con valCodigo=true.

*/


