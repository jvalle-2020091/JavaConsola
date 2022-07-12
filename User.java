package com.josuevalle.clases;
public class User{
	String name;
	String apellido;
	int nit;
	
	
	public User(String nombre, String apellido, int nit){
		this.name=name;
		this.apellido=apellido;
		this.nit=nit;
	}
	
	public String getName(){
		return name;
	}
	
	public String getApellido(){
		return apellido;
	}
	
	public int getNit(){
		return nit;
	}
		
	public void setName(String name){
		this.name=name;
	}
	
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	
	public void setNit(int nit){
		this.nit=nit;
	}

}