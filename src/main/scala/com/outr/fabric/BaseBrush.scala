package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * BaseBrush class
  */
@js.native
@JSName("fabric.BaseBrush")
class BaseBrush() extends js.Object {
  /**
    * Color of a brush
    */
  var color: String = js.native
  /**
    * Shadow object representing shadow of this shape. Backwards incompatibility note: This property replaces "shadowColor" (String), "shadowOffsetX" (Number), "shadowOffsetY" (Number) and "shadowBlur" (Number) since v1.2.12
    */
  var shadow: Shadow = js.native
  /**
    * Stroke Dash Array.
    */
  var strokeDashArray: js.Array[String] = js.native
  /**
    * Line endings style of a brush (one of "butt", "round", "square")
    */
  var strokeLineCap: String = js.native
  /**
    * Corner style of a brush (one of "bevil", "round", "miter")
    */
  var strokeLineJoin: String = js.native
  /**
    * Width of a brush
    */
  var width: Double = js.native
  /**
    * Sets shadow of an object
    */
  def setShadow(options: String = ""): Object = js.native
}