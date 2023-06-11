/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1prueba_jr;

/**
 *
 * @author Jorge Ramirez
 */
public class Figure {
    private double altura;
    private double largo;
    private double ancho;
    private String tipoFig;

    public Figure(double altura, double largo, double ancho, String tipoFig) {
        this.largo = largo;
        this.altura = altura;
        this.ancho = ancho;
        this.tipoFig = tipoFig;
    }

    public double getLargo() {
        return largo;
    }

    public void darLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return altura;
    }

    public void darAlto(double alto) {
        this.altura = altura;
    }

    public double getAncho() {
        return ancho;
    }

    public void darAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getTipoFigura() {
        return tipoFig;
    }

    public void darTipoFigura(String tipoFigura) {
        this.tipoFig = tipoFigura;
    }

    public double Area() {
        if (tipoFig.equalsIgnoreCase("Cuadrado")) {
            return largo * largo;
        } else if (tipoFig.equalsIgnoreCase("Triangulo")) {
            return (largo * ancho)/2;
        } else if (tipoFig.equalsIgnoreCase("Rectangulo")) {
            return largo * altura;
        } else {
            return 0;
        }
    }
    public String toString() {
        return "Tipo de figura: " + tipoFig + "\n" +
                "Largo: " + largo + "\n" +
                "Alto: " + altura + "\n" +
                "Ancho: " + ancho;
    }
}
