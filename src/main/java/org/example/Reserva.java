package org.example;

public class Reserva  implements Runnable{

    private Thread hilo;
    private static int contador = 0;
    private BufferCoche buffer;

    public Reserva(BufferCoche buffer){
        contador++;
        this.buffer = buffer;
        hilo = new Thread(this,"Reserva"+contador);
        hilo.start();

    }


    @Override
    public void run() {
        reservarCoche();

    }

    public void reservarCoche(){

        int coche = buffer.sacar();
        System.out.println("Coche tipo " + coche + " reservado");

    }
}
