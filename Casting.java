public class Casting {
    public static void main(String[] args) {
        // Part 1
        double NewDoub = 112.35;
        int NewInt = (int) NewDoub;
        System.out.println("Double: " + NewDoub);
        System.out.println("Integer: " + NewInt);

        // Part 2
        String NewStr = "49";
        int SecondInt = Integer.parseInt(NewStr);
        System.out.println("The string value is: " + NewStr);
        System.out.println("The integer value is: " + SecondInt);
    }
}