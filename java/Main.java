public class Main {
    public static void main(String[] args) {
        SolarSystem window = new SolarSystem(1920,1080);
        Planet earth = new Planet(50,50,100,"BLUE",0,0,window);
        Planet mars = new Planet(50,50,100,"RED",0,0,window);
        earth.draw(window,50,50,100,"BLUE",0,0);
        //mars.draw(window,50,50,100,"RED",0,0);

    }
}
