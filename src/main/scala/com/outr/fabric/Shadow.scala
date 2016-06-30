package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Shadow class
  */
@js.native
@JSName("fabric.Shadow")
class Shadow(options: String = "") extends js.Object {
  /**
    * Whether the shadow should affect stroke operations
    */
  var affectStroke: Boolean = js.native
  /**
    * Shadow blur
    */
  var blur: Double = js.native
  /**
    * Shadow color
    */
  var color: String = js.native
  /**
    * Indicates whether toObject should include default values
    */
  var includeDefaultValues: Boolean = js.native
  /**
    * Shadow horizontal offset
    */
  var offsetX: Double = js.native
  /**
    * Shadow vertical offset
    */
  var offsetY: Double = js.native
  /**
    * Returns object representation of a shadow
    */
  def toObject(): js.Object = js.native
  /**
    * Returns SVG representation of a shadow
    */
  def toSVG(`object`: Object): String = js.native
}

/**
  * Shadow class
  */
@js.native
@JSName("fabric.Shadow")
object Shadow extends js.Object {
  /**
    * Regex matching shadow offsetX, offsetY and blur (ex: "2px 2px 10px rgba(0,0,0,0.2)", "rgb(0,255,0) 2px 2px")
    */
  var reOffsetsAndBlur: js.Function = js.native
}