package example

import org.specs2.mutable.SpecWithJUnit
import org.specs2.specification.Scope

class ExampleTest extends SpecWithJUnit {

  "Example" should {
    "report the line number of the exception" in new InnerScope {
      println("Starting the test")
      if(true) throw new RuntimeException("Which line did this exception occur at?")
      true must beTrue
    }
  }

  abstract class InnerScope extends Scope {}
}
