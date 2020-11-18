package webApps;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		
		StringTrimmerEditor recortaEspaciosBlanco = new StringTrimmerEditor(true);
	
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	}
	
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario(Model modelo) {
		
		Alumno alumnoX = new Alumno();
		
		modelo.addAttribute("estudianteX", alumnoX);
		
		return "formularioRegistroAlumno";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("estudianteX") Alumno alumnoXi, BindingResult resultadoValidacion) {

		if(resultadoValidacion.hasErrors()!=true) {
			return "confirmacionRegistroAlumno";
		}else {
			return "formularioRegistroAlumno";
		}
		
//		return "confirmacionRegistroAlumno";
	}

}



/*
	WebdatBinder, clase que tiene un método heredado registerCustomEditor
	StringTrimmerEditor, clase que permite recortar cadenas, tiene dos constructores.
	registerCustomEditor, como método recibe dos parámetros, una clase y un propertyEditor. 
	
	Una instancia de StringTrimmerEditor, hace de propertyEditor.

*/
/*

	addAttribute(String attributeName, Object attributeValue)
	
	<> alumnoX 
	Representa a un parámetro de tipo objeto, ..así que es un objeto ...
	
	<> estudianteX
	Representa al nombre que representará al objeto

*/


