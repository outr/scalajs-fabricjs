package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Color class The purpose of fabric.Color is to abstract and encapsulate common color operations; fabric.Color is a constructor and creates instances of fabric.Color objects.
  */
@js.native
@JSName("fabric.Color")
class Color(color: String) extends js.Object {
}

/**
  * Color class The purpose of fabric.Color is to abstract and encapsulate common color operations; fabric.Color is a constructor and creates instances of fabric.Color objects.
  */
@js.native
@JSName("fabric.Color")
object Color extends js.Object {
  /**
    * Map of the 17 basic color names with HEX code
    */
  var colorNameMap: js.Object = js.native
  /**
    * Regex matching color in HEX format (ex: #FF5555, 010155, aff)
    */
  var reHex: js.Function = js.native
  /**
    * Regex matching color in HSL or HSLA formats (ex: hsl(200, 80%, 10%), hsla(300, 50%, 80%, 0.5), hsla( 300 , 50% , 80% , 0.5 ))
    */
  var reHSLa: js.Function = js.native
  /**
    * Regex matching color in RGB or RGBA formats (ex: rgb(0, 0, 0), rgba(255, 100, 10, 0.5), rgba( 255 , 100 , 10 , 0.5 ), rgb(1,1,1), rgba(100%, 60%, 10%, 0.5))
    */
  var reRGBa: js.Function = js.native
  /**
    * Returns new color object, when given a color in HEX format
    */
  def fromHex(color: String): Color = js.native
  /**
    * Returns new color object, when given a color in HSL format
    */
  def fromHsl(color: String): Color = js.native
  /**
    * Returns new color object, when given a color in HSLA format
    */
  def fromHsla(color: String): Color = js.native
  /**
    * Returns new color object, when given a color in RGB format
    */
  def fromRgb(color: String): Color = js.native
  /**
    * Returns new color object, when given a color in RGBA format
    */
  def fromRgba(color: String): Color = js.native
  /**
    * Returns new color object, when given color in array representation (ex: [200, 100, 100, 0.5])
    */
  def fromSource(source: js.Array[String]): Color = js.native
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HEX format
    */
  def sourceFromHex(color: String): js.Array[String] = js.native
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in HSL or HSLA format. Adapted from https://github.com/mjijackson
    */
  def sourceFromHsl(color: String): js.Array[String] = js.native
  /**
    * Returns array represenatation (ex: [100, 100, 200, 1]) of a color that's in RGB or RGBA format
    */
  def sourceFromRgb(color: String): js.Array[String] = js.native
}