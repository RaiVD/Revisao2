package Exercicios;

import java.util.Scanner;

//1. Tem-se um conjunto de dados contendo a altura e o sexo
// (masculino, feminino) de 10 pessoas. Fazer um algoritmo
// que calcule e escreva:
// a. a maior e a menor altura do grupo;
// b. média de altura dos homens;
// c. o número de mulheres.
public class Exercicio1 {
    public static void main(String[] args) {
        float altura, maiorAltura=0, menorAltura=0, somaMasculina=0, mediaAltura=0;
        int qtdFemenino=0, qtdMasculino=0;
        int sexo;

        Scanner entrada = new Scanner(System.in);

        for (int i=0; i<2; i++){
            System.out.println("Digite 1 para sexo Femenino ou digite 2 para sexo Masculino?");
            sexo = entrada.nextInt();
            System.out.println("Qual sua altura?");
            altura = entrada.nextFloat();

            if(sexo == 1){
                qtdFemenino++;

            }else if (sexo == 2){
                qtdMasculino++;
                somaMasculina = somaMasculina + altura;

            } else{
                System.out.println("Informação invalida!");
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;

            }else if (altura < menorAltura) {
                menorAltura = altura;
            }
        }

        mediaAltura = somaMasculina / qtdMasculino;

        System.out.println("Maior altura do grupo: "+maiorAltura);
        System.out.println("Menor altura do grupo: "+menorAltura);
        System.out.println("Média da altura dos homens: "+mediaAltura);
        System.out.println("Quantidade de mulheres: "+qtdFemenino);
    }

}
