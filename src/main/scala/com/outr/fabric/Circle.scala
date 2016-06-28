package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Circle class
  */
@js.native
@JSName("fabric.Circle")
class Circle(options: js.Object = new js.Object()) extends Object(options) {
  /**
    * End angle of the circle
    */
  var endAngle: Double = js.native
  /**
    * Radius of this circle
    */
  var radius: Double = js.native
  /**
    * Start angle of the circle, moving clockwise
    */
  var startAngle: Double = js.native
  /**
    * Returns horizontal radius of an object (according to how an object is scaled)
    */
  def getRadiusX(): js.Object = js.native
  /**
    * Returns vertical radius of an object (according to how an object is scaled)
    */
  def getRadiusY(): js.Object = js.native
  /**
    * Sets radius of an object (and updates width accordingly)
    */
  def setRadius(): Circle = js.native
  /**
    * Returns svg representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Circle class
  */
@js.native
@JSName("fabric.Circle")
object Circle extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by fabric.Circle.fromElement)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Returns fabric.Circle instance from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, options: js.Object = new js.Object()): Circle = js.native
  /**
    * Returns fabric.Circle instance from an object representation
    */
  def fromObject(`object`: js.Object): js.Object = js.native
}