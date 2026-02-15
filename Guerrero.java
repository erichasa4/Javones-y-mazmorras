public class Guerrero extends Personaje {
    private Personaje compañeroProtegido;

    public Guerrero(String nombre, int nivel, int puntosVida) {
        super(nombre, nivel, puntosVida);
        this.compañeroProtegido = null;
    }

    public void proteger(Personaje compañero) {
        if (this.compañeroProtegido != null) {
            dejarDeProteger();
        }

        this.compañeroProtegido = compañero;
        this.compañeroProtegido.setProtegido(true);
        
        System.out.println(getNombre() + " ahora está protegiendo a " + compañero.getNombre() + ".");
    }

    public void dejarDeProteger() {
        if (this.compañeroProtegido != null) {
            System.out.println(getNombre() + " ha dejado de proteger a " + compañeroProtegido.getNombre() + ".");
            this.compañeroProtegido.setProtegido(false);
            this.compañeroProtegido = null;
        } else {
            System.out.println(getNombre() + " no estaba protegiendo a nadie.");
        }
    }

    public Personaje estaProtegiendo() {
        return compañeroProtegido;
    }

    public void mostrarInfo() {
        super.mostrarInfo();
        String estado = (compañeroProtegido != null) ? "Protegiendo a " + compañeroProtegido.getNombre() : "Libre";
        System.out.println("Estado de combate: " + estado);
        System.out.println("---------------------------------");
    }
}