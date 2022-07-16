import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Hashtable<Character, Character> rna = new Hashtable<Character, Character>();

        String answer = "";

        rna.put('G','C');
        rna.put('C','G');
        rna.put('T','A');
        rna.put('A','U');

        for(int i =0; i < dnaStrand.length(); i++) {
            char ch = rna.containsKey(dnaStrand.charAt(i))
                    ? rna.get(dnaStrand.charAt(i))
                    : dnaStrand.charAt(i);
            answer += ch;
        }

        return answer;
    }

}
