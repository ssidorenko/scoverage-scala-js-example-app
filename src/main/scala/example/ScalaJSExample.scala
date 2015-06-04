package example

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.jquery.jQuery


object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    //jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("body").append("<p>Hello World</p>")
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x
}
