package Blackjack_Commands
import scala.swing._
import BorderPanel.Position._
import java.awt.{Color, Dimension}
import java.awt.geom._
import java.awt.Font
import scala.swing.event._


class View extends MainFrame {
  var _controller : Option[Controller] = None

  /**
   * View.init
   * @param controller
   */
   object game extends TextArea{
     background = new Color(108, 160, 220)
     this.text = "Blackjack"
   }
   //Options
  object showGameArea extends Button("show Game Area"){
     font = new Font("AdvantGarde Bk BT", 2, 16)
   }
  object showPlayerOrder extends Button("show player order"){
     font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object advancePlayerOrder extends Button("advance the player order"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object initialize extends Button("initialize Game"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object doMove extends Button("Do a move"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object doTurn extends Button("Do a turn"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object checkForWinner extends Button("Check For Winner"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object doGame extends Button("Do a Game"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object randomness extends Button("Randomize Deck"){
    font = new Font("AdvantGarde Bk BT", 2, 16)
  }
  object options extends BoxPanel(Orientation.Vertical){
    background = new Color(108, 160, 220)
    contents += showGameArea
    contents += showPlayerOrder
    contents += advancePlayerOrder
    contents += initialize
    contents += doMove
    contents += doTurn
    contents += checkForWinner
    contents += doGame
    contents  += randomness
  }
  val scrollPane = new ScrollPane(options)
  object visual extends TextArea{
    background = new Color(0, 128, 255)
    this.text = ""
   }
   object visuals extends BoxPanel(Orientation.Horizontal){
     this.contents += visual
   }
   object DS1 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat1.Dealer"
   }
   object DS2 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat2.Dealer"
   }
   object DS3 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat3.Dealer"
   }
   object DS4 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat4.Dealer"
   }
   object KS1 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat1.Katie"
   }
   object KS2 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat3.Katie"
   }
   object KS3 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat3.Katie"
   }
   object KS4 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat4.Katie"
   }
   object TS1 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat1.Trevor"
   }
   object TS2 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat2.Trevor"
   }
   object TS3 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat3.Trevor"
   }
   object TS4 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat4.Trevor"
   }
   object CS1 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat1.Claudia"
   }
   object CS2 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat2.Claudia"
   }
   object CS3 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat3.Claudia"
   }
   object CS4 extends RadioButton{
    background = new Color(108, 160, 22)
     name = "strat4.Claudia"
   }
   val DealerStrategy = new ButtonGroup{
     buttons += DS1
     buttons += DS2
     buttons += DS3
     buttons += DS4
   }
   val KatieStrategy = new ButtonGroup{
     buttons += KS1
     buttons += KS2
     buttons += KS3
     buttons += KS4
   }
   val TrevorStrategy = new ButtonGroup{
     buttons += TS1
     buttons += TS2
     buttons += TS3
     buttons += TS4
   }
   val ClaudiaStrategy = new ButtonGroup{
     buttons += CS1
     buttons += CS2
     buttons += CS3
     buttons += CS4
   }
   object Strategy1 extends BoxPanel(Orientation.Vertical){
    background = new Color(108, 160, 22)
    contents ++= DealerStrategy.buttons
  }
  object Strategy2 extends BoxPanel(Orientation.Vertical){
   background = new Color(108, 160, 22)
   contents ++= KatieStrategy.buttons
 }
 object Strategy3 extends BoxPanel(Orientation.Vertical){
  background = new Color(108, 160, 22)
  contents ++= TrevorStrategy.buttons
 }
 object Strategy4 extends BoxPanel(Orientation.Vertical){
   background = new Color(108, 160, 22)
   contents ++= ClaudiaStrategy.buttons
  }
  object names extends GridPanel(5,1){
    background = new Color(108, 160, 22)
    contents += new Label("Strategies"){
    font = new Font("AdvantGarde Bk BT", 0, 12)
  }
    contents += new Label("passive"){
    font = new Font("AdvantGarde Bk BT", 0, 12)
  }
    contents += new Label("aggressive"){
    font = new Font("AdvantGarde Bk BT", 0, 12)
  }
    contents += new Label("safe"){
    font = new Font("AdvantGarde Bk BT", 0, 12)
  }
    contents += new Label("moderate"){
    font = new Font("AdvantGarde Bk BT", 0, 12)
  }
  }
  object Strategy1V extends BoxPanel(Orientation.Vertical){
   background = new Color(108, 160, 22)
   contents += new Label("Dealer"){
     font = new Font("AdvantGarde Bk BT", 0, 12)
   }
   contents += Strategy1
  }
 object Strategy2V extends BoxPanel(Orientation.Vertical){
   background = new Color(108, 160, 22)
   contents += new Label("Katie"){
    font = new Font("AdvantGarde Bk BT", 0, 12)
   }
   contents += Strategy2
  }
 object Strategy3V extends BoxPanel(Orientation.Vertical){
   background = new Color(108, 160, 22)
   contents += new Label("Trevor"){
     font = new Font("AdvantGarde Bk BT", 0, 12)
   }
   contents += Strategy3
  }
 object Strategy4V extends BoxPanel(Orientation.Vertical){
   background = new Color(108, 160, 22)
   contents += new Label("Claudia"){
     font = new Font("AdvantGarde Bk BT", 0, 12)
   }
   contents += Strategy4
 }
 object strats extends GridPanel(1,5) {
    background = new Color(108, 160, 22)
    contents += names
    contents += Strategy1V
    contents += Strategy2V
    contents += Strategy3V
    contents += Strategy4V
  }
  object array extends BorderPanel {
    //layout += game -> North
    layout += options -> West
    layout += visuals -> Center
    layout += strats -> North
  }
  this.title = "Blackjack"
  this.contents = array
  this.size = new Dimension(500, 500)
  this.centerOnScreen





  def init(controller: Controller) {
    _controller = Some(controller)
    title = "Blackjack"
    //contents = test
    centerOnScreen
    showGameArea.action = _controller.get.showGameArea
    showPlayerOrder.action = _controller.get.showPlayerOrder
    advancePlayerOrder.action = _controller.get.advPlayerOrder
    initialize.action = _controller.get.initialize
    doMove.action = _controller.get.doMove
    doTurn.action = _controller.get.doTurn
    checkForWinner.action = _controller.get.checkForWinner
    doGame.action = _controller.get.doGame

    this.visible = true
    DS1.action = _controller.get.DS1
    DS2.action = _controller.get.DS2
    DS3.action = _controller.get.DS3
    DS4.action = _controller.get.DS4
    KS1.action = _controller.get.KS1
    KS2.action = _controller.get.KS2
    KS3.action = _controller.get.KS3
    KS4.action = _controller.get.KS4
    TS1.action = _controller.get.TS1
    TS2.action = _controller.get.TS2
    TS3.action = _controller.get.TS3
    TS4.action = _controller.get.TS4
    CS1.action = _controller.get.CS1
    CS2.action = _controller.get.CS2
    CS3.action = _controller.get.CS3
    CS4.action = _controller.get.CS4
    randomness.action =_controller.get.randomness
}

}

//Kim '21. 2020 April 9. Assistance given to the author. Kim had a very good way to show the different strategies.
//For the GUI view we used the 5 by 5 table modled off of crazy eights.
