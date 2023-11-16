package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Proyecto")
@NamedQuery(name = "Proyecto.findAll", query = "SELECT d FROM Proyecto d")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Proyecto {
	@GeneratedValue
	private Integer id;
	
	private String nombre;
	@ManyToMany(mappedBy = "proyecto", fetch = FetchType.EAGER)
	private List<Empleado> misEmpleados = new ArrayList<Empleado>();

	}
