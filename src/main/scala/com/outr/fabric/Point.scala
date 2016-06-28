package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Point class
  */
@js.native
@JSName("fabric.Point")
class Point(x: Double, y: Double) extends js.Object {
  /**
    * Adds another point to this one and returns another one
    */
  def add(that: Point): Point = js.native
  /**
    * Adds another point to this one
    */
  def addEquals(that: Point): Point = js.native
  /**
    * Returns distance from this point and another one
    */
  def distanceFrom(that: Point): js.Object = js.native
  /**
    * Divides this point by a value and returns a new one
    */
  def divide(scalar: Double): Point = js.native
  /**
    * Divides this point by a value
    */
  def divideEquals(scalar: Double): Point = js.native
  /**
    * Returns true if this point is equal to another one
    */
  def eq(that: Point): js.Object = js.native
  /**
    * Returns true if this point is greater another one
    */
  def gt(that: Point): js.Object = js.native
  /**
    * Returns true if this point is greater than or equal to another one
    */
  def gte(that: Point): js.Object = js.native
  /**
    * Returns new point which is the result of linear interpolation with this one and another one
    */
  def lerp(that: Point, t: Double): Point = js.native
  /**
    * Returns true if this point is less than another one
    */
  def lt(that: Point): js.Object = js.native
  /**
    * Returns true if this point is less than or equal to another one
    */
  def lte(that: Point): js.Object = js.native
  /**
    * Returns a new point which is the max of this and another one
    */
  def max(that: Point): Point = js.native
  /**
    * Returns the point between this point and another one
    */
  def midPointFrom(that: Point): Point = js.native
  /**
    * Returns a new point which is the min of this and another one
    */
  def min(that: Point): Point = js.native
  /**
    * Miltiplies this point by a value and returns a new one
    */
  def multiply(scalar: Double): Point = js.native
  /**
    * Miltiplies this point by a value
    */
  def multiplyEquals(scalar: Double): Point = js.native
  /**
    * Adds value to this point and returns a new one
    */
  def scalarAdd(scalar: Double): Point = js.native
  /**
    * Adds value to this point
    */
  def scalarAddEquals(scalar: Double): Point = js.native
  /**
    * Subtracts value from this point and returns a new one
    */
  def scalarSubtract(scalar: Double): Point = js.native
  /**
    * Subtracts value from this point
    */
  def scalarSubtractEquals(scalar: Double): Point = js.native
  /**
    * Sets x/y of this point from another point
    */
  def setFromPoint(that: Point): js.Object = js.native
  /**
    * Sets x/y of this point
    */
  def setXY(x: Double, y: Double): js.Object = js.native
  /**
    * Subtracts another point from this point and returns a new one
    */
  def subtract(that: Point): Point = js.native
  /**
    * Subtracts another point from this point
    */
  def subtractEquals(that: Point): Point = js.native
  /**
    * Swaps x/y of this point and another point
    */
  def swap(that: Point): js.Object = js.native
}