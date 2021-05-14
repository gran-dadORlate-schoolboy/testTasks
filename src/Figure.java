import java.awt.*;

public abstract class Figure {

    Color color; //цвет
    float x; // x-координата точки
    float y; // y-координата точки
    public abstract float getArea();
    public abstract Color getColor();
    public abstract String config();
    public abstract String getUniqueProperty();




}
