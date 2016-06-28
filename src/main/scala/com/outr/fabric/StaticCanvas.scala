package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Static canvas class
  */
@js.native
@JSName("fabric.StaticCanvas")
class StaticCanvas(el: String, options: js.Object = new js.Object()) extends js.Object {
  /**
    * Indicates whether the browser can be scrolled when using a touchscreen and dragging on the canvas
    */
  var allowTouchScrolling: Boolean = js.native
  /**
    * Background color of canvas instance. Should be set via fabric.StaticCanvas#setBackgroundColor.
    */
  var backgroundColor: String = js.native
  /**
    * Background image of canvas instance. Should be set via fabric.StaticCanvas#setBackgroundImage. Backwards incompatibility note: The "backgroundImageOpacity" and "backgroundImageStretch" properties are deprecated since 1.3.9. Use fabric.Image#opacity, fabric.Image#width and fabric.Image#height.
    */
  var backgroundImage: Image = js.native
  /**
    * Function that determines clipping of entire canvas area Being passed context as first argument. See clipping canvas area in https://github.com/kangax/fabric.js/wiki/FAQ
    */
  var clipTo: js.Function = js.native
  /**
    * Indicates whether object controls (borders/controls) are rendered above overlay image
    */
  var controlsAboveOverlay: Boolean = js.native
  /**
    * When true, canvas is scaled by devicePixelRatio for better rendering on retina screens
    */
  var enableRetinaScaling: Boolean = js.native
  /**
    * Animation duration (in ms) for fx* methods
    */
  var FX_DURATION: Double = js.native
  /**
    * Indicates whether this canvas will use image smoothing, this is on by default in browsers
    */
  var imageSmoothingEnabled: Boolean = js.native
  /**
    * Indicates whether toObject/toDatalessObject should include default values
    */
  var includeDefaultValues: Boolean = js.native
  /**
    * Overlay color of canvas instance. Should be set via fabric.StaticCanvas#setOverlayColor
    */
  var overlayColor: String = js.native
  /**
    * Overlay image of canvas instance. Should be set via fabric.StaticCanvas#setOverlayImage. Backwards incompatibility note: The "overlayImageLeft" and "overlayImageTop" properties are deprecated since 1.3.9. Use fabric.Image#left and fabric.Image#top.
    */
  var overlayImage: Image = js.native
  /**
    * Indicates whether objects should remain in current stack position when selected. When false objects are brought to top and rendered as part of the selection group
    */
  var preserveObjectStacking: Boolean = js.native
  /**
    * Indicates whether fabric.Collection.add, fabric.Collection.insertAt and fabric.Collection.remove should also re-render canvas. Disabling this option could give a great performance boost when adding/removing a lot of objects to/from canvas at once (followed by a manual rendering after addition/deletion)
    */
  var renderOnAddRemove: Boolean = js.native
  /**
    * Indicates whether objects' state should be saved
    */
  var stateful: Boolean = js.native
  /**
    * When true, getSvgTransform() will apply the StaticCanvas.viewportTransform to the SVG transformation. When true, a zoomed canvas will then produce zoomed SVG output.
    */
  var svgViewportTransformation: Boolean = js.native
  /**
    * The transformation (in the format of Canvas transform) which focuses the viewport
    */
  var viewportTransform: js.Array[String] = js.native
  /**
    * Divides objects in two groups, one to render immediately and one to render as activeGroup. return objects to render immediately and pushes the other in the activeGroup.
    */
  def _chooseObjectsToRender(): js.Object = js.native
  /**
    * Pan viewport so as to place point at top left corner of canvas
    */
  def absolutePan(point: Point): Canvas = js.native
  /**
    * Adds objects to collection, then renders canvas (if `renderOnAddRemove` is not `false`) Objects should be instances of (or inherit from) fabric.Object
    */
  def add(`object`: Object): js.Object = js.native
  /**
    * Moves an object or a selection up in stack of drawn objects
    */
  def bringForward(`object`: Object, intersecting: Boolean = false): Canvas = js.native
  /**
    * Moves an object or the objects of a multiple selection to the top of the stack of drawn objects
    */
  def bringToFront(`object`: Object): Canvas = js.native
  /**
    * Calculates canvas element offset relative to the document This method is also attached as "resize" event handler of window
    */
  def calcOffset(): Canvas = js.native
  /**
    * Centers object vertically and horizontally. You might need to call `setCoords` on an object after centering, to update controls area.
    */
  def centerObject(`object`: Object): Canvas = js.native
  /**
    * Centers object horizontally. You might need to call `setCoords` on an object after centering, to update controls area.
    */
  def centerObjectH(`object`: Object): Canvas = js.native
  /**
    * Centers object vertically. You might need to call `setCoords` on an object after centering, to update controls area.
    */
  def centerObjectV(`object`: Object): Canvas = js.native
  /**
    * Clears all contexts (background, main, top) of an instance
    */
  def clear(): Canvas = js.native
  /**
    * Clears specified context of canvas element
    */
  def clearContext(ctx: org.scalajs.dom.CanvasRenderingContext2D): Canvas = js.native
  /**
    * Clones canvas instance
    */
  def clone(callback: js.Object = new js.Object(), properties: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Clones canvas instance without cloning existing data. This essentially copies canvas dimensions, clipping properties, etc. but leaves data empty (so that you can populate it with your own)
    */
  def cloneWithoutData(callback: js.Object = new js.Object()): js.Object = js.native
  /**
    * Returns number representation of a collection complexity
    */
  def complexity(): js.Object = js.native
  /**
    * Returns true if collection contains an object
    */
  def contains(`object`: js.Object): js.Object = js.native
  /**
    * Clears a canvas element and removes all event listeners
    */
  def dispose(): Canvas = js.native
  /**
    * Executes given function for each object in this group
    */
  def forEachObject(callback: js.Function, context: js.Object): js.Object = js.native
  /**
    * Centers object horizontally with animation.
    */
  def fxCenterObjectH(`object`: Object, callbacks: js.Object = new js.Object()): Canvas = js.native
  /**
    * Centers object vertically with animation.
    */
  def fxCenterObjectV(`object`: Object, callbacks: js.Object = new js.Object()): Canvas = js.native
  /**
    * Same as `fabric.Canvas#remove` but animated
    */
  def fxRemove(`object`: Object, callbacks: js.Object = new js.Object()): Canvas = js.native
  /**
    * Same as fabric.Canvas.prototype.straightenObject, but animated
    */
  def fxStraightenObject(`object`: Object): Canvas = js.native
  /**
    * Returns currently selected group of object, if any
    */
  def getActiveGroup(): Group = js.native
  /**
    * Returns currently selected object, if any
    */
  def getActiveObject(): Object = js.native
  /**
    * Returns coordinates of a center of canvas. Returned value is an object with top and left properties
    */
  def getCenter(): js.Object = js.native
  /**
    * Returns context of canvas where objects are drawn
    */
  def getContext(): js.Object = js.native
  /**
    * Returns <canvas> element corresponding to this instance
    */
  def getElement(): js.Object = js.native
  /**
    * Returns canvas height (in px)
    */
  def getHeight(): js.Object = js.native
  /**
    * Returns an array of children objects of this instance Type parameter introduced in 1.3.10
    */
  def getObjects(`type`: String = ""): js.Array[String] = js.native
  /**
    * Returns canvas width (in px)
    */
  def getWidth(): js.Object = js.native
  /**
    * Returns canvas zoom level
    */
  def getZoom(): js.Object = js.native
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
    * Populates canvas with data from the specified dataless JSON. JSON format must conform to the one of fabric.Canvas#toDatalessJSON
    */
  def loadFromDatalessJSON(json: String, callback: js.Function, reviver: js.Function = null): Canvas = js.native
  /**
    * Populates canvas with data from the specified JSON. JSON format must conform to the one of fabric.Canvas#toJSON
    */
  def loadFromJSON(json: String, callback: js.Function, reviver: js.Function = null): Canvas = js.native
  /**
    * Moves an object to specified level in stack of drawn objects
    */
  def moveTo(`object`: Object, index: Double): Canvas = js.native
  /**
    * Stops event observing for a particular event handler. Calling this method without arguments removes all handlers for all events
    */
  def off(eventName: String, handler: js.Function): js.Object = js.native
  /**
    * Observes specified event
    */
  def on(eventName: String, handler: js.Function): js.Object = js.native
  /**
    * Callback; invoked right before object is about to be scaled/rotated
    */
  def onBeforeScaleRotate(): js.Object = js.native
  /**
    * Pans viewpoint relatively
    */
  def relativePan(point: Point): Canvas = js.native
  /**
    * Removes objects from a collection, then renders canvas (if `renderOnAddRemove` is not `false`)
    */
  def remove(`object`: Object): js.Object = js.native
  /**
    * Renders both the top canvas and the secondary container canvas.
    */
  def renderAll(allOnTop: Boolean = false): Canvas = js.native
  /**
    * Method to render only the top canvas. Also used to render the group selection box.
    */
  def renderTop(): Canvas = js.native
  /**
    * Moves an object or a selection down in stack of drawn objects
    */
  def sendBackwards(`object`: Object, intersecting: Boolean = false): Canvas = js.native
  /**
    * Moves an object or the objects of a multiple selection to the bottom of the stack of drawn objects
    */
  def sendToBack(`object`: Object): Canvas = js.native
  /**
    * Sets background color for this canvas
    */
  def setBackgroundColor(backgroundColor: String, callback: js.Function): Canvas = js.native
  /**
    * Sets background image for this canvas
    */
  def setBackgroundImage(image: String, callback: js.Function, options: js.Object = new js.Object()): Canvas = js.native
  /**
    * Sets dimensions (width, height) of this canvas instance. when options.cssOnly flag active you should also supply the unit of measure (px/%/em)
    */
  def setDimensions(dimensions: js.Object, options: js.Object = new js.Object()): Canvas = js.native
  /**
    * Sets height of this canvas instance
    */
  def setHeight(value: String, options: js.Object = new js.Object()): Canvas = js.native
  /**
    * Sets background color for this canvas
    */
  def setOverlayColor(overlayColor: String, callback: js.Function): Canvas = js.native
  /**
    * Sets overlay image for this canvas
    */
  def setOverlayImage(image: String, callback: js.Function, options: js.Object = new js.Object()): Canvas = js.native
  /**
    * Sets viewport transform of this canvas instance
    */
  def setViewportTransform(vpt: js.Array[String]): Canvas = js.native
  /**
    * Sets width of this canvas instance
    */
  def setWidth(value: String, options: js.Object = new js.Object()): Canvas = js.native
  /**
    * Sets zoom level of this canvas instance
    */
  def setZoom(value: Double): Canvas = js.native
  /**
    * Returns a size of a collection (i.e: length of an array containing its objects)
    */
  def size(): js.Object = js.native
  /**
    * Straightens object, then rerenders canvas
    */
  def straightenObject(`object`: Object): Canvas = js.native
  /**
    * Returs dataless JSON representation of canvas
    */
  def toDatalessJSON(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Returns dataless object representation of canvas
    */
  def toDatalessObject(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Exports canvas element to a dataurl image. Note that when multiplier is used, cropping is scaled appropriately
    */
  def toDataURL(options: js.Object = new js.Object()): js.Object = js.native
  /**
    * Exports canvas element to a dataurl image (allowing to change image size via multiplier).
    */
  def toDataURLWithMultiplier(format: String, multiplier: Double, quality: Double): js.Object = js.native
  /**
    * Returns JSON representation of canvas
    */
  def toJSON(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Returns object representation of canvas
    */
  def toObject(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Returns SVG representation of canvas
    */
  def toSVG(options: js.Object = new js.Object(), reviver: js.Function = null): js.Object = js.native
  /**
    * Fires event with an optional options object
    */
  def trigger(eventName: String, options: js.Object = new js.Object()): js.Object = js.native
  /**
    * Sets zoom level of this canvas instance, zoom centered around point
    */
  def zoomToPoint(point: Point, value: Double): Canvas = js.native
}

/**
  * Static canvas class
  */
@js.native
@JSName("fabric.StaticCanvas")
object StaticCanvas extends js.Object {
  /**
    * Type:
    */
  var EMPTY_JSON: String = js.native
  /**
    * Provides a way to check support of some of the canvas methods (either those of HTMLCanvasElement itself, or rendering context)
    */
  def supports(methodName: String): js.Object = js.native
}