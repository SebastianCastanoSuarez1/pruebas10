package controller;

import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import repositories.departamento.DepartamentoRepositoryImpl;
import repositories.empleado.EmpleadoRepositoryImpl;
import repositories.proyectos.ProyectoRepositoryImpl;

@AllArgsConstructor
@Data
public class Controller {
	private final Logger logger = Logger.getLogger(Controller.class.getName());
	private DepartamentoController depController = new DepartamentoController(new DepartamentoRepositoryImpl());
	private EmpleadoController empController = new EmpleadoController(new EmpleadoRepositoryImpl());
	private ProyectoController proController = new ProyectoController(new ProyectoRepositoryImpl());
	
}
