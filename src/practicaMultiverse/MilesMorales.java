package practicaMultiverse;

import imonsh.Colors;
import imonsh.Screen;

public class MilesMorales extends Spiderman implements MilesActionCallbacks{
    public MilesMorales(String nombre, String alias, String genero, String universo, String lugarNacimiento, String raza) {
        super(nombre, alias, genero, universo, lugarNacimiento, raza);
    }

    @Override
    public void superStrength(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Arial", 25, Colors.C64Ntsc);
        s.out("Habilidades\n", "Arial", 22, Colors.AgalFuel);
        s.out("Super Strength\n", "Arial",20, Colors.Desire);
        s.showImage("./img/miles/superStrength.jpg", 200, 300);
        s.setBounds(200, 200, 500, 600);

    }

    @Override
    public void spiderSense(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSpider Sense\n", "Arial",20, Colors.Desire);
        s.showImage("./img/miles/spiderSense.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);

    }

    @Override
    public void venomBlast(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nVenom Blast\n", "Arial",20, Colors.Desire);
        s.showImage("./img/miles/venomBlast.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);

    }

    @Override
    public void superEquilibrium(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nSuper Equilibrium\n", "Arial",20, Colors.Desire);
        s.showImage("./img/miles/superEquilibrium.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);

    }

    @Override
    public void camouflage(Screen s) {
        s.repaint();
        s.setVisible(true);
        s.out("\nCamouflage\n", "Arial",20, Colors.Desire);
        s.showImage("./img/miles/camouflage.jpg", 200, 300);
        s.setBounds(200, 200, 800, 600);

    }
}
