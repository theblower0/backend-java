package practicaMona;

public class Robotocat extends Mona{

    public Robotocat(String nombre, String caracteristicas, boolean animacion){
        super(nombre, caracteristicas, animacion);
    }

    @Override
    void actividades() {
        System.out.println("Actividades: ¿En serio? Es un robot!");
        System.out.println("***********************************");

    }
}
