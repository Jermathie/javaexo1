package advanced.codelab02;

import java.util.Random;

import static advanced.codelab02.Multiplier.*;
import static advanced.codelab02.Tile.emptyTile;

public class Square {

    private Multiplier multiplier;
    private Tile tile;

    public Square() {
        Random random = new Random();
        this.multiplier = chooseRandomMultiplier(random);
        this.tile = emptyTile();
    }

    private Multiplier chooseRandomMultiplier(Random random) {
        switch (random.nextInt(3)) {
            case 2:
                return TIMES_2;
            case 3:
                return TIMES_3;
            default:
                return TIMES_1;
        }
    }

    public void placeTile(Tile tile) {
        if(this.tile.equals(emptyTile())){
            this.tile = tile;
        }
    }

    @Override
    public String toString() {
        return "[" + multiplier.getMultiplier() + "x" + tile.toString() + "]";
    }
}
