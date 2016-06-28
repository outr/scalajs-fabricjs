package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Canvas class
  */
@js.native
@JSName("fabric.Canvas")
class Canvas(el: String, options: js.Object = new js.Object()) extends StaticCanvas(el, options) {
  /**
    * Indicates which key enable alternate action on corner values: altKey, shiftKey, ctrlKey
    */
  var altActionKey: String = js.native
  /**
    * Indicates which key enable centered Transfrom values: altKey, shiftKey, ctrlKey
    */
  var centeredKey: String = js.native
  /**
    * When true, objects use center point as the origin of rotate transformation. Backwards incompatibility note: This property replaces "centerTransform" (Boolean).
    */
  var centeredRotation: Boolean = js.native
  /**
    * When true, objects use center point as the origin of scale transformation. Backwards incompatibility note: This property replaces "centerTransform" (Boolean).
    */
  var centeredScaling: Boolean = js.native
  /**
    * Default element class that's given to wrapper (div) element of canvas
    */
  var containerClass: String = js.native
  /**
    * Default cursor value used for the entire canvas
    */
  var defaultCursor: String = js.native
  /**
    * Cursor value used during free drawing
    */
  var freeDrawingCursor: String = js.native
  /**
    * Default cursor value used when hovering over an object on canvas
    */
  var hoverCursor: String = js.native
  /**
    * Indicates that canvas is interactive. This property should not be changed.
    */
  var interactive: Boolean = js.native
  /**
    * When true, mouse events on canvas (mousedown/mousemove/mouseup) result in free drawing. After mousedown, mousemove creates a shape, and then mouseup finalizes it and adds an instance of `fabric.Path` onto canvas.
    */
  var isDrawingMode: Boolean = js.native
  /**
    * Default cursor value used when moving an object on canvas
    */
  var moveCursor: String = js.native
  /**
    * When true, object detection happens on per-pixel basis rather than on per-bounding-box
    */
  var perPixelTargetFind: Boolean = js.native
  /**
    * Cursor value used for rotation point
    */
  var rotationCursor: String = js.native
  /**
    * Indicates whether group selection should be enabled
    */
  var selection: Boolean = js.native
  /**
    * Color of the border of selection (usually slightly darker than color of selection itself)
    */
  var selectionBorderColor: String = js.native
  /**
    * Color of selection
    */
  var selectionColor: String = js.native
  /**
    * Default dash array pattern If not empty the selection border is dashed
    */
  var selectionDashArray: js.Array[String] = js.native
  /**
    * Indicates which key enable multiple click selection values: altKey, shiftKey, ctrlKey
    */
  var selectionKey: String = js.native
  /**
    * Width of a line used in object/group selection
    */
  var selectionLineWidth: Double = js.native
  /**
    * When true, target detection is skipped when hovering over canvas. This can be used to improve performance.
    */
  var skipTargetFind: Boolean = js.native
  /**
    * Number of pixels around target pixel to tolerate (consider active) during object detection
    */
  var targetFindTolerance: Double = js.native
  /**
    * Indicates which key enable unproportional scaling values: altKey, shiftKey, ctrlKey
    */
  var uniScaleKey: String = js.native
  /**
    * When true, objects can be transformed by one side (unproportionally)
    */
  var uniScaleTransform: Boolean = js.native
  /**
    * Sets the cursor depending on where the canvas is being hovered. Note: very buggy in Opera
    */
  def _setCursorFromEvent(e: org.scalajs.dom.Event, target: js.Object): js.Object = js.native
  /**
    * Checks if point is contained within an area of given object
    */
  def containsPoint(e: org.scalajs.dom.Event, target: Object): js.Object = js.native
  /**
    * Deactivates all objects on canvas, removing any active group or object
    */
  def deactivateAll(): Canvas = js.native
  /**
    * Deactivates all objects and dispatches appropriate events
    */
  def deactivateAllWithDispatch(): Canvas = js.native
  /**
    * Discards currently active group
    */
  def discardActiveGroup(): Canvas = js.native
  /**
    * Discards currently active object
    */
  def discardActiveObject(): Canvas = js.native
  /**
    * Draws objects' controls (borders/controls)
    */
  def drawControls(ctx: org.scalajs.dom.CanvasRenderingContext2D): js.Object = js.native
  /**
    * Method that determines what object we are clicking on
    */
  def findTarget(e: org.scalajs.dom.Event, skipGroup: Boolean): js.Object = js.native
  /**
    * Returns pointer coordinates relative to canvas.
    */
  def getPointer(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Returns context of canvas where object selection is drawn
    */
  def getSelectionContext(): js.Object = js.native
  /**
    * Returns <canvas> element on which object selection is drawn
    */
  def getSelectionElement(): js.Object = js.native
  /**
    * Returns true if object is transparent at a certain location
    */
  def isTargetTransparent(target: Object, x: Double, y: Double): js.Object = js.native
  /**
    * Removes all event listeners
    */
  def removeListeners(): js.Object = js.native
  /**
    * Sets active group to a specified one
    */
  def setActiveGroup(group: Group): Canvas = js.native
  /**
    * Sets given object as the only active object on canvas
    */
  def setActiveObject(`object`: Object, e: org.scalajs.dom.Event = null): Canvas = js.native
  /**
    * Set the cursor type of the canvas element
    */
  def setCursor(value: String): js.Object = js.native
}