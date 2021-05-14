import java.awt.*;
public class Square extends Figure{
    int x;
    int y;
    String color;
    int width;
    int height;
    public Square(int x, int y, String color, int width, int height) {
//        System.out.println(" Square created" + x + " == " +  y + " == " +  color + " == " +  width + " == " +  height);
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
        this.height = width;
        config();
    }
    public String config(){
        ConfigFigures.Config("Square" , x, y, color, width, height,getArea(), getUniqueProperty());
        return null;
    }

    @Override
    public String getUniqueProperty() {
        float hypotenuse;
        String outHypotenuse;
        hypotenuse = (float) Math.sqrt((width*width) + (width*width));
        outHypotenuse = "hypotenuse"  + (hypotenuse);

        return outHypotenuse;
    }

    @Override
    public float getArea() {
        float area = width*width;
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
