package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

import javax.print.attribute.standard.ColorSupported;

public class CindyMoon extends Spiderman implements CindyActionCallbacks{
    public CindyMoon(String nombre, String alias, String genero, String universo, String lugarNacimiento, String raza) {
        super(nombre, alias, genero, universo, lugarNacimiento, raza);
    }

    @Override
    public void superSpeed(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out(showMessage(), "Arial", 25, Colors.C64Ntsc);
        s.out("Habilidades\n", "Arial", 22, Colors.AgalFuel);
        s.out("Super Speed\n", "Arial",20, Colors.Desire);
        s.showImage("./img/cindy/superSpeed.jpg", 200, 300);
        s.setBounds(200, 200, 500, 600);
    }

    @Override
    public void superStrength(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSuper Strength\n", "Arial",20, Colors.Desire);
        s.showImage("./img/cindy/superStrength.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }

    @Override
    public void spiderWeb(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSpider Web\n", "Arial",20, Colors.Desire);
        s.showImage("./img/cindy/spiderWeb.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }

    @Override
    public void spiderSense(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSpider Sense\n", "Arial",20, Colors.Desire);
        s.showImage("./img/cindy/spiderSense.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }

    @Override
    public void claws(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nClaws\n", "Arial",20, Colors.Desire);
        s.showImage("./img/cindy/claws.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);
    }
}
