package encapsulation.p01ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        try {

            Box box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f%n", box.calculateSurfaceArea(length, width, height));
            System.out.printf("Lateral Surface Area - %.2f%n", box.calculateLateralSurfaceArea(length, width, height));
            System.out.printf("Volume – %.2f%n", box.calculateVolume(length, width, height));
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }
    }
}
