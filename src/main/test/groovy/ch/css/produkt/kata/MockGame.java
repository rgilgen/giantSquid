package ch.css.produkt.kata;

import ch.css.produkt.kata.Game;

import java.io.File;

public class MockGame implements Game {

    private final int fakeReturn;

    MockGame(int fakeReturn){
        this.fakeReturn = fakeReturn;
    }
    @Override
    public int getScoreWinnerBoard() {
        return fakeReturn;
    }

    @Override
    public void init(File input) {

    }
}
