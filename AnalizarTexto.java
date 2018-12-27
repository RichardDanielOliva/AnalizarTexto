public class AnalizarTexto {
	private int numPalabrasTexto;
	private String texto;
	private String [] listaPalabrasTexto;
	private char auxPalabrasTextoMinus = 'a';
	private char auxPalabrasTextoMayus = 'A';
	private int [] auxPalabrasEncontradas;
	private String palabrasEncontradas;
	private String numAparacionespalabrasEcontradas;
	public String otrosCaracteres;
	public int numOtrosCaracteres;
	public int numPalindromo;
	public String palabrasPalindromo;
	
	public AnalizarTexto(){

	}

	public AnalizarTexto(String texto, String[] listaPalabrasABuscar){
		setTexto(texto);
		setNunPalabrasTexto();
		setlistaPalabrasTexto();
		setPalabrasEncontradas();
		setNumAparacionespalabrasEcontradas();
		setNumCaracteres();
		setNumPalindromos();
	}

	public void setTexto(String texto){
		this.texto = texto;
	}

	public void setNunPalabrasTexto(){
		this.numPalabrasTexto = determinarNumPalabras(this.texto);
	}

	public int determinarNumPalabras(){
		return numPalabrasTexto;
	}

	public int determinarNumPalabras(String texto){
		int resultado = 1;

		for (int a = 0; a < texto.length(); a++) {
			if (texto.charAt(a)==' ') resultado++;
		}
		return resultado;
	}

	public void setlistaPalabrasTexto(){
		this.listaPalabrasTexto = obtenerPalabrasTexto(this.texto);
	}

	public String[] obtenerPalabrasTexto(){
		return listaPalabrasTexto;
	}

	public String[] obtenerPalabrasTexto(String texto){
		int numPalabrasTexto = determinarNumPalabras(texto);
		String [] resultado = new String [numPalabrasTexto];
		resultado = inicializarlistaPalabrasTexto(resultado);
		int cambioPalabra = 0;

		for (int a = 0; a < texto.length(); a++) {
			if (texto.charAt(a) == ' ') cambioPalabra++;
				else {
					for (int b = 0; b < 26; b++) {//revisar si es 26 o 25
						if (texto.charAt(a) == (auxPalabrasTextoMinus + b) || texto.charAt(a) == (auxPalabrasTextoMayus + b)){
							resultado[cambioPalabra] += texto.charAt(a);
							b = 26;
						}  
					}
				}
		}
		return resultado;
	}

	public String [] inicializarlistaPalabrasTexto(String [] resultado){
		for (int a = 0; a < resultado.length; a++) {
			resultado[a] = "";
		}
		return resultado;
	}

	public void setAuxPalabrasEncontradas(String[] palabrasTexto, String[] listaPalabras){
		for (int a = 0; a < palabrasTexto.length; a++) {
			for (int b = 0; b < listaPalabras.length; b++) {
				if (palabrasTexto[a].equalsIgnoreCase(listaPalabras[b])) {
					auxPalabrasEncontradas[b]++;
					b = listaPalabras.length;
				}
			}
		}
	}

	public void setPalabrasEncontradas(){
		this.palabrasEncontradas = encontrarPalabras(this.texto, this.listaPalabrasTexto);
	}

	public String encontrarPalabras(){
		return palabrasEncontradas;
	}

	public String encontrarPalabras(String texto, String[] listaPalabras){
		String[] palabrasTexto = obtenerPalabrasTexto(texto);
		auxPalabrasEncontradas = new int [listaPalabras.length];
		String resultado = "";
		setAuxPalabrasEncontradas(palabrasTexto, listaPalabras);

		for (int c = 0; c < listaPalabras.length; c++){
			if (auxPalabrasEncontradas[c]>0) resultado+= listaPalabras[c] + "\n";
		}

		return resultado;
	}

	public void setNumAparacionespalabrasEcontradas(){
		this.numAparacionespalabrasEcontradas = numAparacionesListaPalabras(this.texto, this.listaPalabrasTexto);
	}

	public String numAparacionesListaPalabras(){
		return numAparacionespalabrasEcontradas;
	}

	public String numAparacionesListaPalabras(String texto, String[] listaPalabras){
		String[] palabrasTexto = obtenerPalabrasTexto(texto);
		auxPalabrasEncontradas = new int [listaPalabras.length];
		setAuxPalabrasEncontradas(palabrasTexto, listaPalabras);
		String resultado = "";

		for (int c = 0; c < listaPalabras.length; c++){
			resultado+= "la palabra: " + listaPalabras[c] + " fue encotrada " + auxPalabrasEncontradas[c] + " veces." + "\n";
		}

		return resultado;
	}

	public void setNumCaracteres(){
		this.numOtrosCaracteres = numOtrosCaracteres(this.texto);
	}

	public int numOtrosCaracteres(){
		return numOtrosCaracteres;
	}

	public int numOtrosCaracteres(String texto){
		int resultado = 0;
		this.otrosCaracteres = "";

		for (int a = 0; a < texto.length(); a++) {
			if (texto.charAt(a) != ' '){
				boolean auxNoEncontrado = true;
				for (int b = 0; b < 26; b++) {
					if (texto.charAt(a) == (auxPalabrasTextoMinus + b) || texto.charAt(a) == (auxPalabrasTextoMayus + b)) auxNoEncontrado = false;
				}
				if(auxNoEncontrado) {
					resultado++;
					this.otrosCaracteres += "Caracter " + resultado + ": " + texto.charAt(a) + "\n";
				}
			}
		}
		return resultado;
	}

	public String getOtrosCaracteres(){
		return otrosCaracteres;
	}

	public void setNumPalindromos(){
		this.numPalindromo = obtenerNumPalindromos(this.texto);
	}

	public int obtenerNumPalindromos(){
		return numPalindromo;
	}

	public int obtenerNumPalindromos(String texto){
		int resultado = 0;
		String[] palabrasTexto = obtenerPalabrasTexto(texto); 
		String auxPalabra;
		this.palabrasPalindromo = "";

		for (int a = 0; a < palabrasTexto.length; a++){
			if (palabrasTexto[a].length() > 1){
				auxPalabra = "";
				auxPalabra = obtenerAuxPalindromo(palabrasTexto[a]);
				for (int b = 0; b < palabrasTexto.length; b++) {
					if (auxPalabra.equalsIgnoreCase(palabrasTexto[b])){
						resultado++;
						palabrasPalindromo += "Palindromo " + resultado + ": " + auxPalabra.toUpperCase() + "\n";
						b = palabrasTexto.length;
					}
				}
			}
		}
		return resultado;
	}

	public String obtenerAuxPalindromo(String palabra){
		String resultado = "";

		for (int a = 1; a <= palabra.length(); a++){
			resultado += palabra.charAt(palabra.length() - a);
		}

		return resultado;
	}

	public String getPalabrasPalindromo(){
		return palabrasPalindromo;
	}
}