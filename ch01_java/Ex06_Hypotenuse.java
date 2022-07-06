import java.util.Scanner;

class Ex06_Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1;
        double side2;
        double hypotenuse;

        System.out.println("Enter side 1: ");
        side1 = input.nextDouble();

        System.out.println("Enter side 2: ");
        side2 = input.nextDouble();

        hypotenuse = Math.sqrt((side1*side1) + (side2*side2));
        System.out.println("Hypo: " + hypotenuse);

        input.close();
      
    } // main
} // class 