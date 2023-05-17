package com.mycompany.calculadora_1;
import java.util.Scanner;

public class Calculadora_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculo c = new Calculo();

        String escolha = "0";
        boolean i = true;
                
        while (i){
            System.out.print("Digite um número: ");
            c.setValor1(ler.nextFloat());

            System.out.print("Escolha o operador do seu calculo: ");
            escolha = ler.next();
            
            System.out.print("Digite mais um número: ");
            c.setValor2(ler.nextFloat());
            
            switch(escolha){
                case "+":
                    System.out.println(c.somaValores());
                    break;
                case "-":
                    System.out.println(c.subtrairValores());
                    break;
                case "/":
                    System.out.println(c.dividirValores());
                    break;
                case "*":
                    System.out.println(c.mediaValores());
                    break;          
                }
            System.out.println("Repetir? '0' para sim e '1' para sair: ");
            int temp = ler.nextInt();
            
            if (temp == 1){
                i = false;
            }
            else{
                System.out.println("recomeçando.. ");
            }
        }  
    }
}