import java.util.Scanner;


public class Einleser {

    static Scanner scanner;

    public Einleser() {
        scanner = new Scanner(System.in);
    }


    public char readChar() {
        Line();
        System.out.print("> ");
        String input = scanner.nextLine();
        if(!input.isEmpty()){
            char ch = input.charAt(0);
            while (!Character.isLetter(ch)) {
                Line();
                System.out.println("Bitte einen Buchstaben eingeben!");
                Line();
                System.out.print("> ");
                ch = scanner.nextLine().charAt(0);
            }
            Line();
            return ch;
        }else{
            Line();
            System.out.println("Leere Eingabe nicht zulässig, bitte geben Sie etwas ein.");
            return readChar();
        }


    }


    public int readInt() {
        Line();
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Bitte eine Ganzzahl eingeben!");
            Line();
            System.out.print("> ");
        }
        int zahl = scanner.nextInt();
        scanner.nextLine();
        Line();
        return zahl;
    }


    public String readString(){

        while (! scanner.hasNext()){
            System.out.println("Text > ");
            scanner.nextLine();
        }
        String text = scanner.nextLine();
        return text;
    }
    public double readDouble(){
        while (!scanner.hasNextDouble()){
            Line();
            System.out.println("Bitte geben sie eine Zahl ein");
            Line();
            scanner.next();
        }
        double zahl = scanner.nextDouble();
        return zahl;
    }


    public void Line() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }

}
