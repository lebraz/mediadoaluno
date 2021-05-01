package com.company;

import java.util.Scanner;

public class mediadoaluno {

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;
        int faltas;
        String nome;

        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Olá aluno(a), seja muito bem vindo!");
            System.out.println("Insira o nome do aluno: ");
            nome=ler.next();
            System.out.println("Insira a nota da primeira prova: ");
            nota1=ler.nextDouble();
            System.out.println("Insira a nota da segunda prova: ");
            nota2=ler.nextDouble();
            System.out.println("Insira a nota da terceira prova: ");
            nota3=ler.nextDouble();
            System.out.println("Insira a porcentagem de faltas: ");
            faltas=ler.nextInt();
        }
        media = (nota1+nota2+nota3)/3;

        if(media>7.0 && faltas < 68*0.25)
        {
        }else if (media > 7.0) {
            System.out.printf("Parabéns "+nome+", você foi aprovado(a)! Sua média foi: " + media);
        }else{
            if (faltas > 68*0.25) {
                System.out.printf(nome+ ",você foi reprovado(a)por falta: "+faltas);
            }else if (media < 7){
            System.out.printf(nome+",você foi reprovado(a)!: "+media);
            }
            }
            }
        }

