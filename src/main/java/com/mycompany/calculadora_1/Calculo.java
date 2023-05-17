package com.mycompany.calculadora_1;

public class Calculo {
    private float valor1;
    private float valor2;
    
   //métodos constutores
    
    public Calculo(){
        valor1 = 0;
        valor2 = 0;
    }
    
    public Calculo(float v1){
        valor1 = v1;
        valor2 = 0;
    }
    
    public Calculo(float v1, float v2){
        valor1 = v1;
        valor2 = v2;
    }
    
    // métodos getters para retornar valores solicitados
    
    public float getValor1(){
        return valor1;
    }
    public float getValor2(){
        return valor2;
    }

    public float somaValores(){
        return valor1 + valor2;
    }
    
    public float subtrairValores(){
        return valor1 - valor2;
    }
    
    public float dividirValores(){
        return valor1 / valor2;
    }
    
    public float mediaValores(){
        return valor1 * valor2;
    }
    
    
//métodos setters para atribuição de valores das variaveis

    public void setValor1(float v1){
        this.valor1 = v1;
    }
    
    public void setValor2(float v2){
        this.valor2 = v2;
    }

}