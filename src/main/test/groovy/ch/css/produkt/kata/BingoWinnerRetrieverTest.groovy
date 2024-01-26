package ch.css.produkt.kata

import ch.css.produkt.kata.MockGame
import spock.lang.Specification

class BingoWinnerRetrieverTest extends Specification {

    def "GetWinnerPoints"() {
        given: "Input File With Boards and Drawings"
        File file = new File("firstBoardWins.txt")
        Game game = new MockGame(617);

        when: "call nethod getWinnerPoints"
        def retriever = new BingoWinnerRetriever(file, game)

        then: "Retrieve Score of Winneer Board"
        retriever.getWinnerPoints() == 617
    }

    def "GetWinnerPointsFromSecondGame"() {
        given: "Input File With Boards and Drawings"
        File file = new File("secondBoardWins.txt")
        Game game = new MockGame(995);

        when: "call nethod getWinnerPoints"
        def retriever = new BingoWinnerRetriever(file, game)

        then: "Retrieve Score of Winneer Board"
        retriever.getWinnerPoints() == 995
    }
}
