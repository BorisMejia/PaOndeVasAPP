package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarando los datos de entrada del problema
        String ubicacionUsuario;
        String destinoUsuario;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarar un dato especial para capturar informacion desde el teclado
        Scanner teclado = new Scanner(System.in);

        //Inicializando las variables
        System.out.println("\u001B[32m PaOndeVas APP  \u001B[0m");

        System.out.print("Digite su ubicacion: ");
        ubicacionUsuario=teclado.nextLine();
        System.out.print("Digite su destino: ");
        destinoUsuario=teclado.nextLine();
        System.out.print("Digite su nombre: ");
        nombreUsuario= teclado.nextLine();
        System.out.print("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //Proceso del problema
        String distancia="20";
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorKilometro=6800;
        Integer cobroTotal= distanciaEnEntero*costoPorKilometro;

        //Salidas del problema
        System.out.print("\u001B[33m Señor ususario  \u001B[0m");
        System.out.print("\u001B[31m" + nombreUsuario + "\u001B");
        System.out.print("\u001B[34m El costo de su viaje es: $" + cobroTotal + " Pesos\u001B");
    }
}