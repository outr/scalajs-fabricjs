package com.outr.fabric

import scala.scalajs.js.JSApp
import org.scalajs.dom._

object Test extends JSApp {
  override def main(): Unit = {
    println(s"Hello World!")

    val element = document.getElementById("canvas").asInstanceOf[html.Canvas]
    element.width = window.innerWidth
    element.height = window.innerHeight
    val canvas = new StaticCanvas("canvas")
    val rect = new Rect {
      left = 100.0
      top = 100.0
      fill = "red"
      width = 100
      height = 100
    }
    canvas.add(rect)
  }
}