package co.cdmunoz.simplerolldiceapp

import android.os.Bundle
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_roll_dice.dice1
import kotlinx.android.synthetic.main.activity_roll_dice.dice2
import java.util.Random

class RollDiceActivity : BaseActivity() {

  companion object {
    val RANDOM: Random = Random()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_roll_dice)

  }

  fun randomDiceValue(): Int {
    return RANDOM.nextInt(6) + 1
  }

  fun rollDices() {
    val dice1Value = randomDiceValue()
    val dice2Value = randomDiceValue()
    val resourceDice1 = resources.getIdentifier("ic_dice_" + dice1Value, "drawable",
        "co.cdmunoz.simplerolldiceapp")
    val resourceDice2 = resources.getIdentifier("ic_dice_" + dice2Value, "drawable",
        "co.cdmunoz.simplerolldiceapp")

    dice1.setImageResource(resourceDice1)
    dice2.setImageResource(resourceDice2)
  }

  override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
    rollDices()
    return super.onDoubleTapEvent(e)
  }
}
