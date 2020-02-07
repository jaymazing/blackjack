package Blackjack_commands
import scala.collection.mutable.Stack
object Menu {
  var order = Stack("Chuck", "Katie", "Trevor", "Cluadia")

  def showGameArea : String = {
        val board =
            "Board:\n" +
            "                           Dealer                        \n" +
            "                        [ ][ ][ ][ ]                     \n" +
            "                                                         \n" +
            "  Chuck           Katie          Trevor        Claudia   \n" +
            "[ ][ ][ ][ ]   [ ][ ][ ][ ]   [ ][ ][ ][ ]   [ ][ ][ ][ ]\n" +
            "\n" +
            "Games Won:\n" +
            "Chuck = 0\n" +
            "Katie = 0\n" +
            "Trevor = 0\n" +
            "Claudia = 0"
    
  }

  def showPlayerOrder : String = {
    order.mkString(", ")
  }

  def advancePlayerOrder : String = {
    val cur = order.pop()
    order = order :+ cur
    order.mkString(", ")
  }
}
/* CDT Maeng '21 A3. 1/22/20.Assistance given to author. CDT Maeng told me
in a verbal conversation that a stack would be useful here. He told me to refernce
the scala API for stacks. I originally tried to use order.push(cur). When it did
not work he told me to try :+ cur. */
