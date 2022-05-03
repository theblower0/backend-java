package practicaComic;

import imonsh.Colors;
import imonsh.Screen;

import javax.swing.table.TableRowSorter;

public class SpiderComic extends Comic implements SpiderComicActionCallbacks {
    public SpiderComic(Screen screen, String imagesPath, String textPath) {
        super(screen, imagesPath, textPath);
    }

    public SpiderComic(Screen screen) {
        super(screen);
    }

    @Override
    public void setTitle(Screen screen, String title) {
        screen.repaint();
        screen.setVisible(true);
        screen.out(title, "Arial", 32, Colors.C64Ntsc);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
