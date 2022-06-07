public class HomeWorkApp {
    public static void main(String[] args) {
        PrintThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = 2, b = 5, c = a + b;
        if (c >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println(c + "Sum is negative");
        }
    }
    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value <= 100) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }
    public static void compareNumbers() {
        int a = 8, b = 4;
        if (a > b) {
            System.out.println("a>=b");
        }
        if (a == b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }
}