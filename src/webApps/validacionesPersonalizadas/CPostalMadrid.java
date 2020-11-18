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
	
	public String message() default "El Código Postal debe comenzar por 28";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};
	
}













/*

	@Constraint(validatedBy=CPostalMadridValidacion.class)

Futura clase que contendrá la lógica de la validación


	@Target({ElementType.METHOD, ElementType.FIELD})

El objetivo de nuestra validación, métodos o campos.


	@Retention(RetentionPolicy.RUNTIME)

Revisa.. la anotacion en tiempo de ejecución




	public String value() default "28"; // Define el CP por defecto
	
	public String message() default "El Código Postal debe comenzar por 28"; // Define un mensaje de error
	
	Class<?>[] groups() default {}; // Define una validación grupal
	
	Class<? extends Payload>[] payload() default {}; // Difine los payloads, son obligatorios



*/


