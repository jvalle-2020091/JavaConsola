package com.josuevalle.controlador;
import  com.josuevalle.clases.Producto;
import java.util.ArrayList;

public class ControladorProducto{
	ArrayList<Producto> arregloProducto=new ArrayList<Producto>();
	ObtenerDatos oD=new ObtenerDatos();
	
	Producto producto;
	
	String nombre;
	String descripcion;
	int cantidad;
	

	
	public void ingresarProducto(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String descripcion;
		int cantidad;
		int n;
		int cont=0;
		
		do{
			System.out.println("Ingrese el nombre de producto ");
			nombre=oD.texto();
			System.out.println("Ingrese la descripcion de producto");
			descripcion=oD.texto();
			System.out.println("Ingrese la cantidad de productos existentes");
			cantidad=oD.numero();
			arregloProducto.add(new Producto(nombre, descripcion, cantidad));
			System.out.println("");
			cont++;
			
			System.out.println("Mostrando producto...");
			System.out.println("");
			System.out.println("Nombre: "+arregloProducto.get(cont-1).getNombre());
			System.out.println("Descripcion: "+arregloProducto.get(cont-1).getDescripcion());
			System.out.println("cantidad: "+arregloProducto.get(cont-1).getCantidad());				
			System.out.println("codigo del producto: "+(cont));
			System.out.println("");
			
			System.out.println("Desea agregar otro producto?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
			n=oD.numero();
			System.out.println("");
		}while(n!=2);
	}
	
	public void modificarProducto(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String Descripcion;
		int cantidad;
		int n;
		int codP;
		int modP;
		
		do{
			System.out.println("Ingrese el codigo del producto");
			codP=oD.numero();
			System.out.println("");
			System.out.println("Nombre: "+arregloProducto.get(codP-1).getNombre());
			System.out.println("Descripcion: "+arregloProducto.get(codP-1).getDescripcion());
			System.out.println("Cantidad: "+arregloProducto.get(codP-1).getCantidad());
			System.out.println("Codigo de producto: "+codP);
			System.out.println("");
			
			System.out.println("Modificar...");
			System.out.println("[1] Nombre");
			System.out.println("[2] Descripcion");
			System.out.println("[3] Cantidad");
			modP=oD.numero();
			System.out.println("");
			
			switch(modP){
				case 1:{
					System.out.println("Ingrese el nombre.");
					nombre=oD.texto();
					arregloProducto.get(codP-1).setNombre(nombre);
					System.out.println("Mostrando producto modificado...");
					System.out.println("");
					System.out.println("Nombre: "+arregloProducto.get(codP-1).getNombre());
					System.out.println("Descripcion: "+arregloProducto.get(codP-1).getDescripcion());
					System.out.println("Cantidad: "+arregloProducto.get(codP-1).getCantidad());
					System.out.println("Codigo de producto: "+codP);
				}break;
				
				case 2:{
					System.out.println("Ingrese la descripcion");
					descripcion=oD.texto();
					arregloProducto.get(codP-1).setDescripcion(descripcion);
					System.out.println("Mostrando producto modificado...");
					System.out.println("");
					System.out.println("Nombre: "+arregloProducto.get(codP-1).getNombre());
					System.out.println("Descripcion: "+arregloProducto.get(codP-1).getDescripcion());
					System.out.println("Cantidad: "+arregloProducto.get(codP-1).getCantidad());
					System.out.println("Codigo de producto: "+codP);
				}break;
				
				case 3:{
					System.out.println("Ingrese la cantidad");
					cantidad=oD.numero();
					arregloProducto.get(codP-1).setCantidad(cantidad);
					System.out.println("Mostrando la cantidad de producto existentes...");
					System.out.println("");
					System.out.println("Nombre: "+arregloProducto.get(codP-1).getNombre());
					System.out.println("Descripcion: "+arregloProducto.get(codP-1).getDescripcion());
					System.out.println("Cantidad: "+arregloProducto.get(codP-1).getCantidad());
					System.out.println("Codigo de Producto: "+codP);
				}break;
				
			}
			System.out.println("Desea seguir modificando?");
			System.out.println("[1] Si");
			System.out.println("[2] No");
			n=oD.numero();
			System.out.println("");
		}while(n!=2);
	}
	public void buscarProducto(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String Descripcion;
		int cantidad;
		int n;
		int codP;

		
			System.out.println("Ingrese el codigo del producto a buscar :");
			codP=oD.numero();
			System.out.println("");
			System.out.println("Nombre: "+arregloProducto.get(codP-1).getNombre());
			System.out.println("Descripcion: "+arregloProducto.get(codP-1).getDescripcion());
			System.out.println("Cantidad: "+arregloProducto.get(codP-1).getCantidad());
			System.out.println("Codigo de producto: "+codP);
			System.out.println("");
	}
		public void eliminarProducto(){
		ObtenerDatos oD=new ObtenerDatos();
		String nombre;
		String descripcion;
		
		int nit;
		int n;
		int cl;
		int op;
		int codC;
		 do{
			System.out.println("Ingrese el codigo del producto que desea eliminar  :");
			codC=oD.numero();
			System.out.println("Nombre: "+arregloProducto.get(codC-1).getNombre());
			System.out.println("Descripcion: "+arregloProducto.get(codC-1).getDescripcion());
			System.out.println("cantidad: "+arregloProducto.get(codC-1).getCantidad());
			System.out.println("codigo del producto: "+codC);
			System.out.println("seguro que quiere eliminar  este producto? ");
			System.out.println("[1]si");
			System.out.println("[2]no");
			op=oD.numero();
			
			switch(op){
				case 1:{
				arregloProducto.remove(codC-1);
				System.out.println("se a eliminado correctamente el producto");
			for(int i=0;i<=arregloProducto.size();i++){
				System.out.println("Nombre: "+arregloProducto.get(i).getNombre());
				System.out.println("Descripcion: "+arregloProducto.get(i).getDescripcion());
				System.out.println("cantidad: "+arregloProducto.get(i).getCantidad());
				System.out.println("codigo del producto: "+(i+1));
			}
			
		}		
	}
				System.out.println("quiere elimiar otro cliente? ");
				System.out.println("[1]si");
				System.out.println("[1]no");
				cl=oD.numero();
		}while(cl!=2);
		
		}
	
	public void mostrarProductos(){
		for(int i=0;i<=arregloProducto.size();i++){
			System.out.println("Nombre: "+arregloProducto.get(i).getNombre());
			System.out.println("Descripcion: "+arregloProducto.get(i).getDescripcion());
			System.out.println("Cantidad: "+arregloProducto.get(i).getCantidad());
			System.out.println("Codigo de producto: "+(i+1));
		}
	}
}



