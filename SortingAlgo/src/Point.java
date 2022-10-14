public class Point implements Comparable<Point> {
    double x, y;
    public Point(double x, double y) {
        this.x= x;
        this.y =y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public Point setPoint(double x, double y){
        return new Point(x,y);
    }
    /*
    @Override
    public int compareTo(Point a) {
        if (getDist(setPoint(x,y)) > getDist(a)) return 1;
        if (getDist(setPoint(x,y)) < getDist(a)) return -1;
        return 0;
    }

     */
    public double getDist(Point a){
        double aX = a.getX();
        double aY = a.getY();
        return Math.sqrt(aX*aX + aY*aY);
    }

    public int compareTo(Point a){
        if(y>a.getY()) return 1;
        if(y<a.getY()) return -1;
        return 0;
    }
}
