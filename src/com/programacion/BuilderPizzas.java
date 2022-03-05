package com.programacion;

public class BuilderPizzas {

    protected Pizzas _pizza;

    public Pizzas build() {
        return this._pizza;
    }

    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    public BuilderPizzas setMasa(int masa) {
        _pizza.setMasa(masa);
        return this;
    }
    public BuilderPizzas setTamaño(int tamaño) {
        _pizza.setTamaño(tamaño);
        return this;
    }
    public BuilderPizzas setConQueso(boolean conQueso) {
        _pizza.setConQueso(conQueso);
        return this;
    }
    public BuilderPizzas setAceitunas(boolean conAceitunas) {
        _pizza.setConAceitunas(conAceitunas);
        return this;
    }
    public BuilderPizzas setConAtun(boolean conAtun) {
        _pizza.setConAtun(conAtun);
        return this;
    }
    public BuilderPizzas setConSalchichas(boolean conSalchichas) {
        _pizza.setConSalchichas(conSalchichas);
        return this;
    }
    public BuilderPizzas setConRelleno(boolean conRelleno) {
        _pizza.setConRelleno(conRelleno);
        return this;
    }
    public BuilderPizzas setConPepperoni(boolean conPepperoni) {
        _pizza.setConPepperoni(conPepperoni);
        return this;
    }
    public BuilderPizzas setConCebolla(boolean conCebolla) {
        _pizza.setConCebolla(conCebolla);
        return this;
    }
    public BuilderPizzas setConGluten(boolean conGluten) {
        _pizza.setConGluten(conGluten);
        return this;
    }
    public BuilderPizzas setDomicilio(int domicilio) {
        _pizza.setDomicilio(domicilio);
        return this;
    }
}
