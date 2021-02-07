package advanced.codelab02;

public class Tile {

    private char content = ' ';
    private int points;

    public Tile(char content, int points) {
        this.content = content;
        this.points = points;
    }

    public static Tile emptyTile(){
        return new Tile(' ', 1);
    }

    @Override
    public String toString() {
        return "" + content;
    }
}
