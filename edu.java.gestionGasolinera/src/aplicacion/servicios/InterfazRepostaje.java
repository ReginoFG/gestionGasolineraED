package aplicacion.servicios;

import java.util.List;

import aplicacion.entidades.Repostaje;
/**
 * Interfaz que define los métodos que dan servicio a la gestión de repostajes
 * @author garfe
 *
 */
public interface InterfazRepostaje {
	
	/**
	 * Actualiza la lista de repostajes con el nuevo repostaje normal
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	public List<Repostaje> addRepostajeNormal(List<Repostaje> listaAntiguaRepostaje);
	
	/**
	 * Actualiza la lista de repostajes con el nuevo repostaje con factura
	 * @param listaAntiguaRepostaje lista actual
	 * @return lista actualizada
	 */
	public List<Repostaje> addRepostajeFactura(List<Repostaje> listaAntiguaRepostaje);
	
	/**
	 * Imprime por consola el listado de repostajes existente
	 * @param listaRepostaje lista actual
	 */
	public void listarTodosRepostajes(List<Repostaje> listaRepostaje);

}
