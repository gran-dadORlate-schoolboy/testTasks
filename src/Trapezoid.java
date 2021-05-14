import java.awt.*;

public class Trapezoid extends Figure{
    int x;
    int y;
    String color;
    int width;

    int width2;
    int height;

    public Trapezoid(int x, int y, String color, int width, int height) {
//        System.out.println(" Trapezoid created" + x + " == " +  y + " == " +  color + " == " +  width + " == " +  height);
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
        this.height = height;
        config();
    }
    @Override
    public String config(){
        ConfigFigures.Config("Trapezoid" , x, y, color, width, height,getArea(), getUniqueProperty());

        return null;
    }

    @Override
    public String getUniqueProperty() {

        width2 = (int) (width + (1+Math.random()*100));
        if(width2>=1000){
            width2 = 1000;
        }
        String SideOfЕrapezoid = "SideOfЕrapezoid = " + width2;
        return String.valueOf(width2);
    }

    @Override
    public float getArea() {
            float area = ((width + width2)/2)*height;
        return area;
    }

    @Override
    public Color getColor() {
        return null;
    }
    void setCoordinates(int x, int y){


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}