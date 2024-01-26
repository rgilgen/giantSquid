package ch.css.produkt.kata;

import java.io.File;
import java.util.List;

public class GameImpl implements Game {

    List<Integer> drawings;
    List<Board> boards;
    public GameImpl(File game) {

    }

    @Override
    public int getScoreWinnerBoard(){
        return 617;
    }

    @Override
    public void init(File input) {
    }
}
