package practicaMultiverse;


import imonsh.Screen;

public class Multiverse {
    public static void main(String[] args) throws InterruptedException {

        Screen s = new Screen();
        Screen s2 = new Screen();
        Screen s3 = new Screen();

        MilesMorales miles = new MilesMorales("Miles Morales", "Spider-Man", "Masculino", "616", "Brooklyn, NY","Humano");
        KaineParker kaine = new KaineParker("Kaine Parker", "Scarlet Spider","Masculino", "616","New York", "Humano");
        CindyMoon cindy = new CindyMoon("Cindy Moon", "Silk", "Femenino","616","New York","Humana");


        miles.superStrength(s);
        miles.spiderSense(s);
        miles.venomBlast(s);
        miles.superEquilibrium(s);
        miles.camouflage(s);

        //Thread.sleep(5000);
        kaine.superStrength(s2);
        kaine.nightVision(s2);
        kaine.spiderSense(s2);
        kaine.stingers(s2);
        kaine.superSpeed(s2);

        //Thread.sleep(5000);
        cindy.superSpeed(s3);
        cindy.claws(s3);
        cindy.spiderSense(s3);
        cindy.superStrength(s3);
        cindy.spiderWeb(s3);




    }
}
