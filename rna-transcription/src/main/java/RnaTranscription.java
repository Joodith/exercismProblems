import java.util.LinkedHashMap;
import java.util.Map;

class RnaTranscription {
    Map<Character, Character> RnaMapOfDna = new LinkedHashMap<Character, Character>();

    RnaTranscription() {
        mapDnaWithRna();
    }

    String transcribe(String dnaStrand) {

        StringBuilder compliment = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            char ch = RnaMapOfDna.get(dnaStrand.charAt(i));
            compliment.append(ch);

        }
        return compliment.toString();

    }

    private void mapDnaWithRna() {
        RnaMapOfDna.put('G', 'C');
        RnaMapOfDna.put('C', 'G');
        RnaMapOfDna.put('T', 'A');
        RnaMapOfDna.put('A', 'U');

    }

}
