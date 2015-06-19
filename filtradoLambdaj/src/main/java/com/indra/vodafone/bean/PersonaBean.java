package com.indra.vodafone.bean;

public class PersonaBean {

	private String nombre;
	private int edad;
	private Genero sexo;
	
	public PersonaBean(String nombre, int edad, Genero sexo){
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Genero getSexo() {
		return sexo;
	}
	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer();
		buffer.append("Nombre: "+getNombre());
		buffer.append("\t Edad: "+getEdad());
		buffer.append("\t Sexo: "+getSexo());
		
		return buffer.toString();
	}
	
	
}
