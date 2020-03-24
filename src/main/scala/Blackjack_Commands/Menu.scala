package Blackjack_Commands

import PlayerOrder._

object Menu {

  def showGameArea : String = {
    val result = Board.show
    result
  }

  def showPlayerOrder : String = {
    return PlayerOrder.show
  }

  def advancePlayerOrder : String = {
    PlayerOrder.advance
    PlayerOrder.show
  }


  def initialize: String = {
    Deck.newDeck
    PlayerOrder.clearHands
    PlayerOrder.dealCards
    showGameArea
  }

  def checkForWinner : String = {
    var result = ""
    val dlr = playerList(0).sum_cards(playerList(0).cards)
    val kt = playerList(1).sum_cards(playerList(1).cards)
    val tr = playerList(2).sum_cards(playerList(2).cards)
    val cl = playerList(3).sum_cards(playerList(3).cards)
    if (dlr > 21) {
      if (kt < 22) {
        playerList(1).games_won +=1
        result += playerList(1).name + ", "
      }
      if (tr < 22) {
        playerList(2).games_won +=1
        result += playerList(2).name + ", "
      }
      if (cl < 22) {
        playerList(3).games_won +=1
        result += playerList(3).name + ", "
      }
    }
    else {
      if (playerList(1).move != "Busts") {
        if (dlr < kt) {
          playerList(1).games_won +=1
          result += playerList(1).name + ", "
        }
      }
      if (playerList(2).move != "Busts") {
        if (dlr < tr) {
          playerList(2).games_won +=1
          result += playerList(2).name + ", "
        }
      }
      if (playerList(3).move != "Busts") {
        if (dlr < cl) {
          playerList(3).games_won +=1
          result += playerList(3).name + ", "
        }
      }
      else {
        playerList(0).games_won +=1
        result += playerList(0).name + ", "
      }
    }
    if (result == "") ""
    else result.substring(0, result.length-2)
  }

  def doMove(pl: Player): Int = {
    if (pl.move != "Busts" || pl.move != "Stands") {
      val cur = pl.sum_cards(pl.cards)
      if (cur > 21) {
        pl.available_move = false
        pl.move = "Busts"
        1
      }
      else if (cur < 16) {
        pl.cards = pl.cards :+ Deck.drawCard
        pl.move = "Hit"
        0
      }
      else {
        pl.move = "Stands"
        pl.available_move = false
        1
      }
    }
    else 0
  }
  def doTurn: String = {
    var available = 0
    while (available < 4) {
      for (i <- 0 to 3) {
        available += doMove(playerList(i))
      }
    }
    showGameArea
  }

  def doGame: Unit = {
    for (i <- 1 to 10) {
      doTurn
    }
  }
  def setStrategy(pl: String, strategy: String): Unit = pl match {
      case "Dealer" => PlayerOrder.playerList(0).strategy = strategy
      case "Katie" => PlayerOrder.playerList(1).strategy = strategy
      case "Trevor" => PlayerOrder.playerList(2).strategy = strategy
      case "Claudia" => PlayerOrder.playerList(3).strategy = strategy
  }
  def doStrategyMove(up: Player): Int = {
    Strategies.setup(up, up.strategy)
  }

  def showStrategies: String = {
    var result = ""
    for (i <- 0 to 3) {
      result += playerList(i).name + ": " + playerList(i).strategy + "\n"
    }
    result
  }

}
