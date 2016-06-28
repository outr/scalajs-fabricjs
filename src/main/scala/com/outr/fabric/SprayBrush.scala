package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * SprayBrush class
  */
@js.native
@JSName("fabric.SprayBrush")
class SprayBrush(canvas: Canvas) extends js.Object {
  /**
    * Density of a spray (number of dots per chunk)
    */
  var density: Double = js.native
  /**
    * Width of spray dots
    */
  var dotWidth: Double = js.native
  /**
    * Width variance of spray dots
    */
  var dotWidthVariance: Double = js.native
  /**
    * Whether overlapping dots (rectangles) should be removed (for performance reasons)
    */
  var optimizeOverlapping: Boolean = js.native
  /**
    * Whether opacity of a dot should be random
    */
  var randomOpacity: Boolean = js.native
  /**
    * Width of a spray
    */
  var width: Double = js.native
  /**
    * Parameters:
    */
  def addSprayChunk(): js.Object = js.native
  /**
    * Invoked on mouse down
    */
  def onMouseDown(pointer: js.Object): js.Object = js.native
  /**
    * Invoked on mouse move
    */
  def onMouseMove(pointer: js.Object): js.Object = js.native
  /**
    * Invoked on mouse up
    */
  def onMouseUp(): js.Object = js.native
  /**
    * Renders brush
    */
  def render(): js.Object = js.native
}