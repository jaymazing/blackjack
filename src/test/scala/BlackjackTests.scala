package Blackjack_Commands

import org.scalatest.FunSpec
import org.scalatest.Matchers

class Menu_Test extends FunSpec with Matchers {

   describe("The Blackjack Simulation") {
    describe("has a menu") {
      //******* SHOW GAME AREA *******
      it("can show the game area, including player scores and cards") {

        val expectedResult =
          "Game Area:\n" +
          "Dealer cards: " + "" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"


        Menu.showGameArea should be(expectedResult)
      }

      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {
        val expectedResult = "Dealer, Katie, Trevor, Claudia"
        Menu.showPlayerOrder should be(expectedResult)
      }


      //******* ADVANCE ORDER *******
      it("can advance the player order") {
        val expectedResult_0_advances = "Katie, Trevor, Claudia, Dealer"
        val expectedResult_1_advances = "Trevor, Claudia, Dealer, Katie"
        val expectedResult_2_advances = "Claudia, Dealer, Katie, Trevor"
        val expectedResult_3_advances = "Dealer, Katie, Trevor, Claudia"

        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_0_advances)

        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_1_advances)

        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_2_advances)

        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_3_advances)
      }
      //**** Intialize Game ****//
      it("initializes game with player cards") {
        val expectedResult =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.initialize
        Menu.showGameArea should be(expectedResult)
      }

      //******* do Move *******
      it("does a number of moves in a turn"){
        Menu.initialize
        Menu.doMove(PlayerOrder.playerList(0))
        val expectedResult =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult)

        Menu.doMove(PlayerOrder.playerList(1))
        val expectedResult2 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult2)

        Menu.doMove(PlayerOrder.playerList(2))
        val expectedResult3 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult3)

        Menu.doMove(PlayerOrder.playerList(3))
        val expectedResult4 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult4)

        Menu.doMove(PlayerOrder.playerList(0))
        val expectedResult5 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult5)

        Menu.doMove(PlayerOrder.playerList(1))
        val expectedResult6 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult6)

        Menu.doMove(PlayerOrder.playerList(2))
        val expectedResult7 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult7)

        Menu.doMove(PlayerOrder.playerList(3))
        val expectedResult8 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Busts" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult8)

        Menu.doMove(PlayerOrder.playerList(0))
        val expectedResult9 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9, 10" + "\n" +
          "Move: " + "Busts" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Busts" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult9)

      }
      //******* Do turn *******

      it("does a turn") {
        Menu.doTurn

        val expectedResult =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2, 9, 10" + "\n" +
          "Move: " + "Busts" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "1" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "1" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Busts" + "\n" +
          "Games won: " + "0" + "\n"
        //println(PlayerOrder.playerList(0).name)
        Menu.checkForWinner should be ("Katie, Trevor")
        Menu.doTurn should be(expectedResult)

      }

      //******* do Game *******
      it("does a Game"){
        Menu.doGame
        Menu.checkForWinner should be ("Katie, Trevor")
      }



      //******* checkForWinner *******
      it("CHecks for a winner") {
        Menu.initialize
        Menu.doTurn
        Menu.checkForWinner should be ("Katie, Trevor")
     }
     //******* SET STRATEGY *******
      it("can change the strategy of any player") {
        Menu.setStrategy(PlayerOrder.playerList(0), "passive")
        Menu.setStrategy(PlayerOrder.playerList(1), "aggressive")
        Menu.setStrategy(PlayerOrder.playerList(2), "safe")
        Menu.setStrategy(PlayerOrder.playerList(3), "moderate")
        val expectedResult = {(
            "Dealer: passive\n" +
            "Katie: aggressive\n" +
            "Trevor: safe\n" +
            "Claudia: moderate\n"
          )
        }
        Menu.showStrategies should be(expectedResult)
    }
     //******* SHOW STRATEGIES *******
      it("can show the current strategies for all players") {
        //
        val expectedResult = {(
          "Dealer: passive\n" +
          "Katie: aggressive\n" +
          "Trevor: safe\n" +
          "Claudia: moderate\n"
          )
        }
        Menu.showStrategies should be(expectedResult)
      }

      //******* STRATEGY *******
      it("can show the four strategies") {
        Menu.initialize
        Menu.doStrategyMove(PlayerOrder.playerList(0))
        val expectedResult =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult)

        Menu.doStrategyMove(PlayerOrder.playerList(1))
        val expectedResult2 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult2)

        Menu.doStrategyMove(PlayerOrder.playerList(2))
        val expectedResult3 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8" + "\n" +
          "Move: " + "" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult3)

        Menu.doStrategyMove(PlayerOrder.playerList(3))
        val expectedResult4 =
          "Game Area:\n" +
          "Dealer cards: " + "1, 2" + "\n" +
          "Move: " + "Stands" + "\n" +
          "Games won: " + "0" + "\n" +
          "Katie cards: " + "3, 4, 9" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Trevor cards: " + "5, 6, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n" +
          "Claudia cards: " + "7, 8, 10" + "\n" +
          "Move: " + "Hit" + "\n" +
          "Games won: " + "0" + "\n"
        Menu.showGameArea should be(expectedResult4)
      }

    }
  }
}
//© 2020 GitHub, Inc.
