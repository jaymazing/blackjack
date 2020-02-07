package Blackjack_Commands

object Scoreboard {
  var Chuck = 0
  var Katie = 0
  var Trevor = 0
  var Claudia = 0


  def show = {
  	var result = "Games won: " + "\n" + "Chuck: " + Chuck.toString + "\n" 
  	+ "Katie: " + Katie.toString + "\n" 
  	+ "Trevor: " + Trevor.toString + "\n" 
  	+ "Claudia: " + Claudia.toString + "\n"
  	result

  }
}