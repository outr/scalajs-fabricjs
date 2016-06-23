package com.outr.fabric

import scala.scalajs.js.JSApp
import org.scalajs.dom._

object Test extends JSApp {
  override def main(): Unit = {
    println(s"Hello World!")

    val canvas = new Canvas("canvas")
    val rect = new Rect {
      left = 100.0
      top = 100.0
      fill = "red"
      width = 20
      height = 20
    }
    canvas.add(rect)
  }
}