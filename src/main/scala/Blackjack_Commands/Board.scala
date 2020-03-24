package Blackjack_Commands

import PlayerOrder._

//******* BOARD *******
object Board {
  def show : String = {
    val members = PlayerOrder.toList
    var area =
      "Game Area:\n" +
      "Dealer cards: " + members(0).show_cards(members(0).cards) + "\n" +
      "Move: " + members(0).move + "\n" +
      "Games won: " + members(0).games_won.toString + "\n" +
      "Katie cards: " + members(1).show_cards(members(1).cards) + "\n" +
      "Move: " + members(1).move + "\n" +
      "Games won: " + members(1).games_won.toString + "\n" +
      "Trevor cards: " + members(2).show_cards(members(2).cards) + "\n" +
      "Move: " + members(2).move + "\n" +
      "Games won: " + members(2).games_won.toString + "\n" +
      "Claudia cards: " + members(3).show_cards(members(3).cards) + "\n" +
      "Move: " + members(3).move + "\n" +
      "Games won: " + members(3).games_won.toString + "\n"
    area
  }

}
