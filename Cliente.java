package com.josuevalle.clases;
public class Cliente{
	String nombre;
	String apellido;
	int nit;
	
	public Cliente(String nombre, String apellido, int nit){
		this.nombre=nombre;
		this.apellido=apellido;
		this.nit=nit;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public int getNit(){
		return nit;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setNit(int nit){
		this.nit=nit;
	}
	
	
	
}