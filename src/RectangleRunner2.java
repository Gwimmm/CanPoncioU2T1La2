import java.util.Scanner;

public class RectangleRunner2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();
        Rectangle2 rect1 = new Rectangle2(rect1Length, rect1Width );
        Rectangle2 rect2 = new Rectangle2(rect2Length, rect2Width );

        int area1 = rect1.calculateArea();
        int area2 = rect2.calculateArea();
        double volume1 = rect1.calculateBoxVolume(rect1Height);
        double volume2 = rect2.calculateBoxVolume(rect2Height);

        System.out.println("Rectangle 1's area is: " + area1 + ", Box Volume: " + volume1);
        System.out.println("Rectangle 2's area is: " + area2 + ", Box Volume: " + volume2);
    }
}