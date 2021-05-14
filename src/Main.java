
public class Main {
    public static void main(String[] args) {
        int numberOfFigures = (int) (1+Math.random() * 10);
        System.out.println(numberOfFigures + " количество фигур");
       String[][]ArrayConfigFigures = new String[numberOfFigures+1][8];
       ConfigFigures configFigures = new ConfigFigures(ArrayConfigFigures);
        for (int i = 0; i < numberOfFigures; i++) {
            RandomFigure randomFigure = new RandomFigure();
            String name =(randomFigure.RandomFigure().toString());
            FactoryFigure factoryFigure = new FactoryFigure(name);
        }

       String[][] complConfigFigures =  ConfigFigures.getArray();
        DrawFigures drawFigures = new DrawFigures();
        drawFigures.DrawFigures(complConfigFigures);


    }

}
