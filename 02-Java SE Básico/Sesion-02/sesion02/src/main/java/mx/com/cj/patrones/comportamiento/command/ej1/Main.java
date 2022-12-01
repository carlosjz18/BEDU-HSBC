package mx.com.cj.patrones.comportamiento.command.ej1;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        float resultado = 0;
        boolean salir = false;
        int opcion;
        float entrada;

        Scanner sc = new Scanner(System.in);
        Stack<Comando> pila = new Stack<>();

        while (!salir) {
            System.out.println("\nRESULTADO = " + resultado);
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Deshacer último cambio");
            System.out.println("6. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un número:");
                    entrada = sc.nextFloat();
                    Comando comando = new ComandoSumar(resultado, entrada);
                    resultado = comando.ejecutar();
                    pila.add(comando);
                    break;
                case 2:
                    System.out.println("Ingresa un número:");
                    entrada = sc.nextFloat();
                    Comando comando2 = new ComandoRestar(resultado, entrada);
                    resultado = comando2.ejecutar();
                    pila.add(comando2);
                    break;
                case 3:
                    System.out.println("Ingresa un número:");
                    entrada = sc.nextFloat();
                    Comando comando3 = new ComandoMultiplicar(resultado, entrada);
                    resultado = comando3.ejecutar();
                    pila.add(comando3);
                    break;
                case 4:
                    System.out.println("Ingresa un número:");
                    entrada = sc.nextFloat();
                    Comando comando4 = new ComandoDividir(resultado, entrada);
                    resultado = comando4.ejecutar();
                    pila.add(comando4);
                    break;
                case 5:
                    if (!pila.isEmpty()) {
                        Comando ultimo = pila.pop();
                        resultado = ultimo.deshacer();
                    } else {
                        System.out.println("No hay nada por deshacer");
                    }
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida...");
            }
        }

        System.out.println("\nRESULTADO FINAL = " + resultado);
    }
}