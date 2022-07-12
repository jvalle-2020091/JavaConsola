package com.josuevalle.controlador;
import  com.josuevalle.clases.Cliente;
import java.util.ArrayList;

public class ControladorCliente{
	ArrayList<Cliente> arregloCliente=new ArrayList<Cliente>();
	ObtenerDatos oD=new ObtenerDatos();
	
	Cliente cliente;
	
	String nombre;
	String apellido;
	int nit;
	

	
	public void ingresarCliente(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String apellido;
		int nit;
		int n;
		int cont=0;
		
		do{
			System.out.println("Ingrese un nombre");
			nombre=oD.texto();
			
			System.out.println("Ingrese un apellido");
			apellido=oD.texto();
			System.out.println("Ingrese el nit");
			nit=oD.numero();
			arregloCliente.add(new Cliente(nombre, apellido, nit));
			System.out.println("");
			cont++;
			
			System.out.println("Mostrando cliente...");
			System.out.println("");
			System.out.println("Nombre: "+arregloCliente.get(cont-1).getNombre());
			System.out.println("Apellido: "+arregloCliente.get(cont-1).getApellido());
			System.out.println("Nit: "+arregloCliente.get(cont-1).getNit());				
			System.out.println("ID de cliente: "+(cont));
			System.out.println("");
			
			System.out.println("Desea agregar otro cliente?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
			n=oD.numero();
			System.out.println("");
		}while(n!=2);
	}
	
	public void modificarCliente(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String apellido;
		int nit;
		int n;
		int codC;
		int modC;
		
		do{
			System.out.println("Ingrese el codigo del cliente");
			codC=oD.numero();
			System.out.println("");
			System.out.println("Nombre: "+arregloCliente.get(codC-1).getNombre());
			System.out.println("Apellido: "+arregloCliente.get(codC-1).getApellido());
			System.out.println("Nit: "+arregloCliente.get(codC-1).getNit());
			System.out.println("ID de cliente: "+codC);
			System.out.println("");
			
			System.out.println("Modificar...");
			System.out.println("[1] Nombre");
			System.out.println("[2] Apellido");
			System.out.println("[3] NIT");
			modC=oD.numero();
			System.out.println("");
			
			switch(modC){
				case 1:{
					System.out.println("Ingrese el nombre.");
					nombre=oD.texto();
					arregloCliente.get(codC-1).setNombre(nombre);
					System.out.println("Mostrando cliente modificado...");
					System.out.println("");
					System.out.println("Nombre: "+arregloCliente.get(codC-1).getNombre());
					System.out.println("Apellido: "+arregloCliente.get(codC-1).getApellido());
					System.out.println("Nit: "+arregloCliente.get(codC-1).getNit());
					System.out.println("ID de cliente: "+codC);
				}break;
				
				case 2:{
					System.out.println("Ingrese el apellido.");
					apellido=oD.texto();
					arregloCliente.get(codC-1).setApellido(apellido);
					System.out.println("Mostrando cliente modificado...");
					System.out.println("");
					System.out.println("Nombre: "+arregloCliente.get(codC-1).getNombre());
					System.out.println("Apellido: "+arregloCliente.get(codC-1).getApellido());
					System.out.println("Nit: "+arregloCliente.get(codC-1).getNit());
					System.out.println("ID de cliente: "+codC);
				}break;
				
				case 3:{
					System.out.println("Ingrese el NIT.");
					nit=oD.numero();
					arregloCliente.get(codC-1).setNit(nit);
					System.out.println("Mostrando cliente modificado...");
					System.out.println("");
					System.out.println("Nombre: "+arregloCliente.get(codC-1).getNombre());
					System.out.println("Apellido: "+arregloCliente.get(codC-1).getApellido());
					System.out.println("Nit: "+arregloCliente.get(codC-1).getNit());
					System.out.println("ID de cliente: "+codC);
				}break;
				
			}
			System.out.println("Desea seguir modificando?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
			n=oD.numero();
			System.out.println("");
		}while(n!=2);
	}
		public void buscarCliente(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String apellido;
		int nit;
		int n;
		int codC;
		
		
			System.out.println("Ingrese el codigo del cliente a buscar :");
			codC=oD.numero();
			System.out.println("");
			System.out.println("Nombre: "+arregloCliente.get(codC-1).getNombre());
			System.out.println("Apellido: "+arregloCliente.get(codC-1).getApellido());
			System.out.println("Nit: "+arregloCliente.get(codC-1).getNit());
			System.out.println("ID de cliente: "+codC);
			System.out.println("");
			
		}
		public void eliminarCliente(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String apellido;
		
		int nit;
		int n;
		int cl;
		int op;
		int codC;
		 do{
			System.out.println("Ingrese el codigo del cliente que desea eliminar  :");
			codC=oD.numero();
			System.out.println("Nombre: "+arregloCliente.get(codC-1).getNombre());
			System.out.println("Apellido: "+arregloCliente.get(codC-1).getApellido());
			System.out.println("Nit: "+arregloCliente.get(codC-1).getNit());
			System.out.println("ID de cliente: "+codC);
			System.out.println("seguro que quiere eliminar a este cliente? ");
			System.out.println("[1]si");
			System.out.println("[2]no");
			op=oD.numero();
			
			switch(op){
				case 1:{
				arregloCliente.remove(codC-1);
				System.out.println("se a eliminado correctamente el cliente");
			for(int i=0;i<=arregloCliente.size();i++){
				System.out.println("Nombre: "+arregloCliente.get(i).getNombre());
				System.out.println("Apellido: "+arregloCliente.get(i).getApellido());
				System.out.println("Nit: "+arregloCliente.get(i).getNit());
				System.out.println("ID de cliente: "+(i+1));
			}
			
		}		
	}
				System.out.println("quiere elimiar otro cliente? ");
				System.out.println("[1]si");
				System.out.println("[1]no");
				cl=oD.numero();
		}while(cl!=2);
		
		}
	
	 
	
	public void mostrarClientes(){
		for(int i=0;i<=arregloCliente.size();i++){
			System.out.println("Nombre: "+arregloCliente.get(i).getNombre());
			System.out.println("Apellido: "+arregloCliente.get(i).getApellido());
			System.out.println("Nit: "+arregloCliente.get(i).getNit());
			System.out.println("ID de cliente: "+(i+1));
		}
	}
		
}
