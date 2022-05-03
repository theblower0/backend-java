package practicaMona;

public class OctoDex {
    public static void main(String[] args) {

        Mona mona = new Mona();
        System.out.println(mona.showData());
        mona.actividades();

        Hulatocat hulatocat = new Hulatocat("Hulatocat", "Viste una falda hawaiana", true);
        System.out.println(hulatocat.showData());
        hulatocat.actividades();

        Filmtocat filmtocat = new Filmtocat("Filmtocat", "Usa una camara profesional de video", false);
        System.out.println(filmtocat.showData());
        filmtocat.actividades();

        Boxertocat boxertocat = new Boxertocat(" Boxertocat", "Usa guantes de box", true, "Pixelado");
        System.out.println(boxertocat.showData());
        boxertocat.actividades();

        SaintNicktocat saintNicktocat = new SaintNicktocat("SaintNicktocat", "Usa un traje rojo con gorrito", false, true);
        System.out.println(saintNicktocat.showData());
        saintNicktocat.actividades();

        Robotocat robotocat = new Robotocat("Robotocat", "Su cuerpo está hecho de circuitos", false);
        System.out.println(robotocat.showData());
        robotocat.actividades();

        Megacat megacat = new Megacat("Megacat", "Tiene un cañon en su tentáculo",false);
        System.out.println(megacat.showData());
        megacat.actividades();




    }
}
