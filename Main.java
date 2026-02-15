public class Main {
    public static void main(String[] args) {

        Guerrero guerrero = new Guerrero("Arthos", 5, 120);
        Mago mago = new Mago("Eldrin", 7, 80, 150);
        Ladron ladron = new Ladron("Shade", 6, 90);

        Equipamiento espada = new Equipamiento("Espada Larga", "Arma");
        Equipamiento tunica = new Equipamiento("Túnica Arcana", "Armadura");
        Equipamiento daga = new Equipamiento("Daga Ligera", "Arma");

        guerrero.agregarEquipamiento(espada);
        mago.agregarEquipamiento(tunica);
        ladron.agregarEquipamiento(daga);

        guerrero.getInventario().mostrarInventario();
        mago.getInventario().mostrarInventario();
        ladron.getInventario().mostrarInventario();

        guerrero.mostrarInfo();
        mago.mostrarInfo();
        ladron.mostrarInfo();

        guerrero.proteger(mago); 
        mago.bajarVida(40); 
        guerrero.dejarDeProteger();

        mago.lanzarHechizo(50);
        mago.recargarMana(30);

        ladron.robar();  
        ladron.hacerseInvisible();
        ladron.robar();   

        ladron.bajarVida(25);

        mago.curar(20);

        guerrero.mostrarInfo();
        mago.mostrarInfo();
        ladron.mostrarInfo();
    }
}
