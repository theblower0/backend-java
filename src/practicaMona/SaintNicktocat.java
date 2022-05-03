package practicaMona;

public class SaintNicktocat extends Mona{

    private boolean hasBackground;
    public SaintNicktocat(String nombre, String caracteristicas, boolean animacion, boolean hasBackground){
            super(nombre, caracteristicas, animacion);
            this.hasBackground = hasBackground;
    }

    @Override
    public String showData() {
        return super.showData()+ "\n Background: "+hasBackground;
    }

    @Override
    void actividades() {
        System.out.println("Actividades: Regala juguetes a los niños en Navidad");
        System.out.println("***********************************");
    }
}
