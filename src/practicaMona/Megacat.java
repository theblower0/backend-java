package practicaMona;

public class    Megacat extends Mona{

    public Megacat(String nombre, String caracteristicas,boolean animacion){
        super(nombre, caracteristicas, animacion);

    }

    @Override
    void actividades() {
        System.out.println("Actividades: Dispara rayos con su cañon-tentáculo");
        System.out.println("***********************************");

    }
}
