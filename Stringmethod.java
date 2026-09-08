import java.sql.SQLOutput;
import java.util.Locale;

public class Stringmethod {
    public static void main(String[] args){

        String name="    Amar S Tandur   ";

        int length=name.length();
        char letter=name.charAt(2);
        int index=name.indexOf("n");
        int lastIndex=name.lastIndexOf("r");

        name=name.toLowerCase();
        name=name.toUpperCase();
        name=name.trim();
        name=name.replace("Tandur","king");

        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));
        System.out.println(name.equals("Amar S Tandur"));
        System.out.println(name.equalsIgnoreCase("Amar S Tandur"));



    }
}
