package com.josuevalle.clases;
public class Producto{
	String nombre;
	String descripcion;
	int cantidad;
	
	public Producto(String nombre, String descripcion, int cantidad){
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.cantidad=cantidad;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
	
	public void setCantidad(int cantidad){
		this.cantidad=cantidad;
	}

	
}