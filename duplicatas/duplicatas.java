/*
Desafio: Verificar Duplicatas em um Array
Problema: Escreva um programa que verifique se há elementos duplicados em um array de inteiros. Se houver duplicatas, o programa deve retornar true; caso contrário, false.
Exemplo:

Entrada: [1, 2, 3, 4, 5]
Saída: false (não há duplicatas)

Entrada: [1, 2, 3, 4, 1]
Saída: true (há duplicatas)

Restrições:
- A solução deve ter complexidade aceitável para arrays grandes.
- Não é permitido usar estruturas de dados prontas que eliminem duplicatas automaticamente (como Set).
*/

import java.util.Arrays;

public class duplicatas{

    public static void main(String[] args){
        int[] num = {1, 5, 4 ,3, 2, 2};

        boolean duplicatas = Arrays.stream(num).distinct().count() != num.length;

        if(duplicatas) {
            System.out.println("O Array contem duplicatas");
        }else{
            System.out.println("O array nao contem duplicatas");
        }
    }
}