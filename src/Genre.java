import java.util.Arrays;

/**
 * Die Klasse Genre beinhaltet eine Liste von Zitaten.
 * Also kann jede Genre mehrere Zitate in sich speichern.
 * Im Attribut „name“ wird der Name der Genre bestimmt.
 *
 * @author Kevin Maurizi
 * @version 0.9
 * @since 06.04.2020
 */

public class Genre {

    String name;

    public Genre(){}
    public Genre(String name){
        this.name = name;
    }

    public void showRock(){
        String[] rock = {"Dark Side of The Moon - Pink Floyd","\n\r",  "Apetite for Destruction - Guns N' Roses","\n\r",
                "Black in Black - AC/DC","\n\r", "Master of Puppets - Metallica","\n\r", "IV - Led Zeppelin","\n\r",
                "Favourite worst Nightmare - Arctic Monkey","\n\r", "Clockwork Angels - Rush","\n\r",
                "The book of Souls - Iron Maiden", "\n\r","Wasting Light - Foo Fighters" ,"\n\r", "Backstar - David Bowie", "\n\r",
                "Joy as an Act of resistance - Idles"};
        System.out.println(Arrays.toString(rock));
    }
    public void showPop(){
        String[] pop = {"Songs In The Key of Life - Stevie Wonder","\n\r","Melodrama - Lorde","\n\r", "Body Talk - Robyn","\n\r",
                "When We All Fall Asleep, Where Do We Go? - Billie Eilish","\n\r", "Pop 2 - Charli XCX","\n\r",
                "Random Accesss Memories - Daft Punk"};
        System.out.println(Arrays.toString(pop));
    }
    public void showOldSchool(){
        String[] oldschool = {"Illmatic - Nas","\n\r", "Ready to Die - Notorious BIG","\n\r", "Enter the Wu-Tang - Wu-Tang Clan","\n\r",
                "The Chronic - Dr Dre","\n\r", "All Eyez on me - 2Pac","\n\r", "The Marschal Mathers LP - Eminem"};
        System.out.println(Arrays.toString(oldschool));
    }
    public void showKlassisch(){
        String[] klassisch = {"Der Ring des Nibelung - Wagner","\n\r", "Symphonies Nos 5&7 - Beethoven","\n\r", "War Requiem -  Britten","\n\r",
                "Goldberg Variations - JS Bach"};
        System.out.println(Arrays.toString(klassisch));
    }
    public void showCountry(){
        String[] country = {"At Folsom Prison - Johnny Cash","\n\r", "Modern Sounds in Country and Western Music - Ray Charles","\n\r",
                "The Definitve Collection - Patsy Cline", "\n\r","Girl - Maren Morris", "\n\r","While I'm Livin' - Tanya Tucker"};
        System.out.println(Arrays.toString(country));
    }
    public void showJazz(){
        String[] jazz = {"Ode - Brad Mehldau Trio","\n\r", "Without a Net - Wayne Shorter Quartet","\n\r",
                "The Epic - Kamasi Washington","\n\r", "Break Stuff - Vijay Iyer Trio","\n\r", "Far from Over - Vijay Iyer Trio","\n\r",
                "Lovers - Nels Cline"};
        System.out.println(Arrays.toString(jazz));
    }
    public void showNewSchool(){
        String[] newschool = {"Long.Live.A$AP - A$AP Rocky","\n\r", "The Life of Pablo - Kanye West","\n\r",
                "My Beautiful Dark Twisted Fantasy - Kanye West","\n\r", "Flowerboy - Tyler, the Creator","\n\r",
                "Astroworld - Travis Scott","\n\r", "Take Care - Drake","\n\r", "Some Rap Songs - Earl Sweatshirt","\n\r",
                "The perfect Luv Tape - Lil uzi Vert","\n\r", "Luv is Rage - Lil uzi Vert"};
        System.out.println(Arrays.toString(newschool));
    }
    public void showUnderground(){
        String[] underground = {"Unknown Death 2002 - Yung Lean","\n\r", "Stranger - Yung Lean","\n\r",
                "The South got something to say - Pouya","\n\r", "Sensational - Yung Gravy","\n\r", "Trash Island - Bladee","\n\r",
                "E - ecco2k","\n\r", "Tiger - Thaiboi Digital"};
        System.out.println(Arrays.toString(underground));
    }

}
