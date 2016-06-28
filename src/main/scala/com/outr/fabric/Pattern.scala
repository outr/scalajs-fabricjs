package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Pattern class
  */
@js.native
@JSName("fabric.Pattern")
class Pattern(options: js.Object = new js.Object()) extends js.Object {
  /**
    * Pattern horizontal offset from object's left/top corner
    */
  var offsetX: Double = js.native
  /**
    * Pattern vertical offset from object's left/top corner
    */
  var offsetY: Double = js.native
  /**
    * Repeat property of a pattern (one of repeat, repeat-x, repeat-y or no-repeat)
    */
  var repeat: String = js.native
  /**
    * Returns an instance of CanvasPattern
    */
  def toLive(ctx: org.scalajs.dom.CanvasRenderingContext2D): js.Object = js.native
  /**
    * Returns object representation of a pattern
    */
  def toObject(): js.Object = js.native
  /**
    * Returns SVG representation of a pattern
    */
  def toSVG(`object`: Object): js.Object = js.native
}