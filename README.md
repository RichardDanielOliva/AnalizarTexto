# AnalizarTexto
## Descripción y contexto 
Conjunto de herramienta que permiten identificar ciertas características y coincidencias en un texto. 

Entre las funcionalidades disponibles se tienen:

1. Determinar el numero y disponer de una lista de las palabras que aparecen en un texto dado.
2. Verificar la existencia de alguna palabra.
3. Determinar el numero de veces que aparece una palabra.
4. Conocer el numero u obtener una lista de caracteres especiales que no sean letras del abcedario (incluye numeros).
5. Conocer el numero y disponer de una lista de las palabras Palindromos que aparecen en un texto.

## Guía de usuario
Se establecen dos alternativas para el uso del código: 

1. Opción A: enviamos la información necesaria al constructor al inicializar nuestro objeto. 
2. Opción B: inicializamos un objeto sin ningun tipo de dato y en función del método que necesitamos, enviamos la información requerida.

Nota: el texto analizar debera ser del tipo String y las palabras a encontrar deben organizarse en un array de String.

Entre los metodos disponibles se tiene:

#### 1. Para determinar el numero de palabras:

1.1 Opcion A: public int determinarNumPalabras();

1.2 Opcion B: public int determinarNumPalabras(String texto);

#### 2. Para obtener una lista con todas las palabras de un texto:

2.1 Opcion A: public String[] obtenerPalabrasTexto();

2.2 Opcion B: public String[] obtenerPalabrasTexto(String texto);

#### 3. Verificar la existencia de una o varias palabras en un texto:

3.1 Opcion A: public String encontrarPalabras();

3.2 Opcion B: public String encontrarPalabras(String texto, String[] listaPalabras);

#### 4. Determinar el numero de veces que aparece una palabra.

4.1 Opcion A: public String numAparacionesListaPalabras();

4.2 Opcion B: public String numAparacionesListaPalabras(String texto, String[] listaPalabras);

#### 5. Conocer otros caracteres que aparecen en el texto ademas de las letras del abecedario.

5.1 Opcion A: public int numOtrosCaracteres();

5.2 Opcion B: public int numOtrosCaracteres(String texto);

Nota: con los metodos anteriores se obtiene el numero de carateres que aparecen en el texto. Si se quiere saber cuales son debemos ejecutar, para ambos casos, el metodo public String getOtrosCaracteres(); posteriormente.

#### 6. Obtener las palabras Palindromos que aparecen en un texto

5.1 Opcion A: public int obtenerNumPalindromos();

5.2 Opcion B: public int obtenerNumPalindromos(String texto);

Nota: con los metodos anteriores se obtiene el numero de palindromos que aparecen en el texto. Si se quiere saber cuales son debemos ejecutar, para ambos casos, el metodo public String getPalabrasPalindromo(); posteriormente.

## Autor/es
Richard Daniel Oliva Denis. danielolivadenis@gmail.com



