package Blackjack_Commands

class Model {
  var curr = 0

  def gameAreaMsg = Menu.showGameArea

  def playerOrderMsg = Menu.showPlayerOrder

  def advPlayerOrderMsg = Menu.advancePlayerOrder

  def initGameMsg = Menu.initialize

  def checkWinnerMsg = Menu.checkForWinner

  def doMoveMsg = {
    if (curr < 3) {
      val ice = curr
      curr+=1
      Menu.doStrategyMove(PlayerOrder.playerList(ice))
    }
    else  {
      curr = 0
      Menu.doStrategyMove(PlayerOrder.playerList(3))
    }

  }

  def doTurnMsg = Menu.doTurn

  def doGameMsg =  Menu.doGame

  def randomnessMsg = Menu.randomness

  def D1 = Menu.setStrategy(PlayerOrder.playerList(0), "passive")
  def D2 = Menu.setStrategy(PlayerOrder.playerList(0), "aggressive")
  def D3 = Menu.setStrategy(PlayerOrder.playerList(0), "safe")
  def D4 = Menu.setStrategy(PlayerOrder.playerList(0), "moderate")
  def K1 = Menu.setStrategy(PlayerOrder.playerList(1), "passive")
  def K2 = Menu.setStrategy(PlayerOrder.playerList(1), "aggressive")
  def K3 = Menu.setStrategy(PlayerOrder.playerList(1), "safe")
  def K4 = Menu.setStrategy(PlayerOrder.playerList(1), "moderate")
  def T1 = Menu.setStrategy(PlayerOrder.playerList(2), "passive")
  def T2 = Menu.setStrategy(PlayerOrder.playerList(2), "aggressive")
  def T3 = Menu.setStrategy(PlayerOrder.playerList(2), "safe")
  def T4 = Menu.setStrategy(PlayerOrder.playerList(2), "moderate")
  def C1 = Menu.setStrategy(PlayerOrder.playerList(3), "passive")
  def C2 = Menu.setStrategy(PlayerOrder.playerList(3), "aggressive")
  def C3 = Menu.setStrategy(PlayerOrder.playerList(3), "safe")
  def C4 = Menu.setStrategy(PlayerOrder.playerList(3), "moderate")

  def showStrategiesMsg = Menu.showStrategies

  //private var doStrategyMove = "\n\n performs the player's strategy \n\n"

  //def doStrategyMoveMsg = doStrategyMove


}
