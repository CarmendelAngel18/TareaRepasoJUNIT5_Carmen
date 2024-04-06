public class Vocales {
    public static int contarVocales(String cadena) {
        int contador = 0;
        cadena = cadena.toLowerCase();

        String vocales = "aeiou";

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (vocales.contains(String.valueOf(caracter))) {
                contador++;
            }
        }

        return contador;
    }

}
