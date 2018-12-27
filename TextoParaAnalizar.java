public class TextoParaAnalizar implements Analizable{
	public String texto;
	public String [] listaPalabras, listaCatalogRegalos;
	private int [] auxCatalogRegalos;

	public TextoParaAnalizar(String texto, String[] listaCatalogRegalos){
		setTexto(texto);
		setlistaCatalogRegalos(listaCatalogRegalos);
		setPalabras();
		aMayusculas();
		setAuxCatalogRegalos();
	}

	public void mostrarResumenTexto(){
		System.out.println("Numero de palabras: " + obtenerNumPalabras());

		System.out.println("Lista de regalos: " + getRegalos());

		for (int a = 0; a < auxCatalogRegalos.length;a++) {
			System.out.println(auxCatalogRegalos[a]);
		}

		System.out.println("Numero de palindromos: " + getPalindromos());

	 //obtener numero de veces que aparece una palabras
	}

	public void setlistaCatalogRegalos(String [] listaCatalogRegalos){
		this.listaCatalogRegalos = listaCatalogRegalos;
		this.auxCatalogRegalos = new int [listaCatalogRegalos.length];
	}

	public void setTexto(String texto){
		this.texto = texto;
	}

	public String getTexto(){
		return texto;
	}

	public int obtenerNumPalabras(){
		int resultado = 1;
		for (int a = 0; a < texto.length(); a++) {
			if (texto.charAt(a)==' ')
				resultado++;
		}
		return resultado;
	}

	public void setPalabras(){
		int numPalabra = 0;
		char auxMayus = 'A';
		char auxMinus = 'a';
		listaPalabras = new String [obtenerNumPalabras()];

		for (int a = 0; a < texto.length(); a++) {
			if (auxMayus - texto.charAt(a) < 26 || auxMinus - texto.charAt(a) < 26)
				listaPalabras[numPalabra] += texto.charAt(a);
			 	else {
			 		if (texto.charAt(a)==' ')
			 		numPalabra++;
				}
		}
	}

	public String [] aMayusculas(String [] listaPalabras){
		for (int a = 0; a < listaPalabras.length; a++) {
			listaPalabras[a]=listaPalabras[a].toUpperCase();
		}

		return listaPalabras;
	}

	public void aMayusculas(){
		for (int a = 0; a < this.listaPalabras.length; a++) {
			this.listaPalabras[a] = this.listaPalabras[a].toUpperCase();
		}
	}

	public void setAuxCatalogRegalos(){
		for (int a = 0; a < listaPalabras.length; a++) {
			for (int b = 0; b < listaCatalogRegalos.length; b++) {
				if (listaPalabras[a].equals(listaCatalogRegalos[b])){
					auxCatalogRegalos[b]++;
				}
			}
		}
	}

	public String getRegalos(){
		String resultado = "";
			for (int b = 0; b < listaCatalogRegalos.length; b++) {
				if (auxCatalogRegalos[b]>0)
					resultado += listaCatalogRegalos[b] + ",";
			}
		return resultado;
	}

	public int getPalindromos(){
		int resultado = 0; 
		String auxPalabra;

		for (int a = 0; a < listaPalabras.length; a++){
			auxPalabra = "";
			auxPalabra = obtenerPalindromo(listaPalabras[a]);
			for (int b = 0; b < listaPalabras.length; b++) {
				if (auxPalabra.equals(listaPalabras[b]))
					resultado++;
			}
		}
		return resultado;
	}

	public String obtenerPalindromo(String palabra){
		String resultado = "";

		for (int a = 1; a <= palabra.length(); a++){
			resultado += palabra.charAt(palabra.length() - a);
		}

		return resultado;
	}
}