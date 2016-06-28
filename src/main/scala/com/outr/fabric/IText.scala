package com.outr.fabric

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * IText class (introduced in v1.4) Events are also fired with "text:" prefix when observing canvas.
  */
@js.native
@JSName("fabric.IText")
class IText(text: String, options: js.Object = new js.Object()) extends Text(text, options) {
  /**
    * Indicates whether internal text char widths can be cached
    */
  var caching: Boolean = js.native
  /**
    * Color of default cursor (when not overwritten by character style)
    */
  var cursorColor: String = js.native
  /**
    * Delay between cursor blink (in ms)
    */
  var cursorDelay: Double = js.native
  /**
    * Duration of cursor fadein (in ms)
    */
  var cursorDuration: Double = js.native
  /**
    * Width of cursor (in px)
    */
  var cursorWidth: Double = js.native
  /**
    * Indicates whether a text can be edited
    */
  var editable: Boolean = js.native
  /**
    * Border color of text object while it's in editing mode
    */
  var editingBorderColor: String = js.native
  /**
    * Indicates whether text is in editing mode
    */
  var isEditing: Boolean = js.native
  /**
    * Color of text selection
    */
  var selectionColor: String = js.native
  /**
    * Index where text selection ends
    */
  var selectionEnd: Double = js.native
  /**
    * Index where text selection starts (or where cursor is when there is no selection)
    */
  var selectionStart: Double = js.native
  /**
    * Object containing character styles (where top-level properties corresponds to line number and 2nd-level properties -- to char number in a line)
    */
  var styles: js.Object = js.native
  /**
    * Overrides the IText implementation and adjusts character index as there is not always a linebreak
    */
  def _getNewSelectionStartFromOffset(mouseOffset: Double, prevWidth: Double, width: Double, index: Double, jlen: Double): js.Object = js.native
  /**
    * Aborts cursor animation and clears all timeouts
    */
  def abortCursorAnimation(): js.Object = js.native
  /**
    * Copies selected text
    */
  def copy(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Cuts text
    */
  def cut(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Enters editing state
    */
  def enterEditing(): IText = js.native
  /**
    * Exits from editing state
    */
  def exitEditing(): IText = js.native
  /**
    * Find new selection index representing start of current line according to current selection index
    */
  def findLineBoundaryLeft(startFrom: Double): js.Object = js.native
  /**
    * Find new selection index representing end of current line according to current selection index
    */
  def findLineBoundaryRight(startFrom: Double): js.Object = js.native
  /**
    * Find new selection index representing start of current word according to current selection index
    */
  def findWordBoundaryLeft(startFrom: Double): js.Object = js.native
  /**
    * Find new selection index representing end of current word according to current selection index
    */
  def findWordBoundaryRight(startFrom: Double): js.Object = js.native
  /**
    * Forward delete
    */
  def forwardDelete(): js.Object = js.native
  /**
    * Returns 2d representation (lineIndex and charIndex) of cursor (or selection start)
    */
  def get2DCursorLocation(selectionStart: Double = 0.0): js.Object = js.native
  /**
    * Returns color (fill) of char at the current cursor
    */
  def getCurrentCharColor(lineIndex: Double, charIndex: Double): js.Object = js.native
  /**
    * Returns fontSize of char at the current cursor
    */
  def getCurrentCharFontSize(lineIndex: Double, charIndex: Double): js.Object = js.native
  /**
    * Returns complete style of char at the current cursor
    */
  def getCurrentCharStyle(lineIndex: Double, charIndex: Double): js.Object = js.native
  /**
    * Gets start offset of a selection
    */
  def getDownCursorOffset(e: org.scalajs.dom.Event, isRight: Boolean): js.Object = js.native
  /**
    * Returns number of newlines in selected text
    */
  def getNumNewLinesInSelectedText(): js.Object = js.native
  /**
    * Returns selected text
    */
  def getSelectedText(): js.Object = js.native
  /**
    * Returns index of a character corresponding to where an object was clicked
    */
  def getSelectionStartFromPointer(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Gets style of a current selection/cursor (at the start position)
    */
  def getSelectionStyles(startIndex: Double = 0.0, endIndex: Double = 0.0): js.Object = js.native
  /**
    * Parameters:
    */
  def getUpCursorOffset(): js.Object = js.native
  /**
    * Initializes "added" event handler
    */
  def initAddedHandler(): js.Object = js.native
  /**
    * Initializes all the interactive behavior of IText
    */
  def initBehavior(): js.Object = js.native
  /**
    * Initializes double and triple click event handlers
    */
  def initClicks(): js.Object = js.native
  /**
    * Initializes event handlers related to cursor or selection
    */
  def initCursorSelectionHandlers(): js.Object = js.native
  /**
    * Initializes delayed cursor
    */
  def initDelayedCursor(): js.Object = js.native
  /**
    * Initializes "dbclick" event handler
    */
  def initDoubleClickSimulation(): js.Object = js.native
  /**
    * Initializes hidden textarea (needed to bring up keyboard in iOS)
    */
  def initHiddenTextarea(): js.Object = js.native
  /**
    * Initializes "mousedown" event handler
    */
  def initMousedownHandler(): js.Object = js.native
  /**
    * Initializes "mousemove" event handler
    */
  def initMouseMoveHandler(): js.Object = js.native
  /**
    * Initializes "mouseup" event handler
    */
  def initMouseupHandler(): js.Object = js.native
  /**
    * Initializes "selected" event handler
    */
  def initSelectedHandler(): js.Object = js.native
  /**
    * Inserts a character where cursor is
    */
  def insertChar(_char: String, skipUpdate: Boolean, styleObject: js.Object): js.Object = js.native
  /**
    * Inserts characters where cursor is (replacing selection if one exists)
    */
  def insertChars(_chars: String, useCopiedStyle: Boolean): js.Object = js.native
  /**
    * Inserts style object for a given line/char index
    */
  def insertCharStyleObject(lineIndex: Double, charIndex: Double, style: js.Object = new js.Object()): js.Object = js.native
  /**
    * Inserts new line
    */
  def insertNewline(): js.Object = js.native
  /**
    * Inserts new style object
    */
  def insertNewlineStyleObject(lineIndex: Double, charIndex: Double, isEndOfLine: Boolean): js.Object = js.native
  /**
    * Inserts style object(s)
    */
  def insertStyleObjects(_chars: String, isEndOfLine: Boolean, styleObject: js.Object = new js.Object()): js.Object = js.native
  /**
    * Moves cursor down
    */
  def moveCursorDown(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor down without keeping selection
    */
  def moveCursorDownWithoutShift(offset: Double): js.Object = js.native
  /**
    * Moves cursor down while keeping selection
    */
  def moveCursorDownWithShift(offset: Double): js.Object = js.native
  /**
    * Moves cursor left
    */
  def moveCursorLeft(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor left without keeping selection
    */
  def moveCursorLeftWithoutShift(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor left while keeping selection
    */
  def moveCursorLeftWithShift(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor right
    */
  def moveCursorRight(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor right without keeping selection
    */
  def moveCursorRightWithoutShift(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor right while keeping selection
    */
  def moveCursorRightWithShift(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor up
    */
  def moveCursorUp(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Moves cursor up without shift
    */
  def moveCursorUpWithoutShift(offset: Double): js.Object = js.native
  /**
    * Moves cursor up with shift
    */
  def moveCursorUpWithShift(offset: Double): js.Object = js.native
  /**
    * Stops event observing for a particular event handler. Calling this method without arguments removes all handlers for all events
    */
  def off(eventName: String, handler: js.Function): js.Object = js.native
  /**
    * Observes specified event
    */
  def on(eventName: String, handler: js.Function): js.Object = js.native
  /**
    * Composition end
    */
  def onCompositionEnd(): js.Object = js.native
  /**
    * Composition start
    */
  def onCompositionStart(): js.Object = js.native
  /**
    * Composition update
    */
  def onCompositionUpdate(): js.Object = js.native
  /**
    * Handles onInput event
    */
  def onInput(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Handles keyup event
    */
  def onKeyDown(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Handles keyup event We handle KeyUp because ie11 and edge have difficulties copy/pasting if a copy/cut event fired, keyup is dismissed
    */
  def onKeyUp(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Pastes text
    */
  def paste(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Removes characters selected by selection
    */
  def removeChars(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Removes style object
    */
  def removeStyleObject(isBeginningOfLine: Boolean, index: Double = 0.0): js.Object = js.native
  /**
    * Renders cursor
    */
  def renderCursor(boundaries: js.Object, ctx: org.scalajs.dom.CanvasRenderingContext2D): js.Object = js.native
  /**
    * Renders cursor or selection (depending on what exists)
    */
  def renderCursorOrSelection(): js.Object = js.native
  /**
    * Renders text selection
    */
  def renderSelection(chars: js.Array[String], boundaries: js.Object, ctx: org.scalajs.dom.CanvasRenderingContext2D): js.Object = js.native
  /**
    * Finds index corresponding to beginning or end of a word
    */
  def searchWordBoundary(selectionStart: Double, direction: Double): js.Object = js.native
  /**
    * Selects entire text
    */
  def selectAll(): js.Object = js.native
  /**
    * Selects a line based on the index
    */
  def selectLine(selectionStart: Double): js.Object = js.native
  /**
    * Selects a word based on the index
    */
  def selectWord(selectionStart: Double): js.Object = js.native
  /**
    * Changes cursor location in a text depending on passed pointer (x/y) object
    */
  def setCursorByClick(e: org.scalajs.dom.Event): js.Object = js.native
  /**
    * Sets selection end (right boundary of a selection)
    */
  def setSelectionEnd(index: Double): js.Object = js.native
  /**
    * Sets selection start (left boundary of a selection)
    */
  def setSelectionStart(index: Double): js.Object = js.native
  /**
    * Sets style of a current selection
    */
  def setSelectionStyles(styles: js.Object = new js.Object()): IText = js.native
  /**
    * Shifts line styles up or down. This function is slightly different than the one in itext_behaviour as it takes into account the styleMap.
    */
  def shiftLineStyles(lineIndex: Double, offset: Double): js.Object = js.native
  /**
    * private
    */
  def swapSelectionPoints(): js.Object = js.native
  /**
    * Fires event with an optional options object
    */
  def trigger(eventName: String, options: js.Object = new js.Object()): js.Object = js.native
}

/**
  * IText class (introduced in v1.4) Events are also fired with "text:" prefix when observing canvas.
  */
@js.native
@JSName("fabric.IText")
object IText extends js.Object {
  /**
    * Returns fabric.IText instance from an object representation
    */
  def fromObject(`object`: js.Object): IText = js.native
}