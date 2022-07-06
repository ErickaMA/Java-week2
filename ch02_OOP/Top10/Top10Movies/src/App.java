import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {    
            
        Scanner input = new Scanner(System.in);

        ArrayList<Movie> top10m = new ArrayList<Movie>();

        top10m.add( new Movie(1, "Marcel the Shell with Shoes on", "Dean Fleischer-Camp", 100));
        top10m.add( new Movie(2, "Fire of Love", "Sara Dosa", 100));
        top10m.add( new Movie(3, "Playground", "Laura Wandel", 100));
        top10m.add( new Movie(4, "Writing with Fire", "Rintu Thomas", 100));
        top10m.add( new Movie(5, "The Janes", "Tia Lessin", 100));
      
        top10m.add( new Movie(6, "Happening","Audrey Diwan" , 99));
        top10m.add( new Movie(7, "Navalny","Daniel Roher" , 99));
        top10m.add( new Movie(8, "Poly Styrene: I Am a Cliche","Celeste Bell" , 98));
        top10m.add( new Movie(9, "The Automat","Lisa Hurwitz" , 98));
        top10m.add( new Movie(10, "Who we Are: A Chronicle of Racism in America","Emily Kunstler" , 98));

        System.out.println("Enter a movie rank: ");
        int userN = input.nextInt();
        input.nextLine();

        Movie userM = top10m.get(userN - 1);

        System.out.println(userM.toString());
        

        input.close();
    }
}
