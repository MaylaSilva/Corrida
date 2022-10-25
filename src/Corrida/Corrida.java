package Corrida;

import java.util.Scanner;

public class Corrida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, você está em uma corrida. Digite seus dados e boa corrida");

        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite sua idade: ");
        Integer idade = sc.nextInt();
        System.out.println("Digite o nome da sua equipe");
        String equipe = sc.next();

        Piloto corredor = new Piloto(nome, idade, Sexo.FEMININO, equipe);
        System.out.println(corredor);

        System.out.println("Digite agora a velocidade máxima da pista: ");
        Float maxima = sc.nextFloat();

        CarroCorrida carroCorredor = new CarroCorrida(3,corredor,maxima,0f,true);
        System.out.println("O número do seu carro será: " + carroCorredor.getNumeroCarro());

        System.out.println("Quantos km/h você irá acelerar?");
        Float acelerando = sc.nextFloat();
        CarroCorrida.acelerar(maxima, carroCorredor.getVelocidadeAtual(), acelerando,carroCorredor.getLigado());

        System.out.println("Quantos km/h você irá frear?");
        Float freando = sc.nextFloat();
        CarroCorrida.frear(carroCorredor.getVelocidadeAtual(), carroCorredor.getLigado(),freando);

        CarroCorrida.desligar(false, carroCorredor.getVelocidadeAtual());


/*        System.out.println("Você poderá: \n" +
                "1.Acelerar; \n" +
                "2.Frear; \n" +
                "3.Parar o carro; \n" +
                "4.Desligar o carro; \n" +
                "5.Ligar o carro. \n" +
                "O que deseja fazer?")

                Vou continuar o projeto para que possa acrescentar mais detalhes

 */


    }
}
