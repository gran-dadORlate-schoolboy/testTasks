import javax.swing.*;
import java.awt.*;

public class DrawFigures extends JFrame {
    String [][] test;
    public void DrawFigures( String[][] test){
        this.test = test;
       setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.drawLine(0,0,1500,1000);
        if(!((test[1][0]).isEmpty())){
            for (int i = 1; i <test.length ; i++) {
                String name = test[i][0];
                int x = Integer.parseInt(test[i][1]);
                int y = Integer.parseInt(test[i][2]);
                Color color;
                switch (test[i][3]) {
                    case "RED": color = Color.RED;
                        break;
                    case "BLUE":  color = Color.BLUE;
                        break;
                    case "GREEN":  color = Color.GREEN;
                        break;
                    case "YELLOW":   color = Color.YELLOW;
                        break;
                    case "GREY":   color = Color.GRAY;
                        break;
                    case "CYAN":  color = Color.CYAN;
                        break;

                    default:  color = Color.MAGENTA;
                        break;
                };
                int weight = Integer.parseInt(test[i][4]);
                int height = Integer.parseInt(test[i][5]);
                String area = (" AREA = " + (test[i][6]));
                if(name.equalsIgnoreCase("Circle")){
                    g.setColor(Color.BLACK);
                    g.drawString(area, x , y);
                    g.setColor(color);
                    g.fillOval(x, y, weight, weight);
                }else if(name.equalsIgnoreCase("Square")){
                    g.setColor(Color.BLACK);
                    g.drawString(area, x , y);
                    g.setColor(color);
                    g.drawRect(x, y, weight, weight); // FOR SQUARE
                    g.fillPolygon(new int[]{x, x, x+weight,x+weight }, new int[]{y, y + height, y+height, y}, 4); //Fills Trapezoid

                }else if(name.equalsIgnoreCase("Trapezoid")){
                    int unuq = Integer.parseInt(test[i][7]);
                    g.setColor(Color.BLACK);
                    g.drawString(area, x , y);
                    g.setColor(color);
                    g.fillPolygon(new int[]{x, x, x+unuq,x+weight }, new int[]{y, y + height, y+height, y}, 4); //Fills Trapezoid
                }else if(name.equalsIgnoreCase("Triangle")){
                    g.setColor(Color.BLACK);
                    g.drawString(area, x , y);
                    g.setColor(color);
                    g.fillPolygon(new int[]{x, x, x +weight }, new int[]{y, y + height, y}, 3); //Fills triangle
                }
            }
        }
        g.dispose();
    }
}
