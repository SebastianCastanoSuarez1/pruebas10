package controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import models.Proyecto;
import repositories.proyectos.ProyectoRepositoryImpl;

public class ProyectoController {

	private final Logger logger = Logger.getLogger(ProyectoController.class.getName());

	private final ProyectoRepositoryImpl proyectorepositoryImpl;

	public ProyectoController(ProyectoRepositoryImpl proyectorepository) {
		this.proyectorepositoryImpl = proyectorepository;
	}

	// Proyecto
	public List<Proyecto> getProyectorepository() {
		logger.info("Obteniendo toods los proyectos");
		return proyectorepositoryImpl.findAll();
	}

	public Proyecto createProyecto(Proyecto proyecto) {
		logger.info("Craer proyecto");
		return proyectorepositoryImpl.save(proyecto);
	}

	public Optional<Proyecto> getProyectoById(Integer id) {
		logger.info("Obteninedo el proyecto por el id: " + id);
		return proyectorepositoryImpl.findById(id);
	}

	public Proyecto updateProyecto(Proyecto proyecto) {
		logger.info("Actualizando el proyecto " + proyecto.getId());
		return proyectorepositoryImpl.save(proyecto);
	}

	public Boolean deleteProyecto(Proyecto proyecto) {
		logger.info("eliminando el proyecto " + proyecto.getId() + " con nombre " + proyecto.getNombre());
		return proyectorepositoryImpl.delete(proyecto);
	}
}
