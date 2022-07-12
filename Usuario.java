package com.josuevalle.clases;
public class Usuario{
	String admin;
	String clave;
	String rol;
	int iU;
	
	
	public Usuario(String admin, String clave, String rol){
		this.admin=admin;
		this.clave=clave;
		this.rol=rol;
	}
	
	public String getAdmin(){
		return admin;
	}
	
	public String getClave(){
		return clave;
	}
	
	public String getRol(){
		return rol;
	}
	public void setAdmin(String admin ){
		this.admin=admin;
	}
	
	public void setClave(String clave){
		this.clave=clave;
	}
	
	public void setRol(String rol){
		this.rol=rol;
	}
	
}