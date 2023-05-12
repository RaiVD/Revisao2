package Exercicios;

//5. Crie um programa para exibir todos os inteiros dentro do
//        intervalo 100-150 cuja soma de todos os dígitos é um
//        número par.

public class Exercicio5 {
    public static void main(String[] args) {

        for (int i = 100; i <= 150; i++) {

            String numeros = String.valueOf(i);

            int soma = 0;
            for (int j = 0; j < numeros.length(); j++) {

                soma += Character.getNumericValue(numeros.charAt(j));
            }

            if (soma % 2 == 0) {

                System.out.println(i +" = "+ soma);
            }
            System.out.println("-------------------------------------------");
        }
    }
}
