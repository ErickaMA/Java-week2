import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        ArrayList<LargestUsableVolume> LUV = new ArrayList<LargestUsableVolume>();
        ArrayList<LargestFootprint> LF = new ArrayList<LargestFootprint>();
        ArrayList<LargestFloorArea> LFA = new ArrayList<LargestFloorArea>();

        LUV.add(new LargestUsableVolume("Boeing Everett Factory", "USA", 1967, "Everett, Washington", 398000, 13.3));
        LF.add(new LargestFootprint("AvtoVAZ", "Russia", "Tolyattie", 887800));
        LFA.add(new LargestFloorArea("New Century Global Center", "China", "Chengdu", 1760000));

        System.out.println("Largest LFA: " + LFA.toString());

        System.out.println("Select a category: ");
        System.out.println("a: Largest Usable Volume ");
        System.out.println("b: Largest Footprint");
        System.out.println("c: Largest Floor Area ");

        String userI = input.nextLine();
        char cI = userI.charAt(0);

        switch(cI) {
            case 'a':
            System.out.println(LUV.toString());
            break;
            case 'b':
            System.out.println(LF.toString());
            break;
            case 'c':
            System.out.println(LFA.toString());
            break;
            default: 
            System.out.println("Incorrect input");
        } // switch

        input.close();
    } // main
} // class
