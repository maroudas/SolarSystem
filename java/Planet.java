public class Planet  {

    public static double plDiameter;
    public static double plVelocity;
    public static String plColour;
    public static double plDistance;
    public static double plCentreOfRotationDistance;
    public static double plCentreOfRotationAngle;
    SolarSystem window = new SolarSystem(1920,1080);

    public Planet(double plDiameter, double plVelocity, double plDistance, String plColour, double plCentreOfRotationDistance, double plCentreOfRotationAngle,SolarSystem window) {
        this.plDiameter = plDiameter;
        this.plVelocity = plVelocity;
        this.plDistance = plDistance;
        this.plCentreOfRotationDistance = plCentreOfRotationDistance;
        this.plCentreOfRotationDistance = plCentreOfRotationDistance;
        this.window = window;
    }

    public static void draw(SolarSystem window,double plDiameter, double plVelocity, double plDistance, String plColour, double plCentreOfRotationDistance, double plCentreOfRotationAngle){

        int x = 0;
        while(true) {
            if (x == 0) {
                window.drawSolarObject(0, 0, 100, "ORANGE");
                window.drawSolarObjectAbout(plDistance,plVelocity,plDiameter,plColour, plCentreOfRotationDistance, plCentreOfRotationAngle);
                window.finishedDrawing();
                x++;
            }
            x = 0;
            plVelocity = plVelocity + 1;
        }
    }
}
