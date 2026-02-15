public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean protegido;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
        this.protegido = false;
        this.inventario = new Inventario();
    }

    public void mostrarInfo() {
        System.out.println("--- Estadísticas de Personaje ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + puntosVida);
        System.out.println("Estado: " + (protegido ? "Bajo protección" : "Vulnerable"));
        System.out.println("---------------------------------");
    }

    public void bajarVida(int cantidad) {
        int danioFinal = cantidad;
        
        if (protegido) {
            danioFinal = cantidad / 2;
            System.out.println("¡" + nombre + " está protegido! El daño se reduce de " + cantidad + " a " + danioFinal);
        }

        this.puntosVida -= danioFinal;
        if (this.puntosVida < 0) this.puntosVida = 0;
        
        System.out.println(nombre + " ha recibido " + danioFinal + " puntos de daño. Vida restante: " + puntosVida);
    }

    public void curar(int cantidad) {
        this.puntosVida += cantidad;
        System.out.println(nombre + " se ha curado " + cantidad + " PV. Vida actual: " + puntosVida);
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void agregarEquipamiento(Equipamiento equipamiento) {
        this.inventario.agregarObjeto(equipamiento);
        System.out.println(nombre + " ha equipado: " + equipamiento.getNombre());
    }

    public void setProtegido(boolean protegido) {
        this.protegido = protegido;
    }

    public boolean estaProtegido() {
        return protegido;
    }

    public String getNombre() {
        return nombre;
    }
}