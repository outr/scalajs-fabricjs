package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Polygon class
  */
@js.native
@JSName("fabric.Polygon")
class Polygon(points: js.Array[String], options: js.Object = new js.Object()) extends Object(options) {
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
    * Returns svg representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Polygon class
  */
@js.native
@JSName("fabric.Polygon")
object Polygon extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Returns fabric.Polygon instance from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, options: js.Object = new js.Object()): Polygon = js.native
  /**
    * Returns fabric.Polygon instance from an object representation
    */
  def fromObject(`object`: js.Object): Polygon = js.native
}