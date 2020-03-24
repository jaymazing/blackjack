package Blackjack_Commands

class Player (val name : String) {
  var cards = List.empty[String]
  var move = ""
  var games_won = 0
  var available_move = true
  var strategy: String = "passive"
  def ace(hand: List[String]): Boolean = {
    if (hand.map(_.toInt).sum + 10 <= 21) true
    else false
  }
  def sum_cards(hand: List[String]): Int = {
    if (hand.contains("1")) {
      if (ace(hand)) hand.map(_.toInt).sum + 10
      else hand.map(_.toInt).sum
    }
    else hand.map(_.toInt).sum
  }
  def show_cards(hand: List[String]): String = {
    var result = ""
    for (p <- hand)
      result += p + ", "
    if (hand.isEmpty) ""
    else result.substring(0, result.length-2)
  }
}
