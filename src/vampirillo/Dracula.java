package vampirillo;

import vampiro.Vampiro;

public class Dracula extends Vampiro implements Murcielago {
    private int talla;

    public Dracula(String nombre, int edad, int talla) {
        super(nombre, edad);
        this.talla = talla;
    }

    @Override
    public void hipnotizar(){
        System.out.println("Venga que no es pa' eso...");
    }


    public static void main(String[] args) {
        Dracula obj1 = new Dracula("Vladimir",600,190);
        obj1.hipnotizar();
        obj1.morder();
        obj1.chuparSangre();
        obj1.aguantarSol();
        obj1.volar();

        Vampiro otto = new Vampiro("Alexander",1000);
        //otto.aguantarSol();//chicharron->hacer q otto pueda aguantar sol(public, static)
        //otto.hipnotizar();
        otto.morder();
        otto.chuparSangre();
        otto.volar();



    }

    @Override
    public void volar() {
        System.out.println("Volando con Ecolocalización..."+"Mero lujo pa'..");
    }

    @Override
    public void dormirEnUnPalo() {}//no será usado
}
