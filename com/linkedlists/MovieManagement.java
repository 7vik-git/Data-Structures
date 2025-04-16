package linkedlists;

class Nodez{
    String movie;
    String director;
    int release;
    int rating;
    Nodez next;
    Nodez previous;
}
public class MovieManagement {
    Nodez head;
    Nodez tail;
    public static int movieCount = 0;
    public void insertAtStart(String movie, String director, int release, int rating){
        Nodez n = new Nodez();
        n.movie = movie;
        n.director = director;
        n.rating = rating;
        n.release = release;
         if(head==null){
             head = n;
             tail = n;
             movieCount++;
         }else{
             n.next  = head;
             head.previous = n;
             head = n;
             movieCount++;
         }
    }
    public void insertAtEnd(String movie, String director, int release, int rating){
        Nodez n = new Nodez();
        n.movie = movie;
        n.director = director;
        n.rating = rating;
        n.release = release;
        tail.next = n;
        n.previous=tail;
        tail = n;
    }
    public void searchMovieDetails(String movie){
        Nodez n = head;
        while(!n.movie.equals(movie)){
            n=n.next;
        }
        System.out.println(n.movie + " -> " + n.director + " -> " + n.release + " -> " + n.rating + "*" );
    }
    public void showMovies(){
        Nodez n = head;
        while(n!=null){
            System.out.println(n.movie + " -> " + n.director + " -> " + n.release + " -> " + n.rating + "*" );
            n = n.next;
        }
    }
    public void showMoviesInReverse(){
        Nodez n = tail;
        while(n!=null){
            System.out.println(n.movie + " -> " + n.director + " -> " + n.release + " -> " + n.rating + "*");
            n=n.previous;
        }
    }
}
