
public class Schüler {
    private String vorname;
    private String nachname;

    Schüler(String vorname, String nachname) {
       this.vorname = vorname;
       this.nachname = nachname;

    }

    public String getName() {
        return vorname + " " + nachname;
    }



    public void setVorname(String vorname){
        this.vorname = vorname;
    }

    public void setNachnameame(String nachname) {
        this.nachname = nachname;
    }




}
