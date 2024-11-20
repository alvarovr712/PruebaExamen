package org.example;

public class Lanzador {

    public static void main(String[] args) {


        BufferCoche buffer = new BufferCoche();
        new Devolucion(buffer);
        new Reserva(buffer);
        new Devolucion(buffer);
        new Devolucion(buffer);
        new Reserva(buffer);
        new Reserva(buffer);


    }
}
