package editor.models;

public class CharacterStyle {
    private String font;
    private int fontSize;
    private String fontWeight;
    private String color;

    public CharacterStyle(String font, int fontSize, String fontWeight, String color) {
        this.font = font;
        this.fontSize = fontSize;
        this.fontWeight = fontWeight;
        this.color = color;
    }

    public String getFont() {return font;}
    public int getFontSize() {return fontSize;}
    public String getFontWeight() {return fontWeight;}
    public String getColor() {return color;}
}
