package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Rectangle class
  */
@js.native
@JSName("fabric.Rect")
class Rect(options: js.Object = new js.Object()) extends Object(options) {
  /**
    * Horizontal border radius
    */
  var rx: Double = js.native
  /**
    * Vertical border radius
    */
  var ry: Double = js.native
  /**
    * Returns svg representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Rectangle class
  */
@js.native
@JSName("fabric.Rect")
object Rect extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Rect.fromElement`)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Returns fabric.Rect instance from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, options: js.Object = new js.Object()): Rect = js.native
  /**
    * Returns fabric.Rect instance from an object representation
    */
  def fromObject(`object`: js.Object): js.Object = js.native
}