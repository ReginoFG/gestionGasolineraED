package aplicacion.servicios;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Repostaje;
/**
 * Implementación de la InterfazRepostaje
 * @author garfe
 *
 */
public class ImplRepostaje implements InterfazRepostaje{

	@Override
	public List<Repostaje> addRepostajeNormal(List<Repostaje> listaAntiguaRepostaje) {
		Repostaje repostaje = new Repostaje();
		Scanner valores = new Scanner(System.in);
		System.out.println("Introduzca los litros repostados: ");
		repostaje.setLitros(valores.nextDouble());
		System.out.println("Introduzca el importe total: ");
		repostaje.setImporte(valores.nextDouble());
		System.out.println("Introduzca la fecha del respostaje con formato yyyy-MM-dd hh:mm:ss: ");
		repostaje.setFchRepostaje(valores.next());
		repostaje.setId(calculoNuevoId(listaAntiguaRepostaje));
		listaAntiguaRepostaje.add(repostaje);
		return listaAntiguaRepostaje;
	}
	
	/**
	 * Calcular el id del nuevo repostaje
	 * @param listaRepostajes lista actual de repostajes
	 * @return id de un nuevo repostaje
	 */
	private int calculoNuevoId(List<Repostaje> listaRepostajes) {
		int auxiliar = 0;
		
		for(int i=0;i<listaRepostajes.size();i++) {
			
			int j = listaRepostajes.get(i).getId();
			if(auxiliar < j) {
				auxiliar = j;
			}
			
		}
		return auxiliar+1;
	}

	@Override
	public List<Repostaje> addRepostajeFactura(List<Repostaje> listaAntiguaRepostaje) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listarTodosRepostajes(List<Repostaje> listaRepostaje) {
		// TODO Auto-generated method stub
		
	}
	
}
