package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class KaineParker extends Spiderman implements KaineActionCallbacks{
    public KaineParker(String nombre, String alias, String genero, String universo, String lugarNacimiento, String raza) {
        super(nombre, alias, genero, universo, lugarNacimiento, raza);
    }

    @Override
    public void superStrength(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Arial", 25, Colors.C64Ntsc);
        s.out("Habilidades\n", "Arial", 22, Colors.AgalFuel);
        s.out("Super Strength\n", "Arial",20, Colors.Desire);
        s.showImage("./img/kaine/superStrength.jpg", 200, 300);
        s.setBounds(200, 200, 500, 600);
    }

    @Override
    public void superSpeed(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSuper Speed\n", "Arial",20, Colors.Desire);
        s.showImage("./img/kaine/superSpeed.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }

    @Override
    public void spiderSense(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSpider Sense\n", "Arial",20, Colors.Desire);
        s.showImage("./img/kaine/spiderSense.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }

    @Override
    public void stingers(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nStingers\n", "Arial",20, Colors.Desire);
        s.showImage("./img/kaine/stingers.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }

    @Override
    public void nightVision(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nNight Vision\n", "Arial",20, Colors.Desire);
        s.showImage("./img/kaine/nightVision.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }
}
