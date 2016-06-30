package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * PencilBrush class
  */
@js.native
@JSName("fabric.PencilBrush")
class PencilBrush(canvas: Canvas) extends BaseBrush {
  /**
    * On mouseup after drawing the path on contextTop canvas we use the points captured to create an new fabric path object and add it to the fabric canvas.
    */
  def _finalizeAndAddPath(): js.Object = js.native
  /**
    * Converts points to SVG path
    */
  def convertPointsToSVGPath(points: js.Array[String], minX: Double, minY: Double): String = js.native
  /**
    * Creates fabric.Path object to add on canvas
    */
  def createPath(pathData: String): Path = js.native
  /**
    * Inovoked on mouse down
    */
  def onMouseDown(pointer: js.Object): js.Object = js.native
  /**
    * Inovoked on mouse move
    */
  def onMouseMove(pointer: js.Object): js.Object = js.native
  /**
    * Invoked on mouse up
    */
  def onMouseUp(): js.Object = js.native
}