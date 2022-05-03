package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

import java.io.File;
import java.io.IOException;

public class Leer {

    public static void main(String[] args) {

        Screen s = new Screen();

        SpiderComic spiderComic = new SpiderComic(s);
        spiderComic.setTitle(s, "La aventura espacial de Enel");


        Thread t = new Thread(spiderComic);
        t.start();





    }
}
