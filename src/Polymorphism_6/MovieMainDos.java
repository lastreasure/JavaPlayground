package Polymorphism_6;

public class MovieMainDos {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        /*
            Casting examples
         */
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        // local variable type inference LTVI example
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Star Wars");
        // one way of testing obj type
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } // instanceof way of testing obj type
        else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }
        /* pattern matching support method
          i.e. if the JVM can identify that the obj matches the type, it can
          extract data from the object without casting
          for this operator we are assigning a binding variable syfy
        */
        else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}
