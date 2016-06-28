package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Line class
  */
@js.native
@JSName("fabric.Line")
class Line(points: js.Array[String] = new js.Array[String](), options: js.Object = new js.Object()) extends Object(options) {
  /**
    * x value or first line edge
    */
  var x1: Double = js.native
  /**
    * x value or second line edge
    */
  var x2: Double = js.native
  /**
    * y value or first line edge
    */
  var y1: Double = js.native
  /**
    * y value or second line edge
    */
  var y2: Double = js.native
  /**
    * Returns SVG representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Line class
  */
@js.native
@JSName("fabric.Line")
object Line extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by fabric.Line.fromElement)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Returns fabric.Line instance from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, options: js.Object = new js.Object()): Line = js.native
  /**
    * Returns fabric.Line instance from an object representation
    */
  def fromObject(`object`: js.Object): Line = js.native
}