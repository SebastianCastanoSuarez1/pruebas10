package view;

import controller.Controller;
import io.IO;
import models.Departamento;

public class MenuDepartamento {
	public static void menu() {
		Departamento dao = new Departamento();
		int menu = -1;

		do {
			menuPrincipal();
			menu = IO.readByte();
			switch (menu) {
			case 0:
				// IO.println();
				break;
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:

				break;

			default:
				break;
			}
		} while (menu != 0);
	}

	private static void menuPrincipal() {
		IO.println("---------------------------------------------");
		IO.println("0.Salir");
		IO.println("1.Mostrar todos los departamentos");
		IO.println("2.Añadir departamento");
		IO.println("3.Modificar departamento");
		IO.println("4.Eliminar Departamento");
		IO.println("---------------------------------------------");
	}
}
