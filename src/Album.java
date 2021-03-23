import java.util.Arrays;




public class Album {

    Einleser einleser = new Einleser();
    String name;
    public String[] alben = {"platzhalter", "platzhalter", "platzhalter", "platzhalter", "platzhalter"};

    static int cnt= 0;

    public void showAlben(){
        System.out.println(Arrays.toString(alben));
    }

    public Album(){}
    public Album(String name){
        this.name = name;
    }





    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
