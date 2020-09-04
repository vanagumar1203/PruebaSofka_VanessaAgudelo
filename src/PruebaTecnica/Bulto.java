/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebaTecnica;

/**
 *
 * @author vagudelo
 */
public class Bulto {

    double peso;
    double valor;
    double dolar;

    //constructor
    public Bulto(double peso, double valor, double dolar) {
        this.peso = peso;
        this.valor = valor;
        this.dolar = dolar;
    }

    //obtener
    public double getPeso() {
        return peso;
    }

    //setear
    public void setPeso(double value) {
        peso = value;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDolar() {
        return dolar;
    }

    public void setDolar(double dolar) {
        this.dolar = dolar;
    }

}
