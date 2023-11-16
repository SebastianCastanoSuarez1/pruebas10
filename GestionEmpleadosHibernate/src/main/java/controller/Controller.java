package controller;

import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import repositories.departamento.Departamentorepositoryimpl;
import repositories.empleado.Empleadorepositoryimpl;
import repositories.proyectos.Proyectorepositoryimpl;

@AllArgsConstructor
@Data
public class Controller {
	private final Logger logger = Logger.getLogger(Controller.class.getName());
	private DepartamentoController depController = new DepartamentoController(new Departamentorepositoryimpl());
	private EmpleadoController empController = new EmpleadoController(new Empleadorepositoryimpl());
	private ProyectoController proController = new ProyectoController(new Proyectorepositoryimpl());
	
}
