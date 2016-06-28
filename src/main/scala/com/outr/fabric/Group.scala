package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Group class
  */
@js.native
@JSName("fabric.Group")
class Group(objects: js.Object, options: js.Object = new js.Object(), isAlreadyGrouped: Boolean = false) extends Object(options) {
  /**
    * Properties that are delegated to group objects when reading/writing
    */
  var delegatedProperties: String = js.native
  /**
    * Sets controls of this group to the Textbox's special configuration if one is present in the group. Deletes _controlsVisibility otherwise, so that it gets initialized to default value at runtime.
    */
  def _refreshControlsVisibility(): js.Object = js.native
  /**
    * Adds objects to collection, then renders canvas (if `renderOnAddRemove` is not `false`) Objects should be instances of (or inherit from) fabric.Object
    */
  def add(`object`: Object): js.Object = js.native
  /**
    * Adds an object to a group; Then recalculates group's dimension, position.
    */
  def addWithUpdate(`object`: js.Object): Group = js.native
  /**
    * Returns true if collection contains an object
    */
  def contains(`object`: js.Object): js.Object = js.native
  /**
    * Destroys a group (restoring state of its objects)
    */
  def destroy(): Group = js.native
  /**
    * Executes given function for each object in this group
    */
  def forEachObject(callback: js.Function, context: js.Object): js.Object = js.native
  /**
    * Returns an array of children objects of this instance Type parameter introduced in 1.3.10
    */
  def getObjects(`type`: String = ""): js.Array[String] = js.native
  /**
    * Checks whether this group was moved (since `saveCoords` was called last)
    */
  def hasMoved(): js.Object = js.native
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
    * Realises the transform from this group onto the supplied object i.e. it tells you what would happen if the supplied object was in the group, and then the group was destroyed. It mutates the supplied object.
    */
  def realizeTransform(`object`: Object): Object = js.native
  /**
    * Removes an object from a group; Then recalculates group's dimension, position.
    */
  def removeWithUpdate(`object`: js.Object): Group = js.native
  /**
    * Saves coordinates of this instance (to be used together with `hasMoved`)
    */
  def saveCoords(): Group = js.native
  /**
    * Sets coordinates of all group objects
    */
  def setObjectsCoords(): Group = js.native
  /**
    * Returns a size of a collection (i.e: length of an array containing its objects)
    */
  def size(): js.Object = js.native
  /**
    * Returns svg representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Group class
  */
@js.native
@JSName("fabric.Group")
object Group extends js.Object {
  /**
    * Indicates that instances of this type are async
    */
  var async: Boolean = js.native
  /**
    * Returns fabric.Group instance from an object representation
    */
  def fromObject(`object`: js.Object, callback: js.Function = null): Group = js.native
}