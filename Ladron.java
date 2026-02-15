public class Ladron extends Personaje {
    private boolean invisible;

    public Ladron(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.invisible = false;
    }

    public void robar() {
        if (invisible) {
            System.out.println("👤 [" + getNombre() + "]: Te deslizas entre las sombras y robas el tesoro sin que nadie se de cuenta. ¡Éxito total!");
        } else {
            System.out.println("⚠️ [" + getNombre() + "]: Intentas robar a plena luz del día... ¡El guardia te ha visto y casi pierdes una mano! El robo ha fallado.");
        }
    }

    public void hacerseInvisible() {
        this.invisible = !this.invisible;
        String mensaje = invisible ? "se ha desvanecido en las sombras." : "ha salido de su escondite.";
        System.out.println(getNombre() + " " + mensaje);
    }

    public boolean estaInvisible() {
        return invisible;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Estado de sigilo: " + (invisible ? "Invisible" : "Visible"));
        System.out.println("---------------------------------");
    }
}