package editor.models;

import java.util.HashMap;
import java.util.Map;

public class CharacterStyleFactory {
    private static final Map<String, CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(String font, int fontSize, String weight, String color) {
        String key = font + fontSize + weight + color;
        styles.putIfAbsent(key, new CharacterStyle(font, fontSize, weight, color));
        return styles.get(key);
    }
}
