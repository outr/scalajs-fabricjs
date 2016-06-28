package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Polyline class
  */
@js.native
@JSName("fabric.Polyline")
class Polyline(points: js.Array[String], options: js.Object = new js.Object(), skipOffset: Boolean = false) extends Object(options) {
  /**
    * Minimum X from points values, necessary to offset points
    */
  var minX: Double = js.native
  /**
    * Minimum Y from points values, necessary to offset points
    */
  var minY: Double = js.native
  /**
    * Points array
    */
  var points: js.Array[String] = js.native
  /**
    * Returns SVG representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Polyline class
  */
@js.native
@JSName("fabric.Polyline")
object Polyline extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by fabric.Polyline.fromElement)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Returns fabric.Polyline instance from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, options: js.Object = new js.Object()): Polyline = js.native
  /**
    * Returns fabric.Polyline instance from an object representation
    */
  def fromObject(`object`: js.Object): Polyline = js.native
}