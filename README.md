# AnalizarTexto
## Descripción y contexto 
Conjunto de herramienta que permiten identificar ciertas características y coincidencias en un texto. 

Entre las funcionalidades disponibles (AnalizarTexto.java) se tienen:

1. Determinar el numero y disponer de una lista de las palabras que aparecen en un texto dado.
2. Verificar la existencia de alguna palabra.
3. Determinar el numero de veces que aparece una palabra.
4. Conocer el numero u obtener una lista de caracteres especiales que no sean letras del abecedario (incluye números).
5. Conocer el numero y disponer de una lista de las palabras Palíndromos que aparecen en un texto.

## Guía de usuario
Se establecen dos alternativas para el uso del código: 

1. Opción A: enviamos la información necesaria al constructor al inicializar nuestro objeto. 
2. Opción B: inicializamos un objeto sin ningún tipo de dato y en función del método que necesitamos, enviamos la información requerida.

Nota: el texto analizar deberá ser del tipo String y las palabras a encontrar deben organizarse en un array de String.

Entre los métodos disponibles se tiene:

#### 1. Para determinar el numero de palabras:

1.1 Opción A: public int determinarNumPalabras();

1.2 Opción B: public int determinarNumPalabras(String texto);

#### 2. Para obtener una lista con todas las palabras de un texto:

2.1 Opción A: public String[] obtenerPalabrasTexto();

2.2 Opción B: public String[] obtenerPalabrasTexto(String texto);

#### 3. Verificar la existencia de una o varias palabras en un texto:

3.1 Opción A: public String encontrarPalabras();

3.2 Opción B: public String encontrarPalabras(String texto, String[] listaPalabras);

#### 4. Determinar el numero de veces que aparece una palabra.

4.1 Opción A: public String numAparacionesListaPalabras();

4.2 Opción B: public String numAparacionesListaPalabras(String texto, String[] listaPalabras);

#### 5. Conocer otros caracteres que aparecen en el texto además de las letras del abecedario.

5.1 Opción A: public int numOtrosCaracteres();

5.2 Opción B: public int numOtrosCaracteres(String texto);

Nota: con los métodos anteriores se obtiene el numero de caracteres que aparecen en el texto. Si se quiere saber cuales son debemos ejecutar, para ambos casos, el metodo public String getOtrosCaracteres(); posteriormente.

#### 6. Obtener las palabras Palíndromos que aparecen en un texto

6.1 Opción A: public int obtenerNumPalindromos();

6.2 Opción B: public int obtenerNumPalindromos(String texto);

Nota: con los métodos anteriores se obtiene el numero de palíndromos que aparecen en el texto. Si se quiere saber cuales son debemos ejecutar, para ambos casos, el metodo public String getPalabrasPalindromo(); posteriormente.

## Autor/es
Richard Daniel Oliva Denis. danielolivadenis@gmail.com

## Ejemplo con Imágenes

Disponible como ejecutable en ProgramaTextoParaAnalizar.java

#### Texto y palabras a buscar
Autor del texto de prueba: @LeopoldoLopezG Disponible en http://www.el-nacional.com/noticias/columnista/carta-nino-jesus_216407 

    String texto = "Querido Nino Jesus: Desde esta tierra de gracia, que ya no lo es porque algunos desgraciados la han echado a perder, 
    te voy a pedir que me traigas a mi y a todos los ninos de mi patria, que incluyas a los ninos de la calle y a los Panchitos 
    Mandefua, algunas cosas que te sonarán extrañas porque no las vas a poder envolver como regalos. Te voy a pedir primero, paz y 
    libertad, no solo para todos los presos injustamente encarcelados en inmundos calabozos, para los privados de libertad, llamados 
    presos comunes, que sufren igualmente de la injusticia, pero sobre todo para los casi 30 millones de compatriotas que hoy desconocen 
    el significado de esas palabras. Te voy a pedir alimentos, porque, aunque tú no lo creas, en esta tierra bendita no tenemos comida 
    para mantener una dieta considerada apropiada y hoy sufrimos desnutricion y hasta muertes por la hambruna. Te voy a pedir muchas 
    medicinas, porque nuestros enfermos mueren adoloridos por falta de calmantes y, por supuesto, sin remedio para su recuperacion o 
    cura. Te pido que aquellas familias que han dejado su tierra y que estan separadas por esta desgracia puedan unirse nuevamente en un 
    gran abrazo fraternal. Te pido que podamos crecer como patria, con educacion para nuestros niños y jóvenes, y que ellos puedan 
    obtener los conocimientos y sabiduria para que su futuro sea el mejor posible. Te pido la recuperacion de la industria nacional. Que 
    haya pleno empleo y que la fuerza laboral pueda obtener nuevamente su superacion personal y profesional, con remuneraciones dignas. 
    Te pido, muy encarecidamente, que nos regales los gobernantes capaces de respetar a nuestro pueblo soberano para reconducir al país 
    por un camino lleno de esperanza y fe, porque ambas las hemos sacrificado al no otear un futuro en el horizonte. Te voy a pedir, 
    simplemente, que no nos olvides, nos des la bendicion y nos visites en esta Navidad. Ejemplo palindromo: Amor a Roma, Atar a la 
    rata,";

    String [] listaCatalogRegalos = {"LIBERTAD", "PAZ", "ALIMENTOS", "MEDICINAS", "UNION", "RECUPERACION", "EMPLEO", "EDUCACION", 
    "ESPERANZA", "RESPETO", "FAMILIA", "CRECIMIENTO", "SABIDURIA", "SUPERACION"};
	
#### Determinar el numero y disponer de una lista de las palabras que aparecen en un texto dado.



1. Determinar el numero y disponer de una lista de las palabras que aparecen en un texto dado.
2. Verificar la existencia de alguna palabra.
3. Determinar el numero de veces que aparece una palabra.
4. Conocer el numero u obtener una lista de caracteres especiales que no sean letras del abecedario (incluye números).
5. Conocer el numero y disponer de una lista de las palabras Palíndromos que aparecen en un texto.

