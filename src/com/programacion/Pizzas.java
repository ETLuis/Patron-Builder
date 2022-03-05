package com.programacion;

public class Pizzas {
    private int masa;
    private int tamaño;
    private boolean conQueso;
    private boolean conAceitunas;
    private boolean conAtun;
    private boolean conSalchichas;
    private boolean conRelleno;
    private boolean conPepperoni;
    private boolean conCebolla;
    private boolean conGluten;
    private int domicilio;

    // Tipo de masa
    public static final int napolitana = 0;
    public static final int fina = 1;
    public static final int pan = 2;

    // Tamaño de la pizza
    public static final int mini = 0;
    public static final int pequeña = 1;
    public static final int mediana = 2;
    public static final int grande = 3;
    public static final int extraGrande = 4;

    // Entrega de la pizza
    public static final int tienda = 0;
    public static final int domicilio = 1;
    public static final int puntoDeRecogida = 2;

    public Pizzas() {
        this.masa = 0;
        this.tamaño = 4;
        this.conQueso = true;
        this.conAceitunas = true;
        this.conAtun = true;
        this.conSalchichas = true;
        this.conRelleno = false;
        this.conPepperoni = false;
        this.conCebolla = true;
        this.conGluten = false;
        this.domicilio = 2;
    }

    public Pizzas(int masa, int tamaño, boolean conQueso, boolean conAceitunas, boolean conAtun, boolean conSalchichas, boolean conRelleno, boolean conPepperoni, boolean conCebolla, boolean conGluten, int domicilio) {
        this.masa = masa;
        this.tamaño = tamaño;
        this.conQueso = conQueso;
        this.conAceitunas = conAceitunas;
        this.conAtun = conAtun;
        this.conSalchichas = conSalchichas;
        this.conRelleno = conRelleno;
        this.conPepperoni = conPepperoni;
        this.conCebolla = conCebolla;
        this.conGluten = conGluten;
        this.domicilio = domicilio;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isConQueso() {
        return conQueso;
    }

    public void setConQueso(boolean conQueso) {
        this.conQueso = conQueso;
    }

    public boolean isConAceitunas() {
        return conAceitunas;
    }

    public void setConAceitunas(boolean conAceitunas) {
        this.conAceitunas = conAceitunas;
    }

    public boolean isConAtun() {
        return conAtun;
    }

    public void setConAtun(boolean conAtun) {
        this.conAtun = conAtun;
    }

    public boolean isConSalchichas() {
        return conSalchichas;
    }

    public void setConSalchichas(boolean conSalchichas) {
        this.conSalchichas = conSalchichas;
    }

    public boolean isConRelleno() {
        return conRelleno;
    }

    public void setConRelleno(boolean conRelleno) {
        this.conRelleno = conRelleno;
    }

    public boolean isConPepperoni() {
        return conPepperoni;
    }

    public void setConPepperoni(boolean conPepperoni) {
        this.conPepperoni = conPepperoni;
    }

    public boolean isConCebolla() {
        return conCebolla;
    }

    public void setConCebolla(boolean conCebolla) {
        this.conCebolla = conCebolla;
    }

    public boolean isConGluten() {
        return conGluten;
    }

    public void setConGluten(boolean conGluten) {
        this.conGluten = conGluten;
    }

    public int getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(int domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "masa=" + masa +
                ", tamaño=" + tamaño +
                ", conQueso=" + conQueso +
                ", conAceitunas=" + conAceitunas +
                ", conAtun=" + conAtun +
                ", conSalchichas=" + conSalchichas +
                ", conRelleno=" + conRelleno +
                ", conPepperoni=" + conPepperoni +
                ", conCebolla=" + conCebolla +
                ", conGluten=" + conGluten +
                ", domicilio=" + domicilio +
                '}';
    }
}
