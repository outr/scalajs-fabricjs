package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * 
  */
@js.native
@JSName("fabric.Collection")
class Collection() extends js.Object {
}

/**
  * 
  */
@js.native
@JSName("fabric.Collection")
object Collection extends js.Object {
  /**
    * Adds objects to collection, then renders canvas (if `renderOnAddRemove` is not `false`) Objects should be instances of (or inherit from) fabric.Object
    */
  def add(`object`: Object): js.Object = js.native
  /**
    * Returns number representation of a collection complexity
    */
  def complexity(): js.Object = js.native
  /**
    * Returns true if collection contains an object
    */
  def contains(`object`: js.Object): js.Object = js.native
  /**
    * Executes given function for each object in this group
    */
  def forEachObject(callback: js.Function, context: js.Object): js.Object = js.native
  /**
    * Returns an array of children objects of this instance Type parameter introduced in 1.3.10
    */
  def getObjects(`type`: String = ""): js.Array[String] = js.native
  /**
    * Inserts an object into collection at specified index, then renders canvas (if `renderOnAddRemove` is not `false`) An object should be an instance of (or inherit from) fabric.Object
    */
  def insertAt(`object`: js.Object, index: Double, nonSplicing: Boolean): js.Object = js.native
  /**
    * Returns true if collection contains no objects
    */
  def isEmpty(): js.Object = js.native
  /**
    * Returns object at specified index
    */
  def item(index: Double): js.Object = js.native
  /**
    * Removes objects from a collection, then renders canvas (if `renderOnAddRemove` is not `false`)
    */
  def remove(`object`: Object): js.Object = js.native
  /**
    * Returns a size of a collection (i.e: length of an array containing its objects)
    */
  def size(): js.Object = js.native
}