package practicaMona;

public class Mona {

    private String nombre = "Mona",
            caracteristicas = "Pelaje negro";
    private boolean animacion = true;
    private int tentaculos = 5;

    public Mona(){}

    public Mona(String nombre, String caracteristicas, boolean animacion, int tentaculos){

        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.animacion = animacion;
        this.tentaculos = tentaculos;
    }
    public Mona(String nombre, String caracteristicas, boolean animacion){

        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.animacion = animacion;
    }

    public String showData(){
        return
                "Nombre: "+nombre+
                        "\nCaracteristicas: "+caracteristicas+
                        "\nTentáculos: "+tentaculos;
    }

    void actividades(){
        System.out.println("Actividades: Un octocat normal");
        System.out.println("***********************************");

    }
}
