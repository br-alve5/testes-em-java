/*
Desafio: Encontrar o Maior Número em um Array
Problema: Escreva um programa que encontre o maior número em um array de inteiros.
Exemplo:

Entrada: [3, 7, 2, 9, 5]

Saída: 9

Restrições:
- Não utilize métodos prontos como Collections.max() ou Arrays.sort(). A ideia é que você percorra o array e encontre o maior número manualmente.
- Seu programa deve funcionar para arrays de qualquer tamanho, inclusive arrays com um único elemento.
*/
public class arrayMaior{
    public static void main(String[] args){
        int[] num = {1, 7, 5, 3, 4};

        int maior = num[0];

        for(int i = 1; i < num.length; i++){
            if (num[i] > maior){
                maior = num[i];
            }
        }
        System.out.println("O maior array é:");
        System.out.println(maior);
    }
}