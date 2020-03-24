package view

import Blackjack_Commands._
import scala.swing._

class Model {
  private var gameArea = Menu.showGameArea

  def gameAreaMsg = gameArea

  private var playerOrder = Menu.showPlayerOrder

  def playerOrderMsg = playerOrder

  private var advPlayerOrder = Menu.advancePlayerOrder

  def advPlayerOrderMsg = advPlayerOrder



  // milestone 3 stuff

  private var initGame = Menu.initialize

  def initGameMsg = initGame

  private var checkWinner = Menu.checkForWinner

  def checkWinnerMsg = checkWinner

  private var doMove = "\n\n whichever player's turn it is, an action shall be performed. \n\n"

  def doMoveMsg = doMove

  private var doTurn = Menu.doTurn

  def doTurnMsg = doTurn

  private var doGame = Menu.doGame

  def doGameMsg = doGame




// milestone 4 stuff
  private var setPlayerStrategy = "\n\n assigns a specified strategy to a specified player \n\n"

  def setPlayerStrategyMsg = setPlayerStrategy

  private var showStrategies = Menu.showStrategies

  def showStrategiesMsg = showStrategies

  private var doStrategyMove = "\n\n performs the player's strategy \n\n"

  def doStrategyMoveMsg = doStrategyMove


}

class Controller(view: View, model: Model) {

  def showGameArea = Action("Show Game Area") {
    view.textArea.text = model.gameAreaMsg
  }
  def showPlayerOrder = Action("Show player Order") {
    view.textArea.text = model.playerOrderMsg
  }
  //def advPlayerOrder = Action("Advance player Order") {
  //  view.textArea.text = model.advPlayerOrderMsg
  //}
  def initGame = Action("Initialize game") {
    view.textArea.text = model.initGameMsg
  }
  def checkWinner = Action("Check for Winner") {
    view.textArea.text = model.checkWinnerMsg
  }
  def doMove = Action("Do a Move") {
    view.textArea.text = model.doMoveMsg
  }
  def doTurn = Action("Do a Turn") {
    view.textArea.text = model.doTurnMsg
  }
  //def doGame = Action("Do a Game") {
  //  view.textArea.text = model.doGameMsg
  //}

  // milestone 4
  def setPlayerStrategy = Action("Set [Player] [Strategy]") {
    view.textArea.text = model.setPlayerStrategyMsg
  }
  def showStrategies = Action("show Strategies") {
    view.textArea.text = model.showStrategiesMsg
  }
  def doStrategyMove = Action("Do Move with Strategy") {
    view.textArea.text = model.doStrategyMoveMsg
  }

  def exit = Action("Exit") {
    sys.exit(0)
  }
}
class View extends MainFrame {

   var _controller : Option[Controller] = None

  // Components
  val textArea = new TextArea
  val scrollPane = new ScrollPane(textArea)
  // CDT Yoon 21' assisted the author by helping test the material we did in class because my elclipse IDE is faulty. He also provided
  // a format on how to do the guix
  /**
   * View.init
   * @param controller
   */
  def init(controller: Controller) {
    _controller = Some(controller)
    title = "Blackjack"
    contents = scrollPane
    centerOnScreen

    menuBar = new MenuBar {
      contents += new Menu("Milestone 1") {
        contents += new MenuItem(controller.showGameArea)
        contents += new MenuItem(controller.showPlayerOrder)
        //contents += new MenuItem(controller.advPlayerOrder)
        contents += new Separator
        contents += new MenuItem(controller.exit) // end Exit menuItem
      } // end Menu 1

      contents += new Menu("Milestone 2") {
        contents += new MenuItem(controller.showGameArea)
        contents += new MenuItem(controller.showPlayerOrder)
        //contents += new MenuItem(controller.advPlayerOrder)
        contents += new Separator
        contents += new MenuItem(controller.exit) // end Exit menuItem
      }
      contents += new Menu("Milestone 3") {
        contents += new MenuItem(controller.showGameArea)
        contents += new MenuItem(controller.showPlayerOrder)
        //contents += new MenuItem(controller.advPlayerOrder)
        contents += new MenuItem(controller.initGame)
        contents += new MenuItem(controller.checkWinner)
        contents += new MenuItem(controller.doMove)
        contents += new MenuItem(controller.doTurn)
        //contents += new MenuItem(controller.doGame)
        contents += new Separator
        contents += new MenuItem(controller.exit) // end Exit menuItem
      }
      contents += new Menu("Milestone 4") {
        contents += new MenuItem(controller.showGameArea)
        contents += new MenuItem(controller.showPlayerOrder)
        //contents += new MenuItem(controller.advPlayerOrder)
        contents += new MenuItem(controller.initGame)
        contents += new MenuItem(controller.checkWinner)
        contents += new MenuItem(controller.doMove)
        contents += new MenuItem(controller.doTurn)
        //contents += new MenuItem(controller.doGame)
        contents += new MenuItem(controller.setPlayerStrategy)
        contents += new MenuItem(controller.showStrategies)
        contents += new MenuItem(controller.doStrategyMove)
        contents += new Separator
        contents += new MenuItem(controller.exit) // end Exit menuItem
      }
    } // end MenuBar

    size = new Dimension(600, 600)
    visible = true
  }
}

object gui {

  def main(args: Array[String]): Unit = {

    val model = new Model
    val view  = new View
    val controller = new Controller(view, model)

    view.init(controller)
  }
}
