package com.josuevalle.vista;
import com.josuevalle.controlador.ObtenerDatos;
import com.josuevalle.clases.User;
import java.util.ArrayList;
public class InterfazUsuario{
	ArrayList<User> arregloUser=new ArrayList<User>();
	ObtenerDatos oD=new ObtenerDatos();
	User user;
	
	String name;
	String apeliido;
	int nit;
	public void ingresarUser(){
		ObtenerDatos oD=new ObtenerDatos();
		String name;
		String apellido;
		int nit;
		int ln;
		int Cl=0;
		
		do{
			System.out.println("Ingrese un nombre");
			name=oD.texto();
			System.out.println("Ingrese un apellido");
			apellido=oD.texto();
			System.out.println("Ingrese el nit");
			nit=oD.numero();
			arregloUser.add(new User(name, apellido, nit ));
			System.out.println("");
			Cl++;
			
			System.out.println("---Mostrando usuario---");
			System.out.println("");
			System.out.println("Nombre: "+arregloUser.get(Cl-1).getName());
			System.out.println("Apellido: "+arregloUser.get(Cl-1).getApellido());
			System.out.println("Nit: "+arregloUser.get(Cl-1).getNit());	
			System.out.println("codigo del usuario:  "+(Cl));
			System.out.println("");
			
			System.out.println("Quiere agregar otro usuario?");
			System.out.println("[1]Si");
			System.out.println("[2]No");
			ln=oD.numero();
			System.out.println("");
		}while(ln!=2);
	}
	public void modificarUser(){
		ObtenerDatos oD=new ObtenerDatos();
		String name;
		String apellido;
		int telefono;
		int nit;
		int yn;
		int var;
		int opc;
		
		do{
			System.out.println("Ingrese el codigo del usuario");
			var=oD.numero();
			System.out.println("Nombre: "+arregloUser.get(var-1).getName());
			System.out.println("Apellido: "+arregloUser.get(var-1).getApellido());
			System.out.println("Nit: "+arregloUser.get(var-1).getNit());
			System.out.println("coigo del usuario: "+var);

			
			System.out.println("Modificar...");
			System.out.println("1--- Nombre");
			System.out.println("2--- Apellido");
			System.out.println("3--- NIT");
			opc=oD.numero();
			System.out.println("");
			
			switch(opc){
				case 1:{
					System.out.println("Ingrese el nombre.");
					name=oD.texto();
					arregloUser.get(var-1).setName(name);
					System.out.println("Mostrando cliente modificado...");
					System.out.println("Nombre: "+arregloUser.get(var-1).getName());
					System.out.println("Apellido: "+arregloUser.get(var-1).getApellido());
					System.out.println("Nit: "+arregloUser.get(var-1).getNit());
					System.out.println("codigo del usuario: "+var);
				}break;
				
				case 2:{
					System.out.println("Ingrese el apellido.");
					apellido=oD.texto();
					arregloUser.get(var-1).setApellido(apellido);
					System.out.println("Mostrando cliente modificado...");
					System.out.println("Nombre: "+arregloUser.get(var-1).getName());
					System.out.println("Apellido: "+arregloUser.get(var-1).getApellido());
					System.out.println("Nit: "+arregloUser.get(var-1).getNit());
					System.out.println("codigo del usuario:  "+var);
				}break;
				
				case 3:{
					System.out.println("Ingrese el NIT.");
					nit=oD.numero();
					arregloUser.get(var-1).setNit(nit);
					System.out.println("Se le mostraran los datos modificados");
					System.out.println("Nombre: "+arregloUser.get(var-1).getName());
					System.out.println("Apellido: "+arregloUser.get(var-1).getApellido());
					System.out.println("Nit: "+arregloUser.get(var-1).getNit());
					
					System.out.println("codigo del usuario:  "+var);
				}break;
				
				
			}
			System.out.println("quiere seguir modificando?");
			System.out.println("1--- Si");
			System.out.println("2--- No");
			yn=oD.numero();
			System.out.println("");
		}while(yn!=2);
		
	}
	public void buscarUser(){
		ObtenerDatos oD=new ObtenerDatos();
	String name;
		String apellido;
		int nit;
		int yn;
		int var;
	
		System.out.println("Ingrese el codigo del usuario");
			var=oD.numero();
			System.out.println("Nombre: "+arregloUser.get(var-1).getName());
			System.out.println("Apellido: "+arregloUser.get(var-1).getApellido());
			System.out.println("Nit: "+arregloUser.get(var-1).getNit());
			System.out.println("codigo del usuario: "+var);
		
	}
	public void eliminarUser(){
		ObtenerDatos oD=new ObtenerDatos();
		
		String name;
		String apellido;
		int nit;
		int telefono;
		int cl;
		int op;
		int codc;
		
		do{
			System.out.println("Ingrese el codigo de usuario ");
			codc=oD.numero();
			System.out.println("Nombre: "+arregloUser.get(codc-1).getName());
			System.out.println("Apellido: "+arregloUser.get(codc-1).getApellido());
			System.out.println("Nit: "+arregloUser.get(codc-1).getNit());
			System.out.println("codigo del usuario: "+codc);
			System.out.println("Desea eliminarlo?");
			System.out.println("[1]Si");
			System.out.println("[2]No");
			op=oD.numero();
			
			switch(op){
			case 1:{
			arregloUser.remove(codc-1);
			System.out.println("Usted elimino el usuario");
			System.out.println("Mostrando lista");
					
			for(int i=0;i<(arregloUser.size());i++){
			System.out.println("Nombre: "+arregloUser.get(i).getName());
			System.out.println("Apellido: "+arregloUser.get(i).getApellido());
			System.out.println("Nit: "+arregloUser.get(i).getNit());
			System.out.println("codigo del usuario: "+(i+1));
					}
				}
			}
			
			System.out.println("Quiere eliminar mas usuarios?");
			System.out.println("[1]Si");
			System.out.println("[2]No");
			cl=oD.numero();
		}while(cl!=2);
		
		
	}

}