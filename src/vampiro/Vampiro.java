package vampiro;

import vampirillo.Murcielago;

public  class Vampiro implements Murcielago {
    private String nombre;
    private int edad;

    //metodos
    protected void hipnotizar() {
        System.out.println("Ya cayó...uuu ya cayó...");
    }


    public final void morder() {
        System.out.println("LLeve lo suyo...");
    }

   public void chuparSangre() {
    }

    protected void aguantarSol(){
        System.out.println("Relajado ma' niño... no asara el solesito pa'");
    }

    public Vampiro(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public void volar() {
        System.out.println("Volando con Ecolocalización..."+" Mero lujo pa'..");
    }

    @Override
    public void dormirEnUnPalo() {

    }
}
