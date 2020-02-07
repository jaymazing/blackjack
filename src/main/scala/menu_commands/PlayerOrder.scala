package Blackjack_Commands

//******* PLAYER_ORDER *******
object PlayerOrder extends scala.collection.mutable.Queue[Player] {

  this += new Player("Chuck")
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
}