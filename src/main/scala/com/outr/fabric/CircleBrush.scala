package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * CircleBrush class
  */
@js.native
@JSName("fabric.CircleBrush")
class CircleBrush(canvas: Canvas) extends js.Object {
  /**
    * Width of a brush
    */
  var width: Double = js.native
  /**
    * Parameters:
    */
  def addPoint(): Point = js.native
  /**
    * Invoked inside on mouse down and mouse move
    */
  def drawDot(pointer: js.Object): js.Object = js.native
  /**
    * Invoked on mouse down
    */
  def onMouseDown(): js.Object = js.native
  /**
    * Invoked on mouse move
    */
  def onMouseMove(pointer: js.Object): js.Object = js.native
  /**
    * Invoked on mouse up
    */
  def onMouseUp(pointer: js.Object): js.Object = js.native
}