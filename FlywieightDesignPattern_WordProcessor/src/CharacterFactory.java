import java.util.HashMap;
import java.util.Map;
//The CharacterFactory ensures that duplicate letters (e.g., "L", "E", "H") are not recreated but reused.
public  class CharacterFactory {
    private static final Map<Character,CharacterFlyweight> charactermap=new HashMap<>();

    public static CharacterFlyweight getcharacter(char c){
        charactermap.putIfAbsent(c,new CharacterConcrete(c));  // Reuse if exists, else create new
        return charactermap.get(c);
    }
}
/*here Chracter is wrapper class it is bery efficient when we have to use in map instead of char
* Character can be null it allow heap */
