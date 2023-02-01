package Movies;

public class Movie {
    private String name;
    private String category;

//    3.Movie List
//    We are going to build an application that keeps track of movies and displays them by category.
//    Inside of src, create a directory named movies. Create all of the classes described below in this directory.
//    Create a class named Movie. It should have private fields for name and category, and a constructor that sets both of these. Create methods to access these properties and change them (getters and setters).
//    public Movie(){}

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return this.category;
    }


}