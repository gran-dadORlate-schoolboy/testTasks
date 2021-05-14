public class TrapezoidFactory implements FigureFactory{
    @Override
    public Figure createFigure() {
        int randomNumColor = (int) (1 +(Math.random() * 7));
        String color;
        switch (randomNumColor){
            case  (1):
                color = (MYCOLORS.RED).toString();
                break;
            case (2):
                color = (MYCOLORS.BLUE).toString();
                break;
            case (3):
                color = (MYCOLORS.GREEN).toString();
                break;
            case (4):
                color = (MYCOLORS.YELLOW).toString();
                break;
            case (5):
                color = (MYCOLORS.GREY).toString();
                break;
            case (6):
                color = (MYCOLORS.CYAN).toString();
                break;
            case (7):
                color = (MYCOLORS.MAGENTA).toString();
                break;

            default:
                color = (MYCOLORS.RED).toString();
                break;
        }
        int x = (int) (1 +(Math.random() * 800));
        int y = (int) (1 +(Math.random() * 800));
        int wid = (int) (1 +(Math.random() * 800));
        int hight = (int) (1 +(Math.random() * 800));
        if((wid + x)>=1500){
            wid = 1500 - x;
        }
        if((hight + y)>=1000){
            hight = 1000 - y;
        }
        return new Trapezoid(x, y, color,wid, hight);
    }
}
