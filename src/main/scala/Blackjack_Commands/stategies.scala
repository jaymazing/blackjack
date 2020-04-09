package Blackjack_Commands

import PlayerOrder._


object Strategies {

  def setup(pl: Player, strategy: String): String = {
    if (strategy == "passive"){
      if (pl.move != "Stands") {
        pl.move = "Stands"
        pl.available_move = false
      }
      Menu.showGameArea
    }
    if (strategy == "aggressive"){
      if (pl.move != "Busts") {
        val cur = pl.sum_cards(pl.cards)
        if (cur > 21) {
          pl.available_move = false
          pl.move = "Busts"
        }
        else {
          pl.cards = pl.cards :+ Deck.drawCard
          pl.move = "Hit"
        }
        Menu.showGameArea
      }
      else Menu.showGameArea
    }
    if (strategy == "safe"){
      if (pl.move != "Busts" || pl.move != "Stands") {
        val cur = pl.sum_cards(pl.cards)
        if (cur > 21) {
          pl.available_move = false
          pl.move = "Busts"
        }
        else if (cur < 13) {
          pl.cards = pl.cards :+ Deck.drawCard
          pl.move = "Hit"
        }
        else {
          pl.move = "Stands"
          pl.available_move = false
        }
        Menu.showGameArea
      }
      else Menu.showGameArea
    }
    if (strategy == "moderate"){
      if (pl.move != "Busts" || pl.move != "Stands") {
        val cur = pl.sum_cards(pl.cards)
        if (cur > 21) {
          pl.available_move = false
          pl.move = "Busts"
        }
        else if (cur < 18) {
          pl.cards = pl.cards :+ Deck.drawCard
          pl.move = "Hit"
        }
        else {
          pl.move = "Stands"
          pl.available_move = false
        }
        Menu.showGameArea
      }
      else Menu.showGameArea
    }
    else Menu.showGameArea
  }

}
