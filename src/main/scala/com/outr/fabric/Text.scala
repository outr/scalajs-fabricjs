package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Text class
  */
@js.native
@JSName("fabric.Text")
class Text(text: String, options: js.Object = new js.Object()) extends Object(options) {
  /**
    * Text Line proportion to font Size (in pixels)
    */
  var _fontSizeMult: Double = js.native
  /**
    * Font family
    */
  var fontFamily: String = js.native
  /**
    * Font size (in pixels)
    */
  var fontSize: Double = js.native
  /**
    * Font style . Possible values: "", "normal", "italic" or "oblique".
    */
  var fontStyle: String = js.native
  /**
    * Font weight (e.g. bold, normal, 400, 600, 800)
    */
  var fontWeight: String = js.native
  /**
    * Line height
    */
  var lineHeight: Double = js.native
  /**
    * Text alignment. Possible values: "left", "center", "right" or "justify".
    */
  var textAlign: String = js.native
  /**
    * Background color of text lines
    */
  var textBackgroundColor: String = js.native
  /**
    * Text decoration Possible values: "", "underline", "overline" or "line-through".
    */
  var textDecoration: String = js.native
  /**
    * Returns the text as an array of lines.
    */
  def _splitTextIntoLines(): js.Array[String] = js.native
  /**
    * Retrieves object's fontFamily
    */
  def getFontFamily(): js.Object = js.native
  /**
    * Retrieves object's fontSize
    */
  def getFontSize(): js.Object = js.native
  /**
    * Retrieves object's fontStyle
    */
  def getFontStyle(): js.Object = js.native
  /**
    * Retrieves object's fontWeight
    */
  def getFontWeight(): js.Object = js.native
  /**
    * Retrieves object's lineHeight
    */
  def getLineHeight(): js.Object = js.native
  /**
    * Retrieves object's text
    */
  def getText(): js.Object = js.native
  /**
    * Retrieves object's textAlign
    */
  def getTextAlign(): js.Object = js.native
  /**
    * Retrieves object's textBackgroundColor
    */
  def getTextBackgroundColor(): js.Object = js.native
  /**
    * Retrieves object's textDecoration
    */
  def getTextDecoration(): js.Object = js.native
  /**
    * Returns true because text has no style
    */
  def isEmptyStyles(): js.Object = js.native
  /**
    * Sets object's fontFamily Does not update the object .width and .height, call ._initDimensions() to update the values.
    */
  def setFontFamily(fontFamily: String): Text = js.native
  /**
    * Sets object's fontSize Does not update the object .width and .height, call ._initDimensions() to update the values.
    */
  def setFontSize(fontSize: Double): Text = js.native
  /**
    * Sets object's fontStyle Does not update the object .width and .height, call ._initDimensions() to update the values.
    */
  def setFontStyle(fontStyle: String): Text = js.native
  /**
    * Sets object's fontWeight Does not update the object .width and .height, call ._initDimensions() to update the values.
    */
  def setFontWeight(fontWeight: String): Text = js.native
  /**
    * Sets object's lineHeight
    */
  def setLineHeight(lineHeight: Double): Text = js.native
  /**
    * Sets object's text Does not update the object .width and .height, call ._initDimensions() to update the values.
    */
  def setText(text: String): Text = js.native
  /**
    * Sets object's textAlign
    */
  def setTextAlign(textAlign: String): Text = js.native
  /**
    * Sets object's textBackgroundColor
    */
  def setTextBackgroundColor(textBackgroundColor: String): Text = js.native
  /**
    * Sets object's textDecoration
    */
  def setTextDecoration(textDecoration: String): Text = js.native
  /**
    * Returns SVG representation of an instance
    */
  def toSVG(reviver: js.Function = null): js.Object = js.native
}

/**
  * Text class
  */
@js.native
@JSName("fabric.Text")
object Text extends js.Object {
  /**
    * List of attribute names to account for when parsing SVG element (used by fabric.Text.fromElement)
    */
  var ATTRIBUTE_NAMES: js.Array[String] = js.native
  /**
    * Default SVG font size
    */
  var DEFAULT_SVG_FONT_SIZE: Double = js.native
  /**
    * Returns fabric.Text instance from an SVG element (not yet implemented)
    */
  def fromElement(element: org.scalajs.dom.raw.SVGElement, options: js.Object = new js.Object()): Text = js.native
  /**
    * Returns fabric.Text instance from an object representation
    */
  def fromObject(`object`: js.Object): Text = js.native
}