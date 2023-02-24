package aplicacion.servicios;

public class ImplMenu implements InterfazMenu {
	@Override
	public void mostrarMenu() {		
		System.out.println("0. Salir");
		System.out.println("1. Repostaje normal");
		System.out.println("2. Repostaje con factura");
		System.out.println("3. Listar todos los repostajes");
	}

}
