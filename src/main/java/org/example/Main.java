package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        String nombreCliente;
        String apellidosCliente;
        Short edadCliente;
        Integer usosTarjetaMes;
        Integer montoComprasAseoMes;
        Integer montoAlimentosMes;
        Integer montoOtrosprodMes;
        Short puntajeCliente;


        System.out.println("\u001B[35m ¡Bienvenido a TUYA!  \u001B[0m");
        System.out.println("----------------------------------------------");

        System.out.println("Estimado cliente, por favor digite su nombre: ");
        nombreCliente = entradaTeclado.nextLine();

        System.out.println("por favor digite también sus apellidos: ");
        apellidosCliente = entradaTeclado.nextLine();

        System.out.println("Por favor denos su edad: ");
        edadCliente = entradaTeclado.nextShort();

        System.out.println("Por favor digite su puntaje:  ");
        puntajeCliente = entradaTeclado.nextShort();

        System.out.println("Por favor digite el numero de veces que ha usado su targeta TUYA durante el ultimo mes: ");
        usosTarjetaMes = entradaTeclado.nextInt();

        System.out.println("por favor digite cuanto ha gastado en productos de aseo en el ultimo mes: ");
        montoComprasAseoMes = entradaTeclado.nextInt();

        System.out.println("Por favor digite cuanto ha gastado en productos alimenticios el ultimo mes: ");
        montoAlimentosMes = entradaTeclado.nextInt();

        System.out.println("Por favor digite cuanto ha gastado en otros productos durante el ultimo mes: ");
        montoOtrosprodMes = entradaTeclado.nextInt();

        Integer totalCuenta = montoComprasAseoMes + montoAlimentosMes + montoOtrosprodMes;

        if (puntajeCliente == 1) {

            Integer descuentoPuntajeUno= totalCuenta*(25/100);
            Integer totalConDescuento= totalCuenta-descuentoPuntajeUno;
            System.out.println("\u001B[35m Tienes un descuento del 25%!, el costo total es de:   \u001B[0m"+totalConDescuento);
            System.out.println("\u001B[35m Desde TUYA te deseamos un excelente dia, gracias por elegirnos! :)  \u001B[0m");



        } else if (puntajeCliente == 2) {

            Integer descuentoPuntajeDos= totalCuenta*(20/100);
            Integer totalConDescuento= totalCuenta-descuentoPuntajeDos;
            System.out.println("\u001B[35m Tienes un descuento del 20%!, el costo total es de:   \u001B[0m"+totalConDescuento);
            System.out.println("\u001B[35m Desde TUYA te deseamos un excelente dia, gracias por elegirnos! :)  \u001B[0m");

        } else if (puntajeCliente == 3) {

            Integer descuentoPuntajetres= totalCuenta*(15/100);
            Integer totalConDescuento= totalCuenta-descuentoPuntajetres;
            System.out.println("\u001B[35m Tienes un descuento del 25%!:   \u001B[0m"+totalConDescuento);
            System.out.println("\u001B[35m Desde TUYA te deseamos un excelente dia, gracias por elegirnos! :)  \u001B[0m");


        } else if (puntajeCliente == 4) {

            Integer descuentoPuntajeCuatro= totalCuenta*(10/100);
            Integer totalConDescuento= totalCuenta-descuentoPuntajeCuatro;
            System.out.println("\u001B[35m Tienes un descuento del 10%!:   \u001B[0m"+totalConDescuento);
            System.out.println("\u001B[35m Desde TUYA te deseamos un excelente dia, gracias por elegirnos! :)  \u001B[0m");


        } else {

            System.out.println("El total a pagar es de: "+totalCuenta);
            System.out.println("\u001B[35m Desde TUYA te deseamos un excelente dia, gracias por elegirnos! :)  \u001B[0m");


        }
    }
}