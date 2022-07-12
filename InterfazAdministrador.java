package com.josuevalle.vista;
import  com.josuevalle.controlador.ObtenerDatos;
import  com.josuevalle.controlador.ControladorCliente;
import  com.josuevalle.controlador.ControladorProducto;
import  com.josuevalle.controlador.ControladorUsuario;
public class InterfazAdministrador{
	ObtenerDatos oD=new ObtenerDatos();
	ControladorCliente cCliente=new ControladorCliente();
	
	int opc;
	int opcionClientes;
	
	public void elAdmin(){
		ObtenerDatos oD=new ObtenerDatos();
		ControladorCliente cCliente=new ControladorCliente();
		ControladorProducto cProducto=new ControladorProducto();
		ControladorUsuario  cUsuario=new ControladorUsuario();
		InterfazUsuario   iUsuario=new	InterfazUsuario();
		
		
		int opc;
		int opcionClientes;
		
		do{
			System.out.println("1--Clientes");
			System.out.println("2--Producto");
			System.out.println("3--Usuario");
			System.out.println("4--salir");
			opc=oD.numero();
			System.out.println("----------------------------------------------");
			
			switch (opc){
				case 1:{
					System.out.println("Clientes");
					System.out.println("");
					do{
						System.out.println("1--Ingresar");
						System.out.println("2--Modificar");
						System.out.println("3--Eliminar");
						System.out.println("4--Buscar");
						System.out.println("5--Regresar");
						opcionClientes=oD.numero();
						System.out.println("----------------------------------------------");
						
						switch (opcionClientes){
							case 1:{
								System.out.println("Ingresar");
								System.out.println("");
								cCliente.ingresarCliente();
								System.out.println("-----------------------------------------------------------");
							}break;
							
							case 2:{
								System.out.println("Modificar");
								System.out.println("");
								cCliente.modificarCliente();
								System.out.println("---------------------------------------------------------------");
							}break;
							
							case 3:{
								System.out.println("Eliminar");
								System.out.println("");
								cCliente.eliminarCliente();
								System.out.println("-----------------------------------------------------------");
							}break;
							
							case 4:{
								System.out.println("Buscar");
								System.out.println("");
								cCliente.buscarCliente();
								System.out.println("-----------------------------------------------------");
							}break;
						}
						
					}while(opcionClientes!=5);
				}break;
				
				
				case 2:{
					System.out.println("Producto");
					System.out.println("");
					do{
		
						System.out.println("1--Ingresar");
						System.out.println("2--Modificar");
						System.out.println("3--Eliminar");
						System.out.println("4--Buscar");
						System.out.println("5--Regresar");
						opcionClientes=oD.numero();
						System.out.println("----------------------------------");
						
						switch (opcionClientes){
							case 1:{
								System.out.println("Ingresar");
								System.out.println("");
								cProducto.ingresarProducto();
								System.out.println("------------------------------------------");
							}break;
							
							case 2:{
								System.out.println("Modificar");
								System.out.println("");
								cProducto.modificarProducto();
								System.out.println("--------------------------------------------");
							}break;
							
							case 3:{
								System.out.println("Eliminar");
								System.out.println("");
								cProducto.eliminarProducto();
								System.out.println("-----------------------------------------------------");
							}break;
							
							case 4:{
								System.out.println("Buscar");
								cProducto.buscarProducto();
								System.out.println("");
								System.out.println("-------------------------------------------------------");
							}break;
						}
						
					}while(opcionClientes!=5);
				}break;
				
				case 3:{
					System.out.println("usuarios");
					do{
						System.out.println("1--Ingresar");
						System.out.println("2--Modificar");
						System.out.println("3--Eliminar");
						System.out.println("4--Buscar");
						System.out.println("5--Regresar");
						opcionClientes=oD.numero();
						System.out.println("----------------------------------------------");
						
						switch (opcionClientes){
							case 1:{
								System.out.println("Ingresar");
								System.out.println("");
								iUsuario.ingresarUser();
								System.out.println("-----------------------------------------------------------");
							}break;
							
							case 2:{
								System.out.println("Modificar");
								System.out.println("");
								iUsuario.modificarUser();
								System.out.println("---------------------------------------------------------------");
							}break;
							
							case 3:{
								System.out.println("Eliminar");
								System.out.println("");
								iUsuario.eliminarUser();
								System.out.println("-----------------------------------------------------------");
							}break;
							
							case 4:{
								System.out.println("Buscar");
								System.out.println("");
								iUsuario.buscarUser();
								System.out.println("-----------------------------------------------------");
							}break;
						}
						
					}while(opcionClientes!=5);
				}break;
				case 4:{
					System.out.println("Gracias por preferirnos!!!!");
					
				}break;
				default:
				System.out.println("Opcion invalida");
				break;
				
			}
			
			
		}while(opc!=4);
	}
}