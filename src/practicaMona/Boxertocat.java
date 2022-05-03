package practicaMona;

public class Boxertocat extends Mona{

    private String tipoDibujo;

    public Boxertocat(String nombre, String caracteristicas, boolean animacion, String tipoDibujo){
        super(nombre, caracteristicas, animacion);
        this.tipoDibujo = tipoDibujo;
    }

    @Override
    public String showData() {
        return super.showData() + "\nTipo de dibujo: "+tipoDibujo;
    }

    @Override
    void actividades() {
        System.out.println("Actividades: Entrena box");
        System.out.println("***********************************");
    }
}
