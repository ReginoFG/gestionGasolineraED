package aplicacion.controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Repostaje;
import aplicacion.servicios.ImplMenu;
import aplicacion.servicios.ImplRepostaje;
import aplicacion.servicios.InterfazMenu;
import aplicacion.servicios.InterfazRepostaje;

public class Menu {

	public static void main(String[] args) {
		
		//Inicializa la interfaz de repostaje y menu
		InterfazRepostaje intR = new ImplRepostaje();
		InterfazMenu intM = new ImplMenu();
		//Listado de repostajes (BD)
		List<Repostaje> listaRepostajes = new ArrayList<>();
				
				// Imprimir el menú por consola
				// Scanner con la opción del usuario
				Scanner entradaOpcion = new Scanner(System.in);		
				Boolean cerrarMenu = false;
				int opcion;
				while(!cerrarMenu) {	
					//Mostramos el menú
					intM.mostrarMenu();
					System.out.println("Introduza la opción deseada: ");
					opcion = entradaOpcion.nextInt();
					System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
					
					switch (opcion) {					
						case 0:
							cerrarMenu = true;
							break;							
						case 1:
												
							System.out.println();
							break;
						case 2:
							
							break;
						case 3:
							
							break;
						default:

					}
				}		

			}

	}
