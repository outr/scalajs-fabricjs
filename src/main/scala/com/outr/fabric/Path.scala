package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Path class
  */
@js.native
@JSName("fabric.Path")
class Path(path: js.Array[String], options: js.Object = new js.Object()) extends Object(options) {
  /**
    * Minimum X from points values, necessary to offset points
    */
  var minX: Double = js.native
  /**
    * Minimum Y from points values, necessary to offset points
    */
  var minY: Double = js.native
  /**
    * Array of path points
    */
  var path: js.Array[String] = js.native
  /**
    * Returns svg representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Path class
  */
@js.native
@JSName("fabric.Path")
object Path extends js.Object {
  /**
    * Indicates that instances of this type are async
    */
  var async: Boolean = js.native
  /**
    * List of attribute names to account for when parsing SVG element (used by `fabric.Path.fromElement`)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Creates an instance of fabric.Path from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, callback: js.Function, options: js.Object = new js.Object()): js.Object = js.native
  /**
    * Creates an instance of fabric.Path from an object
    */
  def fromObject(`object`: js.Object, callback: js.Function): js.Object = js.native
}