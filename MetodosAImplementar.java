public interface MetodosAImplementar{

	int determinarNumPalabras();
	int determinarNumPalabras(String texto);
	String[] obtenerPalabrasTexto();
	String[] obtenerPalabrasTexto(String texto);
	String encontrarPalabras();
	String encontrarPalabras(String texto, String[] listaPalabras);
	String numAparacionesListaPalabras();
	String numAparacionesListaPalabras(String texto, String[] listaPalabras);
	int numOtrosCaracteres();
	int numOtrosCaracteres(String texto);
	int obtenerNumPalindromos(); 
	int obtenerNumPalindromos(String texto);

	/*Proximamente:
		int contarnumeros();
		int obtenerNumeros();
		boolean verificarContrasenaValida();
	*/
}