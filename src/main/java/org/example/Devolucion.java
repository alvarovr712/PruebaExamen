package org.example;

public class Devolucion implements Runnable {

    //Crea una instancia de la clase buffer un contador y un hilo.

    private BufferCoche buffer;
    private static int coche = 0;
    private Thread hilo;

    public Devolucion(BufferCoche buffer){

        coche++;
        this.buffer = buffer;
        hilo = new Thread(this,"Devolucion"+coche);
        hilo.start();
    }


    @Override
    public void run() {

        int tipoCoche;
        tipoCoche = (int)(Math.random()*5+1);
        System.out.println("Se ha generado el coche tipo" + tipoCoche);
        buffer.poner(tipoCoche);

    }
}
