package co.cdmunoz.simplerolldiceapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.GestureDetector
import android.view.GestureDetector.OnDoubleTapListener
import android.view.GestureDetector.OnGestureListener
import android.view.MotionEvent

open class BaseActivity : AppCompatActivity(), OnGestureListener, OnDoubleTapListener {

  companion object {
    val DEBUG_TAG: String = "RollingDices"
    lateinit var gestureDetector: GestureDetector
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    gestureDetector = GestureDetector(this, this)
    gestureDetector.setOnDoubleTapListener(this)
  }

  override fun onTouchEvent(event: MotionEvent?): Boolean {
    gestureDetector.onTouchEvent(event)
    return super.onTouchEvent(event)
  }

  override fun onShowPress(e: MotionEvent?) {
    Log.d(DEBUG_TAG, "onShowPress: " + e.toString())
  }

  override fun onSingleTapUp(e: MotionEvent?): Boolean {
    Log.d(DEBUG_TAG, "onSingleTapUp: " + e.toString())
    return true
  }

  override fun onDown(e: MotionEvent?): Boolean {
    Log.d(DEBUG_TAG, "onDown: " + e.toString())
    return true
  }

  override fun onFling(e1: MotionEvent?, e2: MotionEvent?, velocityX: Float,
      velocityY: Float): Boolean {
    Log.d(DEBUG_TAG, "onFling: " + e1.toString() + e2.toString())
    return true
  }

  override fun onScroll(e1: MotionEvent?, e2: MotionEvent?, distanceX: Float,
      distanceY: Float): Boolean {
    Log.d(DEBUG_TAG, "onScroll: " + e1.toString() + e2.toString())
    return true
  }

  override fun onLongPress(e: MotionEvent?) {
    Log.d(DEBUG_TAG, "onLongPress: " + e.toString())
  }

  override fun onDoubleTap(e: MotionEvent?): Boolean {
    Log.d(DEBUG_TAG, "onDoubleTap: " + e.toString())
    return true
  }

  override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
    Log.d(DEBUG_TAG, "onDoubleTapEvent: " + e.toString())
    return true
  }

  override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
    Log.d(DEBUG_TAG, "onSingleTapConfirmed: " + e.toString())
    return true
  }

}
