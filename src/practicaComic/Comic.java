package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

import java.io.*;

public class Comic implements Runnable {
    String imagesPath = "./img/comic/" ,
            textPath = "C:\\Users\\adria\\IdeaProjects\\BackendJava\\img\\comic\\dialogos.txt";
    Screen screen;

    public Comic (Screen screen){
        this.screen = screen;
    }

    public Comic (Screen screen, String imagespath, String textPath){
        this.screen = screen;
        this.imagesPath = imagespath;
        this.textPath = textPath;
    }

    @Override
    public void run() {
        try {
            Files files = new Files(imagesPath);
            Pagina [] paginas = files.getPages();

            for(int i = 0; i < paginas.length; i++){
                screen.cls();
                screen.repaint();
                screen.setVisible(true);
                screen.out("\n"+paginas[i].getDescription()+"\n", "Arial", 28, Colors.BlueHorizon);
                screen.showImage(paginas[i].getPath(), 500, 500);
                screen.setBounds(200, 50, 800, 620);
                Thread.sleep(5000);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
