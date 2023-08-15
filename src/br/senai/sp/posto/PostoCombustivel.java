package br.senai.sp.posto;

import java.util.Scanner;

public class PostoCombustivel {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double gasolina, etanol, calculo, formula, desconto;
        String nomeCliente, modeloCarro;

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\tOlá, bem-vindo ao Posto Rocha");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


            for(int i = 1; i <= 3; i ++){
                System.out.println("Qual é o seu nome:");
                nomeCliente = teclado.next();
                System.out.println("Qual é o seu carro:");
                modeloCarro = teclado.next();



                System.out.println("Hoje é seu dia de sorte " + nomeCliente +"! Você é o carro de nº"+ i+".");
                System.out.println("Você vai receber um desconto de 25% no valor da Gasolina.");

                System.out.println("Por favor, informe o valor da Gasolina:");
                gasolina = teclado.nextFloat();

                System.out.println("Agora, informe o valor do Etanol:");
                etanol = teclado.nextFloat();




                calculo = etanol / gasolina;
                formula = 0.7;
                desconto = (gasolina * 0.75);


                if(calculo <= formula){
                    System.out.println("Abasteça com Etanol!");

                } else {
                    System.out.println("DESCONTO APLICADO!");
                    System.out.println("Abasteça com Gasolina!");

                }
            }
    }
}
