/*
Desafio: Reverter uma String
Problema: Escreva uma função que receba uma string como entrada e retorne essa string invertida.
Exemplo:

Entrada: "developer"
Saída: "repoleved"
*/

public class reverterString{
   public static void main(String[] args) {
        String textoOriginal = "developer";
        StringBuilder textoRevertido = new StringBuilder(textoOriginal);
        System.out.println("Original: " + textoOriginal + " | Reverso: " + textoRevertido.reverse());
    }
}