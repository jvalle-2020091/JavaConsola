package com.josuevalle.vista;
import  com.josuevalle.controlador.ControladorProducto;
import  com.josuevalle.controlador.ObtenerDatos;
import  com.josuevalle.controlador.ControladorCliente;
public class InterfazCajero{
	ObtenerDatos oD=new ObtenerDatos();
	ControladorCliente cCliente=new ControladorCliente();
	
	int opc;
	int opcionClientes;
	
	public void elCajero
	(){
		ObtenerDatos oD=new ObtenerDatos();
		ControladorCliente cCliente=new ControladorCliente();
		ControladorProducto cProducto=new ControladorProducto();
		
		int opc;
		int opcionClientes;
		
		do{
			System.out.println("1--Clientes");
			System.out.println("2--Producto");
			System.out.println("3--Salir");
			opc=oD.numero();
			System.out.println("----------------------------------------------");
			
			switch (opc){
				case 1:{
					System.out.println("Clientes");
					System.out.println("");
					do{
						System.out.println("1--Ingresar");
						System.out.println("2--Buscar");
						System.out.println("3--Regresar");
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
								System.out.println("Buscar");
								System.out.println("");
								cCliente.buscarCliente();
								System.out.println("-----------------------------------------------------");
							}break;
						}
						
					}while(opcionClientes!=3);
				}break;
				
				
				case 2:{
					System.out.println("Producto");
					System.out.println("");
					do{
						System.out.println("1--Ingresar");
						System.out.println("2--Buscar");
						System.out.println("3--Regresar");
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
								System.out.println("Buscar");
								System.out.println("");
								cProducto.buscarProducto();
								System.out.println("-------------------------------------------------------");
							}break;
						}
						
					}while(opcionClientes!=3);
				}break;
				case 3: 
				System.out.println("gracias por utilizar este servicio ");
				break;
				
				
			}
			
			
		}while(opc!=3);
	}
}

