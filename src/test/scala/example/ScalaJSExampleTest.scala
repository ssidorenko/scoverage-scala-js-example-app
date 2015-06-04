package example

import utest._

import org.scalajs.jquery.jQuery

object ScalaJSExampleTest extends TestSuite {

  import ScalaJSExample._

  def tests = TestSuite {
    'ScalaJSExample {
      assert(square(0) == 0)
      assert(square(4) == 16)
      assert(square(-5) == 25)
      setupUI
      assert(jQuery("p:contains('Hello World')").length == 1)
    }
  }
}
