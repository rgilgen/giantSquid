package ch.css.produkt.kata

import org.spockframework.compiler.model.Spec
import spock.lang.Specification

class GameImplTest extends Specification {
    def "Read File"() {
        given: "Input File With Boards and Drawings"
        File file = new File("firstBoardWins.txt")
        Game game = new GameImpl()


        when: "call method getWinnerPoints"
        game.init(file)


        then: "Retrieve Score of Winneer Board"
        game.drawings[3] == 90
    }
}
