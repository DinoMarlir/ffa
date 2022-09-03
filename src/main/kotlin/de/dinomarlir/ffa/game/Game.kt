package de.dinomarlir.ffa.game

import de.dinomarlir.ffa.FFA

class Game() {
    val scheduler = GameScheduler()


    fun startGame() {
        scheduler.runTaskTimer(FFA, 0, 20)
    }

    fun stopGame() {
        scheduler.cancel()
    }
}