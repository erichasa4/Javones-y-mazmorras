public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosVida, int mana) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
    }

    public void lanzarHechizo(int costeMana) {
        if (this.mana >= costeMana) {
            this.mana -= costeMana;
            System.out.println("¡" + getNombre() + " ha lanzado un hechizo arcano! (Coste: " + costeMana + ")");
            System.out.println("Maná restante: " + this.mana);
        } else {
            System.out.println(getNombre() + " intenta conjurar, pero no tiene suficiente maná. (Necesita: " + costeMana + ")");
        }
    }

    public void recargarMana(int cantidad) {
        this.mana += cantidad;
        System.out.println(getNombre() + " ha meditado y recuperado " + cantidad + " de maná. Maná total: " + this.mana);
    }

    public int getMana() {
        return mana;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Recurso: " + mana + " puntos de Maná.");
        System.out.println("---------------------------------");
    }
}