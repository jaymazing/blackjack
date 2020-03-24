package Blackjack_Commands

import Deck._

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {

  this += new Player("Dealer")
  this += new Player("Katie")
  this += new Player("Trevor")
  this += new Player("Claudia")

  def advance {
    this += this.dequeue
  }

  def show : String = {
    var result = ""
    for (p <- this.toArray)
      result += p.name + ", "
    result.substring(0, result.length-2)
  }

  def current : Player = {
    return this.head
  }

  val playerList: List[Player] = {
    PlayerOrder.toList
  }

  def resetPlayer: Unit = {
    while (PlayerOrder.current != "Dealer") {
      PlayerOrder.advance
    }
  }

  def clearHands: Unit = {
    for (i <- 0 to 3) {
      playerList(i).cards = List.empty[String]
      playerList(i).move = ""
      playerList(i).games_won = 0
    }
  }
  def dealCards: Unit = {
    for (i <- 0 to 3) {
      playerList(i).cards = playerList(i).cards :+ Deck.drawCard
      playerList(i).cards = playerList(i).cards :+ Deck.drawCard
    }
  }


}
