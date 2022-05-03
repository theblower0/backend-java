package practicaHarry;

public class Escuela {
    public static void main(String[] args) {
        Mago mago1 = new Mago("Albus Dumbledore", "Hombre", "Gryffindor", "El cadaver de su hermana, Ariana", "Fenix");
        Mago mago2 = new Mago("Newton Scamander", "Hombre", "Hufflepuff", "Trabajo de oficina", "Kelpie (Sin confirmar)");
        Mago mago3 = new Mago("Hermione Jean Granger", "Mujer", "Gryffindor", "El fracaso", "Nutria");
        Mago mago4 = new Mago("Ginevra Weasley", "Mujer", "Gryffindor", "Lord Voldemort", "Caballo");
        Mago mago5 = new Mago("Severus Snape", "Hombre", "Slytherin", "Lord Voldemort", "Coneja");

        print(mago1);
        print(mago2);
        print(mago3);
        print(mago4);
        print(mago5);

    }

    public static void print(Mago mago){
        System.out.println(mago.showMessage());

    }
}