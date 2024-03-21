package Polymorphism_6;

import java.util.Scanner;

public class MovieMain {
    /*
        Polymorphism refers to 'many forms'
        it's an ability to execute different behaviour, for different types,
        which are determined at runtime.
    */

    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();
//
//        Movie comedyMovie = new Comedy("The Grand Budapest Hotel");
//        comedyMovie.watchMovie();
//
//        Movie scienceFictionMovie = new ScienceFiction("Interstellar");
//        scienceFictionMovie.watchMovie();
//

//        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, " +
                    "S for Science Fiction, or Q to quit): ");
            String type = s.nextLine();
            // if user enters an upper or lower case q then the loop will break
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }


    }

}
