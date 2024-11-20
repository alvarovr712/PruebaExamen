package org.example;

import java.util.LinkedList;

public class BufferCoche {

    private  LinkedList<Integer> cola ;

    public BufferCoche(){
        cola = new LinkedList<Integer>();
    }


    //Metodo sincronizado para agregar un cohe al buffer

    public synchronized void poner(int tipoCoche){

        cola.add(tipoCoche);
        //System.out.println("Coche tipo" + tipoCoche + "añadido al buffer");
        notifyAll(); //Notifica a los hilos que están esperando
    }

    //Metodo sincronizado para sacar un coche del buffer

    public  synchronized int sacar (){

        //Mientras la cola esta vacia que espere y si la cola no lo esta que elimine el coche de el Array y muestre
        //Coche tipo coche sacado del buffer.

        while (cola.isEmpty()){

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }


            int coche = cola.remove();
            //System.out.println("Coche tipo" + coche + "sacado del buffer");
            return coche;


        }


    }

