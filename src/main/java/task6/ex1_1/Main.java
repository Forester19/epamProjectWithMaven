package task6.ex1_1;

/**
 * Created by Владислав on 28.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Testing testing = new Testing();
        System.out.println(testing.convertFtoC(10));
        System.out.println(testing.convertCtoF(10));
        System.out.println(testing.convertCtoK(10));
        System.out.println(testing.convertFtoK(10));
        System.out.println(testing.convertKtoC(10));
        System.out.println(testing.convertKtoF(10));
    }
}
