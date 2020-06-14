package academy.learnprograming;

public class Point {
    private int x;
    private int y;

    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
    public double distance(int x, int y) {
        double xLength = x - this.x;
        double yLength = y - this.y;
        return Math.sqrt(xLength * xLength + yLength * yLength);
    }
    public double distance(Point another) {
        double xLength = another.x - this.x;
        double yLength = another.y - this.y;
        return Math.sqrt(xLength * xLength + yLength * yLength);
    }

//    ★ Another solution
//    Math.pow(数字, 累乗)
//    public double distance() {
//        return Math.sqrt(Math.pow(getY(), 2) + Math.pow(getX(), 2)); // distance relative to  (0,0)
//    }
//
//    public double distance(Point p) {
//
//        return Math.sqrt(Math.pow(p.getY() - getY(), 2) + Math.pow(p.getX() - getX(), 2)); // distance relative to  (this.x , this.y)
//    }
//
//    public double distance(int x, int y) {
//        return Math.sqrt(Math.pow(y - getY(), 2) + Math.pow(x - getX(), 2)); // distance relative to  (x,y) params
//    }
}
