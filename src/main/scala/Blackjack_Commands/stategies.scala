package Blackjack_Commands

import PlayerOrder._


object Strategies {

  def setup(pl: Player, strategy: String): Int = {
    if (strategy == "passive"){
      if (pl.move != "Stands") {
        pl.move = "Stands"
        pl.available_move = false
        1
      }
      else 0
    }
    if (strategy == "aggressive"){
      if (pl.move != "Busts") {
        val cur = pl.sum_cards(pl.cards)
        if (cur > 21) {
          pl.available_move = false
          pl.move = "Busts"
          1
        }
        else {
          pl.cards = pl.cards :+ Deck.drawCard
          pl.move = "Hit"
          0
        }
      }
      else 0
    }
    if (strategy == "safe"){
      if (pl.move != "Busts" || pl.move != "Stands") {
        val cur = pl.sum_cards(pl.cards)
        if (cur > 21) {
          pl.available_move = false
          pl.move = "Busts"
          1
        }
        else if (cur < 13) {
          pl.cards = pl.cards :+ Deck.drawCard
          pl.move = "Hit"
          0
        }
        else {
          pl.move = "Stands"
          pl.available_move = false
          1
        }
      }
      else 0
    }
    if (strategy == "moderate"){
      if (pl.move != "Busts" || pl.move != "Stands") {
        val cur = pl.sum_cards(pl.cards)
        if (cur > 21) {
          pl.available_move = false
          pl.move = "Busts"
          1
        }
        else if (cur < 18) {
          pl.cards = pl.cards :+ Deck.drawCard
          pl.move = "Hit"
          0
        }
        else {
          pl.move = "Stands"
          pl.available_move = false
          1
        }
      }
      else 0
    }
    else 0
  }

}
