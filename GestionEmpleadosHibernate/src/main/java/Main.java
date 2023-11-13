import java.util.logging.Logger;

import controller.Controller;
import io.IO;
import lombok.var;
import repositories.departamento.Departamentorepositoryimpl;
import repositories.empleado.Empleadorepositoryimpl;
import repositories.proyectos.Proyectorepositoryimpl;

public class Main {
	Logger logger = Logger.getLogger(Main.class.getName());

	public static void main(String[] args) {
		var controller = new Controller(new Departamentorepositoryimpl(), new Empleadorepositoryimpl(),
				new Proyectorepositoryimpl());
		int menu = -1;
		do {
			menuPrincipal();
		} while (menu != 0);
	}

	private static void menuPrincipal() {
		IO.println("---------------------------------------------");
		IO.println("1.Mostrar departamentos");
		IO.println("2.Mostrar empleados");
		IO.println("3.Añadir departamento");
		IO.println("4.Añadir empleado");
		IO.println("5.Modificar departamento");
		IO.println("6.Modificar empleado");
		IO.println("7.Eliminar Departamento");
		IO.println("8.Eliminar empleado");
		IO.println("0.Salir");
		IO.println("---------------------------------------------");
	}
}