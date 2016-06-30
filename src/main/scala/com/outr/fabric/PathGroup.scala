package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Path group class
  */
@js.native
@JSName("fabric.PathGroup")
class PathGroup(paths: js.Array[String], options: js.Object = new js.Object()) extends Path(paths, options) {
  /**
    * Returns all paths in this path group
    */
  def getObjects(): js.Array[String] = js.native
  /**
    * Returns true if all paths in this group are of same color
    */
  def isSameColor(): Boolean = js.native
  /**
    * Calculate width and height based on paths contained
    */
  def parseDimensionsFromPaths(): js.Object = js.native
}

/**
  * Path group class
  */
@js.native
@JSName("fabric.PathGroup")
object PathGroup extends js.Object {
  /**
    * Indicates that instances of this type are async
    */
  var async: Boolean = js.native
  /**
    * Creates fabric.PathGroup instance from an object representation
    */
  def fromObject(`object`: js.Object, callback: js.Function): js.Object = js.native
}