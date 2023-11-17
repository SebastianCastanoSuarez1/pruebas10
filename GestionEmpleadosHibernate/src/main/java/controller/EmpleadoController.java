package controller;

import java.util.Optional;
import java.util.logging.Logger;

import models.Empleado;
import repositories.empleado.EmpleadoRepositoryImpl;

public class EmpleadoController {
	Logger logger = Logger.getLogger(EmpleadoController.class.getName());
	private final EmpleadoRepositoryImpl empleadorepositoryImpl;

	public EmpleadoController(EmpleadoRepositoryImpl empleadorepository) {
		this.empleadorepositoryImpl = empleadorepository;
	}

	// Empleado
	public EmpleadoRepositoryImpl getEmpleadorepository() {
		return empleadorepositoryImpl;
	}

	public Empleado createProyecto(Empleado empleado) {
		logger.info("Craer empleado");
		return empleadorepositoryImpl.save(empleado);
	}

	public Optional<Empleado> getEmpleadoById(Integer id) {
		logger.info("Obteninedo el empleado por el id: " + id);
		return empleadorepositoryImpl.findById(id);
	}

	public Empleado updateProyecto(Empleado empleado) {
		logger.info("Actualizando el empleado " + empleado.getId());
		return empleadorepositoryImpl.save(empleado);
	}

	public Boolean deleteProyecto(Empleado empleado) {
		logger.info("eliminando el empleado " + empleado.getId() + " con nombre " + empleado.getNombre());
		return empleadorepositoryImpl.delete(empleado);
	}
}
