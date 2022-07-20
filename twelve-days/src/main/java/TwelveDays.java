import java.util.*;
class TwelveDays {

    private final String[] dates = {
            "first", "second", "third", "fourth", "fifth", "sixth",
            "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"
    };
    private final String[] rhythms = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming"
    };
    private String statement1 = "On the ";
    private String statement2 = " day of Christmas my true love gave to me: ";
    String verse(int verseNumber) {
        StringBuilder str = new StringBuilder();
        str.append(statement1);
        str.append(dates[verseNumber-1]);
        str.append(statement2);
        for(int i = verseNumber; i>0; i--) {
            str.append(rhythms[i-1]);
            if(i != 1) {
                str.append(", ");
            }
            if(i == 2) {
                str.append("and ");
            }
        }
        str.append(".\n");
        return str.toString();
    }

    String verses(int startVerse, int endVerse) {
        StringBuilder str1 = new StringBuilder();
        for(int i = startVerse; i <= endVerse; i++) {
            str1.append(verse(i));
            if(i != endVerse) {
                str1.append("\n");
            }
        }
        return str1.toString();
    }
    
    String sing() {
        return verses(1,12);
    }
}
