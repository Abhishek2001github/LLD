public class Main {
    public static void main(String[] args) {

     Directory movieDirectory =new Directory("Movie");
     FileSystem border=new File("Border");
     movieDirectory.add(border);

     Directory ComedyMovieDirectory=new Directory("ComedyMovie");
     FileSystem welcome=new File("welcome");
     FileSystem welcomeback=new File("welcomeback");
     ComedyMovieDirectory.add(welcome);
        ComedyMovieDirectory.add(welcomeback);
     movieDirectory.add(ComedyMovieDirectory);
     movieDirectory.ls();
    }
}