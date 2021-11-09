public class Planet extends SolarObject implements Moves {
    public static SolarSystem window = new SolarSystem(1920,1080);
    private double orbitVelocity;

    /**
     * Constructor.
     * @param dis The distance of the Planet from the centre of the Universe.
     * @param a The orbital angle of the Planet.
     * @param diam The diameter of the Planet.
     * @param c The color of the Planet.
     * @param vel The orbital velocity of the Planet.
     */


    public Planet(double dis, double a, double diam, String c, double vel,SolarSystem window)
    {
        super(dis,a,diam,c);
        orbitVelocity = vel;
    }

    public void updatePlanets(){
        window.drawSolarObject(0,0,100,"#FFCA18");
        window.drawSolarObjectAbout(getDistance(),orbitVelocity,getDiameter(),getColour(),getDistance(),getAngle());
    }

    public void move()
    {
        this.setAngle(this.getAngle() + orbitVelocity);
        if(this.getAngle() > 360)
        {
            this.setAngle(0);
        }
    }
}
