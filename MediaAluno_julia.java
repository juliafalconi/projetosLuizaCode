package com.company;

import java.util.Scanner;
class Main {
    public static void main(String args[]) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira a primeira nota ");
        float nota1 = leitura.nextInt();
        System.out.println("Insira a segunda nota");
        float nota2 = leitura.nextInt();
        System.out.println("Insira a terceira nota");
        float nota3 = leitura.nextInt();
        System.out.println("Insira o número de faltas");
        int faltas = leitura.nextInt();

        float media = (nota1+nota2+nota3)/3;

        if(media>7.0 && faltas < 68*0.25){
            System.out.println("Aluno aprovado por nota! ====PARABÉNS==== SUA MÉDIA FOI: "+ media);
        }else if(media > 7.0){
            System.out.println("Aluno aprovado por nota! ====PARABÉNS==== SUA MÉDIA FOI:  "+ media);
        }else{
            if(media > 7.0 && faltas > 68*0.25){
                System.out.println("Aluno reprovado por faltas");
            }else if(media < 7.0 && faltas > 68*0.25){
                System.out.println("Aluno reprovado por faltas");
            }else if(media < 7.0 ){
                System.out.println("Aluno reprovado por nota: " + media);
            }
        }
    }
}