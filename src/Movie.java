public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String t, String s, String r){
        this.studio=s;
        this.rating=r;
        this.title=t;
    }
    public String printInfo() {
        String infoBox=("Studio " + studio +" "+ "Rating" + rating + "Title" + title  );
        return infoBox;
    }
    public static void main (String[] args){
        Movie movie1= new Movie("House of Dragon","Universal Studio","4");
        System.out.println(movie1.printInfo());

    }

}
