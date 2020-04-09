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
    PlayerOrder.resetPlayer
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
    if (playerList(0).move == "Busts") {
      if (playerList(1).move != "Busts") {
        playerList(1).games_won +=1
        result += playerList(1).name + ", "
      }
      if (playerList(2).move != "Busts") {
        playerList(2).games_won +=1
        result += playerList(2).name + ", "
      }
      if (playerList(3).move != "Busts") {
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

  def doMove(pl: Player): String = {
    if (pl.move != "Busts" || pl.move != "Stands") {
      val cur = pl.sum_cards(pl.cards)
      if (cur > 21) {
        pl.available_move = false
        pl.move = "Busts"
      }
      else if (cur < 16) {
        pl.cards = pl.cards :+ Deck.drawCard
        pl.move = "Hit"
      }
      else {
        pl.move = "Stands"
        pl.available_move = false
      }
      showGameArea
    }
    else showGameArea
  }
  def doTurn: String = {
    Deck.newDeck
    PlayerOrder.resetPlayer
    PlayerOrder.clearHands
    PlayerOrder.dealCards
    var available = 0
    while (available < 4) {
      available = 0
      for (i <- 0 to 3) {
        if (playerList(i).move == "Busts" || playerList(i).move == "Stands") {
          available += 1
        }
        else doMove(playerList(i))
      }
    }
    checkForWinner
    showGameArea
  }

  def doGame: String = {
    var result = ""
    for (i <- 1 to 10) {
      result += doTurn
      result += " \n"
    }
    result
  }
  def setStrategy(pl: Player, strategy: String): Unit = {
      pl.strategy = strategy
  }
  def doStrategyMove(up: Player): String = {
    Strategies.setup(up, up.strategy)
  }

  def showStrategies: String = {
    var result = ""
    for (i <- 0 to 3) {
      result += playerList(i).name + ": " + playerList(i).strategy + "\n"
    }
    result
  }

  def randomness: String = {
    if (Deck.random == false) {
      Deck.random = true
      "Deck is now random"
    }
    else {
      Deck.random = false
      "Deck is not random now"
    }
  }

}
