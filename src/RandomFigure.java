import java.util.Random;

public class RandomFigure {

    private static final RandomEnum<FIGURES> r =
            new RandomEnum<FIGURES>(FIGURES.class);
    public FIGURES RandomFigure(){
        return r.random();
    }
    private static class RandomEnum<E extends Enum> {
        private static final Random RND = new Random();
        private final E[] values;
        public RandomEnum(Class<E> token) {
            values = token.getEnumConstants();
        }
        public E random() {
            return values[RND.nextInt(values.length)];
        }
    }
}
