/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1prueba_jr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jorge Ramirez
 */
public class P1Prueba_JR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figure> figuras = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bienvenido a mi prueba #2 en java");
        System.out.println("Jorge Ramirez");
        System.out.println("Que disfrute usar el programa");
        
        System.out.println("Ingrese el numero de figuras: ");
        int numFiguras = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numFiguras; i++) {
            System.out.println("Figura #" + (i + 1));
            System.out.println("En su teclado escriba la figura que quiera");
            System.out.print("Cuadrado/Triangulo/Rectangulo: ");
            String tipoFigura = sc.nextLine();
            System.out.print("Largo de su figura (si es para triangulo entonces base): ");
            double largo = sc.nextDouble();
            System.out.print("Altura de su figura: ");
            double alto = sc.nextDouble();
            System.out.print("Ancho de su figura: (si es para triangulo hipotenusa): ");
            double ancho = sc.nextDouble();
            sc.nextLine();

            Figure fig = new Figure(largo, alto, ancho, tipoFigura);
            figuras.add(fig);
            System.out.println();
        }

        System.out.println("----- Lista de sus figura/s -----");
        for (Figure figura : figuras) {
            System.out.println(figura);
            System.out.println("El Area de su figura seleccionada es: " + figura.Area());
            System.out.println("Tipo de dato elegido es: " + figura.getTipoFigura());
            System.out.println();
        }
    }
    
}
