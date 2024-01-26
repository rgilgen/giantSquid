package ch.css.produkt.kata

import spock.lang.Specification

class BingoWinnerRetrieverTest extends Specification {

    def "GetWinnerPoints"() {
        given: "Input File With Boards and Drawings"
        File file = new File("firstBoardWins.txt")

        when: "call nethod getWinnerPoints"
        def retriever = new BingoWinnerRetriever()

        then: "Retrieve Score of Winneer Board"
        retriever.getWinnerPoints(file) == 617
    }
}
