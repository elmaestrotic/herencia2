package vampiro;

public  class Vampiro {
    private String nombre;
    private int edad;

    //metodos
    public  void hipnotizar() {
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
}
