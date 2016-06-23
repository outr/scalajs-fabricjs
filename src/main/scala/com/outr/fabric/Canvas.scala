package com.outr.fabric

import org.scalajs.dom.Element

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@js.native
@JSName("fabric.Canvas")
class Canvas(el: String) extends js.Object {
  def add(objects: Rect*): Unit = js.native
}
