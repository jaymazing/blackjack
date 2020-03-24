
package Blackjack_Commands



//******* Card *******
class Card (face: String) {
  var card: Option[Card] = None
  
  def show = {
    var result : String = face.toString
    if (result.length < 3) result += " "
    result
  }
}