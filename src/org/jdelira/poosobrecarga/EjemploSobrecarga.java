package org.jdelira.poosobrecarga;

public class EjemploSobrecarga {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();

        System.out.println("sumar int : " + cal.sumar(10, 5));
    }
}
