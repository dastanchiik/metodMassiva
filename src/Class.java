import java.util.Arrays;

public class Class {


   private int num;
   private String word;
   private int[]number;


    public Class(int num, String word, int[] number) {
        this.num = num;
        this.word = word;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Class{" +
                "num=" + num +
                ", word='" + word + '\'' +
                ", number=" + Arrays.toString(number) +
                '}';
    }
}
