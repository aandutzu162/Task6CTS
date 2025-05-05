package editor.models;

import editor.interfaces.Renderable;

public class StyledCharacter implements Renderable {
    private char character;
    private int position;
    private CharacterStyle style;

    public StyledCharacter(char character, int position, CharacterStyle style) {
        this.character = character;
        this.position = position;
        this.style = style;
    }

    @Override
    public void render() {
        System.out.println("Char '" + character + "' at " + position +
                " [Font=" + style.getFont() +
                ", Size=" + style.getFontSize() +
                ", Weight=" + style.getFontWeight() +
                ", Color=" + style.getColor() + "]");
    }
}
