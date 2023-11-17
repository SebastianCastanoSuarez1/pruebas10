package controller;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import models.Departamento;
import repositories.departamento.DepartamentoRepository;

public class DepartamentoController {
	private final Logger logger = Logger.getLogger(DepartamentoController.class.getName());
	private final DepartamentoRepository departamentorepository;

	public DepartamentoController(DepartamentoRepository departamentorepository) {
		this.departamentorepository = departamentorepository;
	}

	// Departamento
	public List<Departamento> getDepartamentorepository() {
		logger.info("Obteniendo toods los proyectos");
		return departamentorepository.findAll();
	}

	public Departamento createDepartamento(Departamento departamento) {
		logger.info("Craer proyecto");
		return departamentorepository.save(departamento);
	}

	public Optional<Departamento> getDepartamentoById(Integer id) {
		logger.info("Obteninedo el proyecto por el id: " + id);
		return departamentorepository.findById(id);
	}

	public Departamento updateDepartamento(Departamento departamento) {
		logger.info("Actualizando el proyecto " + departamento.getId());
		return departamentorepository.save(departamento);
	}

	public Boolean deleteDepartamento(Departamento departamento) {
		logger.info("eliminando el proyecto " + departamento.getId() + " con nombre " + departamento.getNombre());
		return departamentorepository.delete(departamento);
	}
}
