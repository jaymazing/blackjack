package Blackjack_Commands


object Menu {

  def showGameArea : String = {
    val result = Board.show + "\n"
    result
  }

  def showPlayerOrder : String = {
    return PlayerOrder.show
  }

  def advancePlayerOrder : String = {
    PlayerOrder.advance
  }
}

