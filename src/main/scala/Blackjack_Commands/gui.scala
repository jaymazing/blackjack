package Blackjack_Commands

object gui {
  /**
 * @param args
 * Sets up MVC for the GUI
 */

  def main(args: Array[String]): Unit = {

    val model = new Model
    val view  = new View
    val controller = new Controller(view, model)

    view.init(controller)
  }
}
