package com.programacion;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Pizzas miPizza = new BuilderPizzas()
                .setMasa(0)
                .setAceitunas(false)
                .setConAtun(true)
                .setConCebolla(true)
                .setConGluten(true)
                .setConPepperoni(false)
                .setConQueso(true)
                .setConRelleno(true)
                .setConSalchichas(false)
                .setDomicilio(2)
                .setTamaño(4)
                .build();

        System.out.println(miPizza.toString());

    }
}
