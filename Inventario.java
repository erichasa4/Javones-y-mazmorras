import java.util.ArrayList;

public class Inventario {
    private ArrayList<Equipamiento> equipamiento;

    public Inventario() {
        this.equipamiento = new ArrayList<>();
    }

    public void agregarEquipamiento(Equipamiento objeto) {
        if (objeto != null) {
            this.equipamiento.add(objeto);
        }
    }

    public void mostrarInventario() {
        System.out.println("--- Contenido del Inventario ---");
        if (equipamiento.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Equipamiento e : equipamiento) {
                System.out.println("- " + e.getNombre());
            }
        }
        System.out.println("--------------------------------");
    }

	public void agregarObjeto(Equipamiento equipamiento2) {
		
	}
}