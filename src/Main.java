import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true, 1 ));
        System.out.println(shouldWakeUp(false, 2 ));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1 ));

        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(20, 15 ,30 ));
        System.out.println(hasTeen(6 , 40 , 25));


        System.out.println(isCatPlaying(true, 40));
        System.out.println(isCatPlaying(true, 20));


        Scanner scanner= new Scanner(System.in);

        System.out.println("Width ?");
        double width = scanner.nextDouble();
        System.out.println("Height ?");
        double height = scanner.nextDouble();
        System.out.println(" area of rectangle" + height* width);

        System.out.println("Radius ?");
        double radius = scanner.nextDouble();
        System.out.println("Circle area" + area(radius));

    }


    public static boolean shouldWakeUp(boolean isBarking, int time) {
        if(time < 0 || time > 23 || !isBarking ) return false;

        return  time < 8 || time >= 20;
    }

    public static boolean hasTeen(int... ages) {
        for (int age: ages) {
            if(age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }



    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return isSummer ? (temp > 25 && temp <= 45) : (temp > 25 && temp <= 35);
    }

    public static double area(double height, double width){
        if(width<0 || height <0){
            System.out.println("w or h cannot be less than zero");
            return  -1;
        }
        return  width * height;
    }

    public static  double area(double radius) {
        if (radius < 0) {
            System.out.println(" radius of circle cannot be less than zero " + radius);
            return -1;
        }
        return Math.PI * Math.pow(radius,2);
    }
}

