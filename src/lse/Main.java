package lse;

public class Main {

    public static void main(String[] args) {
        //COLAS
        Colas colas=new Colas();

        System.out.println(colas.estaVacia());
        System.out.println("COLUMNAS");

        for (int i = 1; i <=5 ; i++) {
            colas.insertar(i);
        }
        colas.mostrar();
        colas.eliminar();
        colas.eliminar();
        colas.mostrar();
        colas.eliminar();
        colas.mostrar();



        //PILAS
        System.out.println("PILAS");
        Pila pilas= new Pila();

        pilas.insertar(5);
        pilas.insertar(9);
        pilas.insertar(0);
        pilas.insertar(1);
        pilas.insertar(4);
        pilas.insertar(2);

        pilas.mostrarPila();
        pilas.eliminar();
        pilas.mostrarPila();


    }
}
