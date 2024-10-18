/*
Desafio: Verificar Palíndromo
Problema: Escreva uma função que verifique se uma string é um palíndromo. Um palíndromo é uma palavra, frase, número ou qualquer sequência de caracteres que lê da mesma forma de trás para frente (ignorando espaços e diferenças de maiúsculas/minúsculas).
Exemplo:

Entrada: "arara"
Saída: true

Entrada: "developer"
Saída: false
*/

public class palindromo{
    public static void main(String[] args){

        String palavra = "level";

        StringBuffer sb = new StringBuffer(palavra);

        String rev = sb.reverse().toString();

        boolean Palindromo = palavra.equalsIgnoreCase(rev);

        if (Palindromo) {
            System.out.println("A palavra \"" + palavra + "\" e um palindromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" nao e um palindromo.");
        }
    }
}