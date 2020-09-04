package samples

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FunSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class ExampleTest extends FunSpec with Matchers {

	describe("An emptiness check") {

		it("should check option for emptiness") {
			val foo: Option[String] = None
			foo shouldBe empty

			val bar: Option[String] = Some("bar")
			bar should not be empty
		}

		it("should check list for emptiness") {
			val foo: List[String] = List.empty[String]
			foo shouldBe empty

			val bar: List[String] = List("bar")
			bar should not be empty
		}

		it("should check map for emptiness") {
			val foo: Map[String, String] = Map.empty[String, String]
			foo shouldBe empty

			val bar: Map[String, String] = Map("bar" -> "baz")
			bar should not be empty
		}

	}
}
