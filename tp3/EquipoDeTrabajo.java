package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.OptionalDouble;

public class EquipoDeTrabajo {
	
	public static void main(String[] args) {
		PersonaTrabajo persona1 = new PersonaTrabajo("a", "b", 20);
		PersonaTrabajo persona2 = new PersonaTrabajo("c", "d", 27);
		PersonaTrabajo persona3 = new PersonaTrabajo("e", "f", 32);
		PersonaTrabajo persona4 = new PersonaTrabajo("g", "h", 29);
		PersonaTrabajo persona5 = new PersonaTrabajo("i", "j", 43);
		
		ArrayList<PersonaTrabajo> integrantes = new ArrayList<>();
		EquipoDeTrabajo equipo1 = new EquipoDeTrabajo("equipo", integrantes);
		
		/*integrantes.add(persona1);
		integrantes.add(persona2);
		integrantes.add(persona3);
		integrantes.add(persona4);
		integrantes.add(persona5);*/
		
		equipo1.ingresarAEquipo(persona1);
		equipo1.ingresarAEquipo(persona2);
		equipo1.ingresarAEquipo(persona3);
		equipo1.ingresarAEquipo(persona4);
		equipo1.ingresarAEquipo(persona5);
		
		System.out.println(equipo1.promedioEdad());
	}
	
	private String nombre;
	private ArrayList<PersonaTrabajo> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<PersonaTrabajo> integrantes) {
		
		this.nombre = nombre;
		this.integrantes = integrantes;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<PersonaTrabajo> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<PersonaTrabajo> integrantes) {
		this.integrantes = integrantes;
	}
	
	public OptionalDouble promedioEdad() {
		return this.getIntegrantes().stream().mapToDouble(personaTrabajo -> personaTrabajo.getEdad()).average();
	}
	
	public void ingresarAEquipo(PersonaTrabajo pNueva) {
        this.getIntegrantes().add(pNueva);
    } 
	
}
