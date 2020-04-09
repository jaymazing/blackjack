package Blackjack_Commands

import scala.swing._

class Controller(view: View, model: Model) {

  def showGameArea = Action("Show Game Area") {
    view.visual.text = model.gameAreaMsg
  }
  def showPlayerOrder = Action("Show player Order") {
    view.visual.text = model.playerOrderMsg
  }
  def advPlayerOrder = Action("Advance player Order") {
    view.visual.text = model.advPlayerOrderMsg
  }
  def initialize = Action("Initialize game") {
    view.visual.text = model.initGameMsg
  }
  def checkForWinner = Action("Check for Winner") {
    view.visual.text = model.checkWinnerMsg
  }
  def doMove = Action("Do a Move") {
    view.visual.text = model.doMoveMsg
  }
  def doTurn = Action("Do a Turn") {
    view.visual.text = model.doTurnMsg
  }
  def doGame = Action("Do a Game") {
    view.visual.text = model.doGameMsg
  }
  def randomness = Action("Shuffle Deck") {
    view.visual.text = model.randomnessMsg
  }
  def DS1 = Action(""){
    model.D1
  }
  def DS2 = Action(""){
    model.D2
  }
  def DS3 = Action(""){
    model.D3
  }
  def DS4 = Action(""){
    model.D4
  }
  def KS1 = Action(""){
    model.K1
  }
  def KS2 = Action(""){
    model.K2
  }
  def KS3 = Action(""){
    model.K3
  }
  def KS4 = Action(""){
    model.K4
  }
  def TS1 = Action(""){
    model.T1
  }
  def TS2 = Action(""){
    model.T2
  }
  def TS3 = Action(""){
    model.T3
  }
  def TS4 = Action(""){
    model.T4
  }
  def CS4 = Action(""){
    model.C4
  }
  def CS3 = Action(""){
    model.C3
  }
  def CS2 = Action(""){
    model.C2
  }
  def CS1 = Action(""){
    model.C1
  }

  // milestone 4
  def showStrategies = Action("show Strategies") {
    view.visual.text = model.showStrategiesMsg
  }
//  def doStrategyMove = Action("Do Move with Strategy") {
//    view.visual.text = model.doStrategyMoveMsg
//  }

  def exit = Action("Exit") {
    sys.exit(0)
  }
}
