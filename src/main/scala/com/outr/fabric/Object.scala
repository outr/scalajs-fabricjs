package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Root object class from which all 2d shape classes inherit from
  */
@js.native
@JSName("fabric.Object")
class Object(options: js.Object = new js.Object()) extends js.Object {
  /**
    * Defines the number of fraction digits to use when serializing object values. You can use it to increase/decrease precision of such values like left, top, scaleX, scaleY, etc.
    */
  var NUM_FRACTION_DIGITS: Double = js.native
  /**
    * Angle of rotation of an object (in degrees)
    */
  var angle: Double = js.native
  /**
    * Background color of an object. Only works with text objects at the moment.
    */
  var backgroundColor: String = js.native
  /**
    * Color of controlling borders of an object (when it's active)
    */
  var borderColor: String = js.native
  /**
    * Array specifying dash pattern of an object's borders (hasBorder must be true)
    */
  var borderDashArray: js.Array[String] = js.native
  /**
    * Opacity of object's controlling borders when object is active and moving
    */
  var borderOpacityWhenMoving: Double = js.native
  /**
    * Scale factor of object's controlling borders
    */
  var borderScaleFactor: Double = js.native
  /**
    * When true, this object will use center point as the origin of transformation when being rotated via the controls. Backwards incompatibility note: This property replaces "centerTransform" (Boolean).
    */
  var centeredRotation: Boolean = js.native
  /**
    * When true, this object will use center point as the origin of transformation when being scaled via the controls. Backwards incompatibility note: This property replaces "centerTransform" (Boolean).
    */
  var centeredScaling: Boolean = js.native
  /**
    * Function that determines clipping of an object (context is passed as a first argument) Note that context origin is at the object's center point (not left/top corner)
    */
  var clipTo: js.Function = js.native
  /**
    * Color of controlling corners of an object (when it's active)
    */
  var cornerColor: String = js.native
  /**
    * Array specifying dash pattern of an object's control (hasBorder must be true)
    */
  var cornerDashArray: js.Array[String] = js.native
  /**
    * Size of object's controlling corners (in pixels)
    */
  var cornerSize: Double = js.native
  /**
    * Color of controlling corners of an object (when it's active and transparentCorners false)
    */
  var cornerStrokeColor: String = js.native
  /**
    * Specify style of control, 'rect' or 'circle'
    */
  var cornerStyle: String = js.native
  /**
    * When set to `false`, an object can not be a target of events. All events propagate through it. Introduced in v1.3.4
    */
  var evented: Boolean = js.native
  /**
    * Color of object's fill
    */
  var fill: String = js.native
  /**
    * Fill rule used to fill an object accepted values are nonzero, evenodd Backwards incompatibility note: This property was used for setting globalCompositeOperation until v1.4.12 (use `fabric.Object#globalCompositeOperation` instead)
    */
  var fillRule: String = js.native
  /**
    * When true, an object is rendered as flipped horizontally
    */
  var flipX: Boolean = js.native
  /**
    * When true, an object is rendered as flipped vertically
    */
  var flipY: Boolean = js.native
  /**
    * Composite rule used for canvas globalCompositeOperation
    */
  var globalCompositeOperation: String = js.native
  /**
    * When set to `false`, object's controlling borders are not rendered
    */
  var hasBorders: Boolean = js.native
  /**
    * When set to `false`, object's controls are not displayed and can not be used to manipulate object
    */
  var hasControls: Boolean = js.native
  /**
    * When set to `false`, object's controlling rotating point will not be visible or selectable
    */
  var hasRotatingPoint: Boolean = js.native
  /**
    * Object height
    */
  var height: Double = js.native
  /**
    * Default cursor value used when hovering over this object on canvas
    */
  var hoverCursor: String = js.native
  /**
    * When `false`, default object's values are not included in its serialization
    */
  var includeDefaultValues: Boolean = js.native
  /**
    * Left position of an object. Note that by default it's relative to object left. You can change this by setting originX={left/center/right}
    */
  var left: Double = js.native
  /**
    * When `true`, object horizontal movement is locked
    */
  var lockMovementX: Boolean = js.native
  /**
    * When `true`, object vertical movement is locked
    */
  var lockMovementY: Boolean = js.native
  /**
    * When `true`, object rotation is locked
    */
  var lockRotation: Boolean = js.native
  /**
    * When `true`, object cannot be flipped by scaling into negative values
    */
  var lockScalingFlip: Boolean = js.native
  /**
    * When `true`, object horizontal scaling is locked
    */
  var lockScalingX: Boolean = js.native
  /**
    * When `true`, object vertical scaling is locked
    */
  var lockScalingY: Boolean = js.native
  /**
    * When `true`, object horizontal skewing is locked
    */
  var lockSkewingX: Boolean = js.native
  /**
    * When `true`, object vertical skewing is locked
    */
  var lockSkewingY: Boolean = js.native
  /**
    * When `true`, object non-uniform scaling is locked
    */
  var lockUniScaling: Boolean = js.native
  /**
    * Minimum allowed scale value of an object
    */
  var minScaleLimit: Double = js.native
  /**
    * Default cursor value used when moving this object on canvas
    */
  var moveCursor: String = js.native
  /**
    * Object containing coordinates of object's controls
    */
  var oCoords: js.Object = js.native
  /**
    * Opacity of an object
    */
  var opacity: Double = js.native
  /**
    * Horizontal origin of transformation of an object (one of "left", "right", "center") See http://jsfiddle.net/1ow02gea/40/ on how originX/originY affect objects in groups
    */
  var originX: String = js.native
  /**
    * Vertical origin of transformation of an object (one of "top", "bottom", "center") See http://jsfiddle.net/1ow02gea/40/ on how originX/originY affect objects in groups
    */
  var originY: String = js.native
  /**
    * Padding between object and its controlling borders (in pixels)
    */
  var padding: Double = js.native
  /**
    * When set to `true`, objects are "found" on canvas on per-pixel basis rather than according to bounding box
    */
  var perPixelTargetFind: Boolean = js.native
  /**
    * Offset for object's controlling rotating point (when enabled via `hasRotatingPoint`)
    */
  var rotatingPointOffset: Double = js.native
  /**
    * Object scale factor (horizontal)
    */
  var scaleX: Double = js.native
  /**
    * Object scale factor (vertical)
    */
  var scaleY: Double = js.native
  /**
    * When set to `false`, an object can not be selected for modification (using either point-click-based or group-based selection). But events still fire on it.
    */
  var selectable: Boolean = js.native
  /**
    * Selection Background color of an object. colored layer behind the object when it is active. does not mix good with globalCompositeOperation methods.
    */
  var selectionBackgroundColor: String = js.native
  /**
    * Shadow object representing shadow of this shape
    */
  var shadow: Shadow = js.native
  /**
    * Angle of skew on x axes of an object (in degrees)
    */
  var skewX: Double = js.native
  /**
    * Angle of skew on y axes of an object (in degrees)
    */
  var skewY: Double = js.native
  /**
    * List of properties to consider when checking if state of an object is changed (fabric.Object#hasStateChanged) as well as for history (undo/redo) purposes
    */
  var stateProperties: js.Array[String] = js.native
  /**
    * When defined, an object is rendered via stroke and this property specifies its color
    */
  var stroke: String = js.native
  /**
    * Array specifying dash pattern of an object's stroke (stroke must be defined)
    */
  var strokeDashArray: js.Array[String] = js.native
  /**
    * Line endings style of an object's stroke (one of "butt", "round", "square")
    */
  var strokeLineCap: String = js.native
  /**
    * Corner style of an object's stroke (one of "bevil", "round", "miter")
    */
  var strokeLineJoin: String = js.native
  /**
    * Maximum miter length (used for strokeLineJoin = "miter") of an object's stroke
    */
  var strokeMiterLimit: Double = js.native
  /**
    * Width of a stroke used to render this object
    */
  var strokeWidth: Double = js.native
  /**
    * Top position of an object. Note that by default it's relative to object top. You can change this by setting originY={top/center/bottom}
    */
  var top: Double = js.native
  /**
    * Transform matrix (similar to SVG's transform matrix)
    */
  var transformMatrix: js.Array[String] = js.native
  /**
    * When true, object's controlling corners are rendered as transparent inside (i.e. stroke instead of fill)
    */
  var transparentCorners: Boolean = js.native
  /**
    * When set to `false`, an object is not rendered on canvas
    */
  var visible: Boolean = js.native
  /**
    * Object width
    */
  var width: Double = js.native
  /**
    * Renders controls and borders for the object
    */
  def _renderControls(ctx: org.scalajs.dom.CanvasRenderingContext2D, noTransform: Boolean = false): js.Object = js.native
  /**
    * Sets canvas globalCompositeOperation for specific object custom composition operation for the particular object can be specifed using globalCompositeOperation property
    */
  def _setupCompositeOperation(ctx: org.scalajs.dom.CanvasRenderingContext2D): js.Object = js.native
  /**
    * Parameters:
    */
  def adjustPosition(): js.Object = js.native
  /**
    * Animates object's properties
    */
  def animate(property: String, value: Double): Object = js.native
  /**
    * Moves an object up in stack of drawn objects
    */
  def bringForward(intersecting: Boolean = false): Object = js.native
  /**
    * Moves an object to the top of the stack of drawn objects
    */
  def bringToFront(): Object = js.native
  /**
    * Centers object vertically and horizontally on canvas to which is was added last You might need to call `setCoords` on an object after centering, to update controls area.
    */
  def center(): Object = js.native
  /**
    * Centers object horizontally on canvas to which it was added last. You might need to call `setCoords` on an object after centering, to update controls area.
    */
  def centerH(): Object = js.native
  /**
    * Centers object vertically on canvas to which it was added last. You might need to call `setCoords` on an object after centering, to update controls area.
    */
  def centerV(): Object = js.native
  /**
    * Clones an instance
    */
  def clone(callback: js.Function, propertiesToInclude: js.Array[String] = new js.Array[String]()): Object = js.native
  /**
    * Creates an instance of fabric.Image out of an object
    */
  def cloneAsImage(callback: js.Function): Object = js.native
  /**
    * Returns complexity of an instance
    */
  def complexity(): Double = js.native
  /**
    * Checks if point is inside the object
    */
  def containsPoint(point: Point): Boolean = js.native
  /**
    * Draws borders of an object's bounding box. Requires public properties: width, height Requires public options: padding, borderColor
    */
  def drawBorders(ctx: org.scalajs.dom.CanvasRenderingContext2D): Object = js.native
  /**
    * Draws borders of an object's bounding box when it is inside a group. Requires public properties: width, height Requires public options: padding, borderColor
    */
  def drawBordersInGroup(ctx: org.scalajs.dom.CanvasRenderingContext2D, options: js.Object): Object = js.native
  /**
    * Draws corners of an object's bounding box. Requires public properties: width, height Requires public options: cornerSize, padding
    */
  def drawControls(ctx: org.scalajs.dom.CanvasRenderingContext2D): Object = js.native
  /**
    * Draws a colored layer behind the object, inside its selection borders. Requires public options: padding, selectionBackgroundColor this function is called when the context is transformed
    */
  def drawSelectionBackground(ctx: org.scalajs.dom.CanvasRenderingContext2D): Object = js.native
  /**
    * Same as fabric.Object.prototype.straighten but with animation
    */
  def fxStraighten(callbacks: js.Object): Object = js.native
  /**
    * Basic getter
    */
  def get(property: String): Any = js.native
  /**
    * Retrieves object's angle (in degrees)
    */
  def getAngle(): Double = js.native
  /**
    * Returns coordinates of object's bounding rectangle (left, top, width, height)
    */
  def getBoundingRect(): js.Object = js.native
  /**
    * Returns height of an object's bounding rectangle
    */
  def getBoundingRectHeight(): Double = js.native
  /**
    * Returns width of an object's bounding rectangle
    */
  def getBoundingRectWidth(): Double = js.native
  /**
    * Returns the real center coordinates of the object
    */
  def getCenterPoint(): Point = js.native
  /**
    * Retrieves object's clipping function
    */
  def getClipTo(): js.Function = js.native
  /**
    * Retrieves object's fill
    */
  def getFill(): String = js.native
  /**
    * Retrieves object's flipX value
    */
  def getFlipX(): Boolean = js.native
  /**
    * Retrieves object's flipY value
    */
  def getFlipY(): Boolean = js.native
  /**
    * Returns height of an object
    */
  def getHeight(): Double = js.native
  /**
    * Retrieves object's left position
    */
  def getLeft(): Double = js.native
  /**
    * Returns coordinates of a pointer relative to an object
    */
  def getLocalPointer(e: org.scalajs.dom.Event, pointer: js.Object = new js.Object()): js.Object = js.native
  /**
    * Retrieves object's opacity
    */
  def getOpacity(): Double = js.native
  /**
    * Retrieves object's originX
    */
  def getOriginX(): String = js.native
  /**
    * Retrieves object's originY
    */
  def getOriginY(): String = js.native
  /**
    * Returns the coordinates of the object as if it has a different origin
    */
  def getPointByOrigin(originX: String, originY: String): Point = js.native
  /**
    * Retrieves object's scaleX value
    */
  def getScaleX(): Double = js.native
  /**
    * Retrieves object's scaleY value
    */
  def getScaleY(): Double = js.native
  /**
    * Retrieves object's shadow
    */
  def getShadow(): js.Object = js.native
  /**
    * Retrieves object's stroke
    */
  def getStroke(): String = js.native
  /**
    * Retrieves object's strokeWidth
    */
  def getStrokeWidth(): Double = js.native
  /**
    * Returns filter for svg shadow
    */
  def getSvgFilter(): String = js.native
  /**
    * Returns styles-string for svg-export
    */
  def getSvgStyles(skipShadow: Boolean): String = js.native
  /**
    * Returns transform-string for svg-export
    */
  def getSvgTransform(): String = js.native
  /**
    * Returns transform-string for svg-export from the transform matrix of single elements
    */
  def getSvgTransformMatrix(): String = js.native
  /**
    * Retrieves object's top position
    */
  def getTop(): Double = js.native
  /**
    * Retrieves object's transformMatrix
    */
  def getTransformMatrix(): js.Array[String] = js.native
  /**
    * Retrieves viewportTransform from Object's canvas if possible
    */
  def getViewportTransform(): Boolean = js.native
  /**
    * Retrieves object's visible state
    */
  def getVisible(): Boolean = js.native
  /**
    * Returns width of an object
    */
  def getWidth(): Double = js.native
  /**
    * Returns true if object state (one of its state properties) was changed
    */
  def hasStateChanged(): Boolean = js.native
  /**
    * Checks if object intersects with another object
    */
  def intersectsWithObject(other: js.Object): Boolean = js.native
  /**
    * Checks if object intersects with an area formed by 2 points
    */
  def intersectsWithRect(pointTL: js.Object, pointBR: js.Object): Boolean = js.native
  /**
    * Checks if object is fully contained within area of another object
    */
  def isContainedWithinObject(other: js.Object): Boolean = js.native
  /**
    * Checks if object is fully contained within area formed by 2 points
    */
  def isContainedWithinRect(pointTL: js.Object, pointBR: js.Object): Boolean = js.native
  /**
    * Returns true if the specified control is visible, false otherwise.
    */
  def isControlVisible(controlName: String): Boolean = js.native
  /**
    * Returns true if specified type is identical to the type of an instance
    */
  def isType(`type`: String): Boolean = js.native
  /**
    * Moves an object to specified level in stack of drawn objects
    */
  def moveTo(index: Double): Object = js.native
  /**
    * Removes object from canvas to which it was added last
    */
  def remove(): Object = js.native
  /**
    * Renders an object on a specified context
    */
  def render(ctx: org.scalajs.dom.CanvasRenderingContext2D, noTransform: Boolean = false): js.Object = js.native
  /**
    * Saves state of an object
    */
  def saveState(options: js.Object = new js.Object()): Object = js.native
  /**
    * Scales an object (equally by x and y)
    */
  def scale(value: Double): Object = js.native
  /**
    * Scales an object to a given height, with respect to bounding box (scaling by x/y equally)
    */
  def scaleToHeight(value: Double): Object = js.native
  /**
    * Scales an object to a given width, with respect to bounding box (scaling by x/y equally)
    */
  def scaleToWidth(value: Double): Object = js.native
  /**
    * Moves an object down in stack of drawn objects
    */
  def sendBackwards(intersecting: Boolean = false): Object = js.native
  /**
    * Moves an object to the bottom of the stack of drawn objects
    */
  def sendToBack(): Object = js.native
  /**
    * Sets property to a given value. When changing position/dimension -related properties (left, top, scale, angle, etc.) `set` does not update position of object's borders/controls. If you need to update those, call `setCoords()`.
    */
  def set(key: String, value: js.Function): Object = js.native
  /**
    * Sets "angle" of an instance
    */
  def setAngle(angle: Double): Object = js.native
  /**
    * Sets object's clipping function
    */
  def setClipTo(clipTo: js.Function): Object = js.native
  /**
    * Sets "color" of an instance (alias of `set('fill', …)`)
    */
  def setColor(color: String): Object = js.native
  /**
    * Sets the visibility state of object controls.
    */
  def setControlsVisibility(options: js.Object = new js.Object()): Object = js.native
  /**
    * Sets the visibility of the specified control.
    */
  def setControlVisible(controlName: String, visible: Boolean): Object = js.native
  /**
    * Sets corner position coordinates based on current angle, width and height See https://github.com/kangax/fabric.js/wiki/When-to-call-setCoords
    */
  def setCoords(): Object = js.native
  /**
    * Sets object's fill
    */
  def setFill(value: String): Object = js.native
  /**
    * Sets object's flipX value
    */
  def setFlipX(value: Boolean): Object = js.native
  /**
    * Sets object's flipY value
    */
  def setFlipY(value: Boolean): Object = js.native
  /**
    * Sets gradient (fill or stroke) of an object Backwards incompatibility note: This method was named "setGradientFill" until v1.1.0
    */
  def setGradient(property: String, options: js.Object = new js.Object()): Object = js.native
  /**
    * Sets object's left position
    */
  def setLeft(value: Double): Object = js.native
  /**
    * This callback function is called by the parent group of an object every time a non-delegated property changes on the group. It is passed the key and value as parameters. Not adding in this function's signature to avoid Travis build error about unused variables.
    */
  def setOnGroup(): js.Object = js.native
  /**
    * Sets object's opacity
    */
  def setOpacity(value: Double): Object = js.native
  /**
    * Sets object's properties from options
    */
  def setOptions(options: js.Object = new js.Object()): js.Object = js.native
  /**
    * Sets object's originX
    */
  def setOriginX(value: String): Object = js.native
  /**
    * Sets object's originY
    */
  def setOriginY(value: String): Object = js.native
  /**
    * Sets pattern fill of an object
    */
  def setPatternFill(options: js.Object): Object = js.native
  /**
    * Sets the position of the object taking into consideration the object's origin
    */
  def setPositionByOrigin(pos: Point, originX: String, originY: String): Unit = js.native
  /**
    * Sets object's scaleX value
    */
  def setScaleX(value: Double): Object = js.native
  /**
    * Sets object's scaleY value
    */
  def setScaleY(value: Double): Object = js.native
  /**
    * Sets shadow of an object
    */
  def setShadow(options: String = ""): Object = js.native
  /**
    * Sets sourcePath of an object
    */
  def setSourcePath(value: String): Object = js.native
  /**
    * Sets object's stroke
    */
  def setStroke(value: String): Object = js.native
  /**
    * Sets object's strokeWidth
    */
  def setStrokeWidth(value: Double): Object = js.native
  /**
    * Sets object's top position
    */
  def setTop(value: Double): Object = js.native
  /**
    * Sets object's transformMatrix
    */
  def setTransformMatrix(transformMatrix: js.Array[String]): Object = js.native
  /**
    * Setups state of an object
    */
  def setupState(): Object = js.native
  /**
    * Sets object's visible state
    */
  def setVisible(value: Boolean): Object = js.native
  /**
    * Straightens an object (rotating it from current angle to one of 0, 90, 180, 270, etc. depending on which is closer)
    */
  def straighten(): Object = js.native
  /**
    * Returns (dataless) object representation of an instance
    */
  def toDatalessObject(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Converts an object into a data-url-like string
    */
  def toDataURL(options: js.Object): String = js.native
  /**
    * Toggles specified property from `true` to `false` or from `false` to `true`
    */
  def toggle(property: String): Object = js.native
  /**
    * Returns a JSON representation of an instance
    */
  def toJSON(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Returns the point in local coordinates
    */
  def toLocalPoint(point: Point, originX: String, originY: String): Point = js.native
  /**
    * Returns an object representation of an instance
    */
  def toObject(propertiesToInclude: js.Array[String] = new js.Array[String]()): js.Object = js.native
  /**
    * Transforms context when rendering an object
    */
  def transform(ctx: org.scalajs.dom.CanvasRenderingContext2D, fromLeft: Boolean): js.Object = js.native
  /**
    * Translates the coordinates from origin to center coordinates (based on the object's dimensions)
    */
  def translateToCenterPoint(point: Point, originX: String, originY: String): Point = js.native
  /**
    * Translates the coordinates from origin to center coordinates (based on the object's dimensions)
    */
  def translateToGivenOrigin(point: Point, fromOriginX: String, fromOriginY: String, toOriginX: String, toOriginY: String): Point = js.native
  /**
    * Translates the coordinates from center to origin coordinates (based on the object's dimensions)
    */
  def translateToOriginPoint(center: Point, originX: String, originY: String): Point = js.native
}

/**
  * Root object class from which all 2d shape classes inherit from
  */
@js.native
@JSName("fabric.Object")
object Object extends js.Object {
  /**
    * Unique id used internally when creating SVG elements
    */
  var __uid: Double = js.native
}