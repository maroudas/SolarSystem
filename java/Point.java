public abstract class Point {
    double distance;
    double angle;

    public Point(double a,double d) {
        angle = a;
        distance = d;

    }

    public void setDistance(double d)
    {
        distance = d;
    }

    public void setAngle(double a)
    {
        angle = a;
    }

    public double getDistance()
    {
        return distance;
    }

    public double getAngle()
    {
        return angle;
    }
}
