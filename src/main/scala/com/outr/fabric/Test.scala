package com.outr.fabric

import scala.scalajs.js.JSApp
import org.scalajs.dom._

import scala.scalajs.js

object Test extends JSApp {
  override def main(): Unit = {
    println(s"Hello World!")

//    val element = document.getElementById("canvas").asInstanceOf[html.Canvas]
    val element = document.createElement("canvas").asInstanceOf[html.Canvas]
    element.id = "canvas"
    document.body.appendChild(element)
//    element.width = window.innerWidth
//    element.height = window.innerHeight
    val canvas = new Canvas("canvas")
    canvas.backgroundColor = "orange"
    val rect = new Text("Hello World") {
      left = 100.0
      top = 100.0
      fill = "red"
//      width = 100
//      height = 100
      on("selected", () => {
        println("Selected!")
      })
    }
    canvas.add(rect)
    canvas.renderAll()

    window.addEventListener("resize", { (evt: Event) =>
      canvas.setWidth(window.innerWidth)
      canvas.setHeight(window.innerHeight)
      canvas.renderAll()
    }, false)
  }
}