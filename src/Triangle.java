import java.awt.*;

public class Triangle extends Figure{
    int x;
    int y;
    String color;
    int width;
    int height;
    float hypotenuse;

    public Triangle(int x, int y, String color, int width, int height) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.width = width;
        this.height = height;
        config();
    }
    @Override
    public String config(){
        ConfigFigures.Config("Triangle" , x, y, color, width, height,getArea(), getUniqueProperty());

        return null;
    }

    @Override
    public String getUniqueProperty() {
        hypotenuse = (float) Math.sqrt((width*width) + (height*height));
        String outHypotenuse = "hypotenuse = " + hypotenuse;
        return outHypotenuse;
    }

    @Override
    public float getArea() {

        return (width*height)/2;
    }

    @Override
    public Color getColor() {
        return null;
    }

    void setCoordinates(int x, int y){
        System.out.println("setCoordinates == " + x + " === " + y);
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