package Blackjack_Commands

//******* BOARD *******
object Board {
  def show : String = {
    var area = 
            "Game Area:\n" +
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
    area
  }

}