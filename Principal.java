package com.josuevalle;
import  com.josuevalle.controlador.ControladorUsuario;
import  com.josuevalle.controlador.ObtenerDatos;
public class Principal{
	public static void main(String args[]){
		ControladorUsuario cUsuario=new ControladorUsuario();
		ObtenerDatos oD=new ObtenerDatos();
		
		String admin;
		String clave;
		String rol;
		int iU;
		
	 //use estos datos para ingresar como Administrador.
	//si quiere acceder como cajero utilice como Usuario: josue clave: valle
		admin="Admin";
		clave="12345";
		rol="A";
		cUsuario.agregarUsuario(admin, clave , rol); //tiene un pequeño bug al ingresar como administrador 
		
		cUsuario.autentificacion_de_admin();
		
	}
}