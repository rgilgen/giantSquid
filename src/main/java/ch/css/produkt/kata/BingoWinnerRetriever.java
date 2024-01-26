package ch.css.produkt.kata;

import java.io.File;

public class BingoWinnerRetriever {

    private Game game;

    public BingoWinnerRetriever(File input, Game game) {
        this.game = game;
        game.init(input);
    }

    public int getWinnerPoints() {
        return game.getScoreWinnerBoard();
    }
}
