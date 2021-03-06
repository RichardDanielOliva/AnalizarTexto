public class ProgramaTextoParaAnalizar{
	public static void main(String[] args) {
		String texto = "Querido Nino Jesus: Desde esta tierra de gracia, que ya no lo es porque algunos desgraciados la han echado a perder, te voy a pedir que me traigas a mi y a todos los ninos de mi patria, que incluyas a los ninos de la calle y a los Panchitos Mandefua, algunas cosas que te sonarán extrañas porque no las vas a poder envolver como regalos. Te voy a pedir primero, paz y libertad, no solo para todos los presos injustamente encarcelados en inmundos calabozos, para los privados de libertad, llamados presos comunes, que sufren igualmente de la injusticia, pero sobre todo para los casi 30 millones de compatriotas que hoy desconocen el significado de esas palabras. Te voy a pedir alimentos, porque, aunque tú no lo creas, en esta tierra bendita no tenemos comida para mantener una dieta considerada apropiada y hoy sufrimos desnutricion y hasta muertes por la hambruna. Te voy a pedir muchas medicinas, porque nuestros enfermos mueren adoloridos por falta de calmantes y, por supuesto, sin remedio para su recuperacion o cura. Te pido que aquellas familias que han dejado su tierra y que estan separadas por esta desgracia puedan unirse nuevamente en un gran abrazo fraternal. Te pido que podamos crecer como patria, con educacion para nuestros niños y jóvenes, y que ellos puedan obtener los conocimientos y sabiduria para que su futuro sea el mejor posible. Te pido la recuperacion de la industria nacional. Que haya pleno empleo y que la fuerza laboral pueda obtener nuevamente su superacion personal y profesional, con remuneraciones dignas. Te pido, muy encarecidamente, que nos regales los gobernantes capaces de respetar a nuestro pueblo soberano para reconducir al país por un camino lleno de esperanza y fe, porque ambas las hemos sacrificado al no otear un futuro en el horizonte. Te voy a pedir, simplemente, que no nos olvides, nos des la bendicion y nos visites en esta Navidad. Ejemplo palindromo: Amor a Roma, Atar a la rata,";
		String [] listaCatalogRegalos = {"LIBERTAD", "PAZ", "ALIMENTOS", "MEDICINAS", "UNION", "RECUPERACION", "EMPLEO", "EDUCACION", "ESPERANZA", "RESPETO", "FAMILIA", "CRECIMIENTO", "SABIDURIA", "SUPERACION"};
		
		AnalizarTexto opcionA = new AnalizarTexto(texto, listaCatalogRegalos);
		
		AnalizarTexto opcionB = new AnalizarTexto();

		System.out.println("Numero de palabras encontradas: " + opcionA.determinarNumPalabras());

		String[] opcionAListaPalabras = opcionA.obtenerPalabrasTexto();

		for (int a = 0; a < opcionAListaPalabras.length; a++) {
			System.out.println(opcionAListaPalabras[a]);
		}

		System.out.println("Palabras encontradas: " + opcionA.encontrarPalabras());

		System.out.println(opcionA.numAparacionesListaPalabras());

		System.out.println("Numero de caracteres especiales: " + opcionA.numOtrosCaracteres());

		System.out.println("Lista de caracteres especiales: " + opcionA.getOtrosCaracteres());

		System.out.println("Numero de palindromos: " + opcionA.obtenerNumPalindromos());

		System.out.println("Lista de palindromos: " + opcionA.getPalabrasPalindromo());
	}
}