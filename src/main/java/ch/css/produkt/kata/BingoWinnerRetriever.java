package ch.css.produkt.kata;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class BingoWinnerRetriever {

    private Game game;

    public BingoWinnerRetriever(File input, Game game) throws IOException, URISyntaxException {
        this.game = game;
        game.init(input);
    }

    public int getWinnerPoints() {
        return game.getScoreWinnerBoard();
    }
}
