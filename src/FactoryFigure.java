public class FactoryFigure {

    public FactoryFigure(String nameForm) {
        String nameFigure = nameForm;
        FigureFactory figureFactory = (FigureFactory) createFigureByName(nameFigure);
        Figure figure = figureFactory.createFigure();
        figure.getArea();
    }
    static Object createFigureByName(String nameFigure){
        if (nameFigure.equalsIgnoreCase("circle")){
            return new CircleFactory();
        }else if (nameFigure.equalsIgnoreCase("square")){
            return new SquareFactory();
        }
        else if (nameFigure.equalsIgnoreCase("trapezoid")){
            return new TrapezoidFactory();
        }
        else if (nameFigure.equalsIgnoreCase("triangle")){
            return new TriangleFactory();
        }
        else {
            throw new RuntimeException(nameFigure + " is unknown!!!");

        }
    }
}

