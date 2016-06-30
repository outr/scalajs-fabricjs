package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Image class
  */
@js.native
@JSName("fabric.Image")
class Image(element: String, options: js.Object = new js.Object()) extends Object(options) {
  /**
    * private contains last value of scaleX to detect if the Image got resized after the last Render
    */
  var _lastScaleX: Double = js.native
  /**
    * private contains last value of scaleY to detect if the Image got resized after the last Render
    */
  var _lastScaleY: Double = js.native
  /**
    * AlignX value, part of preserveAspectRatio (one of "none", "mid", "min", "max")
    */
  var alignX: String = js.native
  /**
    * AlignY value, part of preserveAspectRatio (one of "none", "mid", "min", "max")
    */
  var alignY: String = js.native
  /**
    * crossOrigin value (one of "", "anonymous", "use-credentials")
    */
  var crossOrigin: String = js.native
  /**
    * Alias for getSrc
    */
  var getSvgSrc: String = js.native
  /**
    * meetOrSlice value, part of preserveAspectRatio (one of "meet", "slice"). if meet the image is always fully visibile, if slice the viewport is always filled with image.
    */
  var meetOrSlice: String = js.native
  /**
    * Source: fabric.js, line 18036
    */
  def _needsResize(): js.Object = js.native
  /**
    * Returns image element which this instance if based on
    */
  def getElement(): org.scalajs.dom.raw.HTMLImageElement = js.native
  /**
    * Returns original size of an image
    */
  def getOriginalSize(): js.Object = js.native
  /**
    * Returns source of an image
    */
  def getSrc(): String = js.native
  /**
    * Sets crossOrigin value (on an instance and corresponding image element)
    */
  def setCrossOrigin(): Image = js.native
  /**
    * Sets image element for this instance to a specified one. If filters defined they are applied to new image. You might need to call `canvas.renderAll` and `object.setCoords` after replacing, to render new image and update controls area.
    */
  def setElement(element: org.scalajs.dom.raw.HTMLImageElement, callback: js.Function = null, options: js.Object = new js.Object()): Image = js.native
  /**
    * Sets source of an image
    */
  def setSrc(src: String, callback: js.Function = null, options: js.Object = new js.Object()): Image = js.native
  /**
    * Returns SVG representation of an instance
    */
  def toSVG(reviver: js.Function = null): String = js.native
}

/**
  * Image class
  */
@js.native
@JSName("fabric.Image")
object Image extends js.Object {
  /**
    * Indicates that instances of this type are async
    */
  var async: Boolean = js.native
  /**
    * List of attribute names to account for when parsing SVG element (used by fabric.Image.fromElement)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Default CSS class name for canvas
    */
  var CSS_CANVAS: String = js.native
  /**
    * Indicates compression level used when generating PNG under Node (in applyFilters). Any of 0-9
    */
  var pngCompression: Double = js.native
  /**
    * Returns fabric.Image instance from an SVG element
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, callback: js.Function, options: js.Object = new js.Object()): Image = js.native
  /**
    * Creates an instance of fabric.Image from its object representation
    */
  def fromObject(`object`: js.Object, callback: js.Function = null): js.Object = js.native
  /**
    * Creates an instance of fabric.Image from an URL string
    */
  def fromURL(url: String, callback: js.Function = null, imgOptions: js.Object = new js.Object()): js.Object = js.native
}