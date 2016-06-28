package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Gradient class
  */
@js.native
@JSName("fabric.Gradient")
class Gradient(options: js.Object = new js.Object()) extends js.Object {
  /**
    * Horizontal offset for aligning gradients coming from SVG when outside pathgroups
    */
  var offsetX: Double = js.native
  /**
    * Vertical offset for aligning gradients coming from SVG when outside pathgroups
    */
  var offsetY: Double = js.native
  /**
    * Adds another colorStop
    */
  def addColorStop(colorStop: js.Object): Gradient = js.native
  /**
    * Returns an instance of CanvasGradient
    */
  def toLive(ctx: org.scalajs.dom.CanvasRenderingContext2D): js.Object = js.native
  /**
    * Returns object representation of a gradient
    */
  def toObject(): js.Object = js.native
  /**
    * Returns SVG representation of an gradient
    */
  def toSVG(`object`: js.Object, normalize: Boolean): js.Object = js.native
}

/**
  * Gradient class
  */
@js.native
@JSName("fabric.Gradient")
object Gradient extends js.Object {
  /**
    * Returns fabric.Gradient instance from its object representation
    */
  def forObject(obj: js.Object, options: js.Object = new js.Object()): js.Object = js.native
  /**
    * Returns fabric.Gradient instance from an SVG element
    */
  def fromElement(el: org.scalajs.dom.raw.SVGGradientElement, instance: Object): Gradient = js.native
}