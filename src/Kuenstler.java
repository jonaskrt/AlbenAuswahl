import java.util.Arrays;



public class Kuenstler {

    String name;

    public Kuenstler(){}
    public Kuenstler(String name){
        this.name = name;
    }


    public void a(){
        System.out.println("Nun wählen Sie zwischen alle Künstler die mit dem Buchstaben «a» beginnen:");
    }
    public String[] showk2(){
        String[]  k2 = {"Pink Floyd", "Guns N' Roses", "AC/DC", "Metallica", "Led Zeppelin", "Arctic Monkeys", "Rush",
                "Iron Maiden", "Foo Fighters", "David Bowie", "Idles", "Stevie Wonder", "Lorde", "Robyn",
                "Billie Eilish", "Charli XCX", "Daft Punk", "Notorious BIG", "Wu-Tang Clan", "Dr Dre", "Tupac",
                "Eminem", "Wagner", "Beethoven", "Britten", "Bach", "Johnny Cash", "Ray Charles", "Patsy Cline",
                "Maren Morris", "Tanya Trucker", "Brad Mehldau Trio", "Wayne Shorter Quartet", "Kamasi Washington",
                "Vijay Iyer Trio", "Nels Cline", "A$AP Rocky", "Kanye West", "Kendrick Lamar", "Tyler, the Creator",
                "Travis Scott", "Drake", "Earl Sweatshirt", "Lil Uzi Vert", "Yung Lean", "Yung Gravy", "Pouya" ,
                "Bladee", "Ecco2k", "Thaiboy Digital"};
        System.out.println(Arrays.toString(k2));
        return k2;
    }
    public String[] showk3(){
        String[] k3 = {"Arbias", "Jonas", "wegegw", "gerger", "ergreg"};
        System.out.println(Arrays.toString(k3));
        return k3;
    }
    public String[] showk4(){
        String[] k4 = {"Arbias", "Jonas", "wegegw", "gerger", "ergreg"};
        System.out.println(Arrays.toString(k4));
        return k4;
    }
    public String[] showk5(){
        String[] k5 = {"Arbias", "Jonas", "wegegw", "gerger", "ergreg"};
        System.out.println(Arrays.toString(k5));
        return k5;
    }
    public String[] showk6(){
        String[] k6 = {"Arbias", "Jonas", "wegegw", "gerger", "ergreg"};
        System.out.println(Arrays.toString(k6));
        return k6;
    }
    public String[] showk7(){
        String[] k7 = {"Arbias", "Jonas", "wegegw", "gerger", "ergreg"};
        System.out.println(Arrays.toString(k7));
        return k7;
    }
    public String[] showk8(){
        String[] k8 = {"Arbias", "Jonas", "wegegw", "gerger", "ergreg"};
        System.out.println(Arrays.toString(k8));
        return k8;
    }
    public String[] getKuenstler() {
        return showk2();
    }

}
