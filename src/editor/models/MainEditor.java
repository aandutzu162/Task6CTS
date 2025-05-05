package editor.models;

public class MainEditor {
    public static void main(String[] args) {
        CharacterStyle style1 = CharacterStyleFactory.getStyle("Arial", 12, "Bold", "Black");
        CharacterStyle style2 = CharacterStyleFactory.getStyle("Times", 14, "Italic", "Red");

        StyledCharacter c1 = new StyledCharacter('G', 0, style1);
        StyledCharacter c2 = new StyledCharacter('o', 1, style1);
        StyledCharacter c3 = new StyledCharacter('d', 2, style1);
        StyledCharacter c4 = new StyledCharacter('!', 3, style2);

        c1.render();
        c2.render();
        c3.render();
        c4.render();
    }
}