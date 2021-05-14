
public class ConfigFigures {
    private  static  String [][] arrayLists;
    private static int count = 1;

    public  ConfigFigures(String[][] arrayLists){
        this.arrayLists = arrayLists;
        arrayLists[0][0] = "NameFigure";
        arrayLists[0][1] = "X";
        arrayLists[0][2] = "Y";
        arrayLists[0][3] = "COLOR";
        arrayLists[0][4] = "WEIGHT";
        arrayLists[0][5] = "HEIGHT";
        arrayLists[0][6] = "Area";
        arrayLists[0][7] = "UniqueProperty";
    }

    public static void Config(String nameFigure, int x, int y, String color, int width, int height, float area, String uni) {
        arrayLists[count][0] = nameFigure;
        arrayLists[count][1] = String.valueOf(x);
        arrayLists[count][2] = String.valueOf(y);
        arrayLists[count][3] = color;
        arrayLists[count][4] = String.valueOf(width);
        arrayLists[count][5] = String.valueOf(height);
        arrayLists[count][6] = String.valueOf(area);
        arrayLists[count][7] = String.valueOf(uni);
        count++;
    }
    public static String [][]   getArray(){
        for (int i = 0; i < arrayLists.length; i++) {
            for (int j = 0; j < arrayLists[i].length; j++) {
                System.out.printf("%-15s", arrayLists[i][j]);
            }
            System.out.println();
        }
        return arrayLists;
    }

}
