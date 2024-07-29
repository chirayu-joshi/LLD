package word_processor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character, LetterInterface> characterCache = new HashMap<>();

    public static LetterInterface crateLetter(char characterValue){

        if(characterCache.containsKey(characterValue)){
            return characterCache.get(characterValue);
        }
        else {

            DocumentCharacter characterObj = new DocumentCharacter(characterValue, "Arial", 10);
            characterCache.put(characterValue, characterObj);
            return characterObj;
        }
    }
}
