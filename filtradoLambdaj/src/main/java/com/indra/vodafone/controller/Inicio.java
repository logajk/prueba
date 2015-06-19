package com.indra.vodafone.controller;

import static ch.lambdaj.Lambda.having;
import static ch.lambdaj.Lambda.on;
import static ch.lambdaj.Lambda.select;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.hamcrest.Matchers;

import com.indra.vodafone.bean.Genero;
import com.indra.vodafone.bean.PersonaBean;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaBean p1 = new PersonaBean("Juan",23,Genero.HOMBRE);
		PersonaBean p2 = new PersonaBean("Pi",20,Genero.MUJER);
		PersonaBean p3 = new PersonaBean("Pablo",43,Genero.HOMBRE);
		PersonaBean p4 = new PersonaBean("Pilar",35,Genero.MUJER);
		PersonaBean p5 = new PersonaBean("Paco",16,Genero.HOMBRE); 
		
		List<PersonaBean> listadoPersonas = Arrays.asList(p1,p2,p3,p4,p5);
		
		System.out.println("Listado Original:");
		for(PersonaBean p : listadoPersonas){
			System.out.println(p.toString());
		}
		
		Collection<PersonaBean> resultado = select(listadoPersonas, having(on(PersonaBean.class).getNombre(), Matchers.startsWith("P"))
																	.and(having(on(PersonaBean.class).getEdad(), Matchers.greaterThan(18))));
		System.out.println("Listado filtrado:");
		for(PersonaBean p : resultado){
			System.out.println(p.toString());
		}	
	}
}
