public class Main {
    public static void main(String[] args) {
        Planet [] planets = new Planet[8];
        planets[0] = new Planet(50,0,30,"#9E5F0E",8,Planet.window); //Mercury.
        planets[1] = new Planet(100,10,10,"#D58208",6,Planet.window);//Venus
        planets[2] = new Planet(150,20,30,"BLUE",5,Planet.window);//Earth.
        planets[3] = new Planet(200,30,40,"#FF3C1D",4.5,Planet.window);//Mars.
        planets[4] = new Planet(60,90,50,"#FF6C35",4.2,Planet.window);//Jupiter.
        planets[5] = new Planet(100,100,60,"#FDB823",3.9,Planet.window);//Saturn.
        planets[6] = new Planet(150,120,55,"#BDFCFF",3.1,Planet.window);//Uranus.
        planets[7] = new Planet(250,140,80,"28CDD5",1,Planet.window);//Neptune.

        while(true){
            for(int i = 0; i < planets.length; i++){
                planets[i].updatePlanets();
                planets[i].move();
            }
            Planet.window.finishedDrawing();
        }


    }
}
