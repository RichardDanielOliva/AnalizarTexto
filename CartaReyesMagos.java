public class CartaReyesMagos implements Analizable{
	public CartaReyesMagos(String carta){
		String[] getPalabras = new String [obtenerNumPalabras()];
	}


	public int obtenerNumPalabras(){
		int resultados= 0;
		for (int a = 0; a < texto.length(); a++) {
			if (texto.charAt(a)==' ')
				resultado++;
		}
		return resultado;
	}

	public String[] getPalabras(){
		int numPalabra;
		char auxMayus = 'A';
		char auxMinus = 'a';
		String[] listaPalabras;

		for (int a = 0; a < texto.length(); a++) {
			if (auxMayus - texto.charAt(a) < 26 || auxMinus - texto.charAt(a) < 26)
				listaPalabras[numPalabra] += texto.charAt(a);
			 	else if (texto.charAt(a)==' ')
			 		numPalabra++;
		}
	}

	public String[] aMayusculas(String [] palabras){
		for (int a = 0; a < palabras.length; a++) {
			palabras[a]=palabras[a].toUpperCase();
		}

		return palabras[];
	}

	public String[] getRegalos(String[] listaCatalogRegalos){
		for (int a = 0; a < palabras.length; a++) {
			for (int b = 0; b < listaCatalogRegalos.length; b++) {
				for (int c = 0; (c < auxRegalos+1); c++)
					if (palabras[a].equals(listaCatalogRegalos[b]) &&
					(palabras[a].equals(listaRegalos[c]))){
						listaRegalos[auxRegalos] = palabras[a];
						auxRegalos++; 
					}
			}
		}
	}

	public int getPalindromos(){
		int resultado; 

		for (int a = 0; a < palabras.length; a++){
			auxPalabra = obtenerPalindromo(palabras[a]);
			for (int b = 0; b < palabras.length; b++) {
				if (auxPalabra.equals(palabras[b]))
					resultado++;
			}
		}
		return resultado;
	}

	public String obtenerPalindromo(String palabra){
		String resultado = "";

		for (int a = 0; a < palabras.length(); a++){
			resultado += palabras.charAt(palabras.length()-a);
		}

		return resultado;
	}
}