package Blackjack_commands

import org.scalatest.FunSpec
import org.scalatest.Matchers


class Menu_Test extends FunSpec with Matchers {

   describe("The Blackjack Simulation") {
    describe("has a menu") {

      //******* SHOW GAME AREA *******
      it("can show the game area, including the 19 x 4 board, player scores") {

        val expectedResult =
            "Game Area:\n" +
            "                           Dealer                        \n" +
            "                        [ ][ ][ ][ ]                     \n" +
            "                                                         \n" +
            "  Chuck           Katie          Trevor        Claudia   \n" +
            "[ ][ ][ ][ ]   [ ][ ][ ][ ]   [ ][ ][ ][ ]   [ ][ ][ ][ ]\n" +
            "\n" +
            "Games Won:\n" +
            "Chuck = 0, Katie = 0, Trevor = 0, Claudia = 0\n"


        Menu.showGameArea should be(expectedResult)
      }

      //******* SHOW PLAYER ORDER *******
      it("can show the player order") {
        val expectedResult = "Chuck, Katie, Trevor, Cluadia"
        Menu.showPlayerOrder should be(expectedResult)
      }


      //******* ADVANCE ORDER *******
      it("can advance the player order") {
        val expectedResult_0_advances = "Chuck, Katie, Trevor, Cluadia"
        val expectedResult_1_advances = "Katie, Trevor, Cluadia, Chuck"
        val expectedResult_2_advances = "Trevor, Cluadia, Chuck, Katie"
        val expectedResult_3_advances = "Cluadia, Chuck, Katie, Trevor"
        val expectedResult_4_advances = "Chuck, Katie, Trevor, Cluadia"

        Menu.showPlayerOrder should be(expectedResult_0_advances)

        Menu.advancePlayerOrder should be(expectedResult_1_advances)

        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_2_advances)

        Menu.advancePlayerOrder   // 3 advances

        Menu.advancePlayerOrder
        Menu.showPlayerOrder should be(expectedResult_4_advances)
        Menu.showPlayerOrder should be(expectedResult_0_advances)
      }


    }
  }
}
//© 2020 GitHub, Inc.
