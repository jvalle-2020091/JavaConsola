package com.josuevalle.controlador;
import  com.josuevalle.clases.Usuario;
import  com.josuevalle.vista.InterfazAdministrador;
import  com.josuevalle.vista.InterfazCajero;
import java.util.ArrayList;

public class ControladorUsuario{
	ArrayList<Usuario> arregloUsuario=new ArrayList<Usuario>();
	Usuario usuario;
	
	
	
	String admin;
	String clave;
	String rol;
	int repit=0;
	
	public void autentificacion_de_admin(){
		do{
			ObtenerDatos oD=new ObtenerDatos();
			InterfazAdministrador iAdministrador=new InterfazAdministrador();
			InterfazCajero iCajero=new InterfazCajero();
			
			String admin;
			String clave;
			String rol;
				System.out.println("     BIENVENIDO AL SISTEMA      ");
			
			System.out.println("            Usuario                        ");
			admin=oD.texto();
			System.out.println("");
			System.out.println("            clave                           ");
			clave=oD.texto();
			System.out.println("");
			for(int i=0; i<=arregloUsuario.size(); i++){
				if((arregloUsuario.get(i).getAdmin().equals(admin))&&(arregloUsuario.get(i).getClave().equals(clave))){
					if(arregloUsuario.get(i).getRol()=="A"){
						System.out.println("Usted a ingresado como administrador");
						System.out.println("--------------------------------------");
						iAdministrador.elAdmin();
					
					}else{
							System.out.println("Cajero");
							System.out.println("-------------------------------------");
					     }
					
				 }else{ 
					 admin="josue";
					 clave="valle";
					if(admin.equals("josue")&& clave.equals("valle")){	

						System.out.println("Usted ha ingresado como cajero ");
						System.out.println(" ");
						iCajero.elCajero();
							}
							
				       }
				
			}
			}while(repit!=1);
			}
		
		public void agregarUsuario(String admin, String clave, String rol){
				arregloUsuario.add(new Usuario(admin, clave, rol));
		}
	
		public void mostrarUsuario(){
			for(int i=0;i<arregloUsuario.size();i++){
				System.out.println("Usuario: "+arregloUsuario.get(i).getAdmin());
				System.out.println("Contraseña: "+arregloUsuario.get(i).getClave());
				System.out.println("Tiene el rol: "+arregloUsuario.get(i).getRol());
				System.out.println("ID de usuario: "+(i+1));
			}

	
	
	
	
	
		
		}
	}










