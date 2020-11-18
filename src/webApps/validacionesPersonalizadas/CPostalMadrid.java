package webApps.validacionesPersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CPostalMadridValidacion.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CPostalMadrid {
	
	public String value() default "28";
	
	public String message() default "El C�digo Postal debe comenzar por 28";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}













/*

	@Constraint(validatedBy=CPostalMadridValidacion.class)

Futura clase que contendr� la l�gica de la validaci�n


	@Target({ElementType.METHOD, ElementType.FIELD})

El objetivo de nuestra validaci�n, m�todos o campos.


	@Retention(RetentionPolicy.RUNTIME)

Revisa.. la anotacion en tiempo de ejecuci�n




	public String value() default "28"; // Define el CP por defecto
	
	public String message() default "El C�digo Postal debe comenzar por 28"; // Define un mensaje de error
	
	Class<?>[] groups() default {}; // Define una validaci�n grupal
	
	Class<? extends Payload>[] payload() default {}; // Difine los payloads, son obligatorios



*/


