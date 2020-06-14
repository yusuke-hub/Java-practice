package academy.learnprograming;

public class Wall {
    private double height;
    private double width;

    public Wall() {

    }
    public Wall(double width, double height) {
        if(height <0) {
            height = 0;
        }
        if(width <0) {
            width = 0;
        }
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if(height <0) {
            height = 0;
        }
        this.height = height;
    }

    public void setWidth(double width) {
        if(width <0) {
            width = 0;
        }
        this.width = width;
    }
    public double getArea() {
        return height * width;
    }

//    ★ Another solution
//    private double width;
//    private double height;
//
//    public Wall() {
//
//    }
//
//    public Wall(double width, double height) {
//        this.width = width < 0 ? 0 : width;
//        this.height = height < 0 ? 0 : height;
//
//    }
//
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width < 0 ? 0: width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height < 0 ? 0 : height;
//    }
//
//    public double getArea(){
//        return getHeight() * getWidth();
//    }
}
