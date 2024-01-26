package ch.css.produkt.kata;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public interface Game {
    public int getScoreWinnerBoard();

    public void init(File input) throws IOException, URISyntaxException;
}
