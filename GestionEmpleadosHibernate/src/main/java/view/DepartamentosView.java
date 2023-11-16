package view;

import java.util.List;

import io.IO;
import models.Departamento;
import models.Empleado;

public class DepartamentosView {
	final List<String> opciones = List.of("buscar por Código", "buscar por Nombre", "Mostrar", "Añadir", "modiFicar",
			"Eliminar", "Salir");

	public Departamento anadir() {
		String nombre;
		Departamento dep;
		IO.println("Introduce el nombre");
		nombre = IO.readString();
		dep = Departamento.builder().nombre(nombre).build();
		return dep;
	}

	public Departamento modificar(Departamento dep) {
		String nombre;
		Integer jefe;
		if (dep == null) {
			IO.println("No se ha encontrado ningun departamento");
			return null;
		}
		IO.println("Si no quiere modificar una variable del departamento dele a enter");
		IO.printf("Nombre [%s] ? ", dep.getNombre());
		nombre = IO.readString();
		if (!nombre.isBlank()) {
			dep.setNombre(nombre);
		}
		IO.println("Cambiar jefe");
		jefe = IO.readIntOrNull();
		if (jefe != null) {
			dep.setJefe(Empleado.builder().id(jefe).build());
		}
		return dep;
	}

	public void mostrar(Departamento dep, List<Empleado> emp) {
		if (dep == null) {
			return;
		}
		IO.println(dep.toString());
		for (Empleado empleado : emp) {
			IO.println(empleado);
		}
	}
}
