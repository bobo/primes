package se.rty.primes.primefactors

import org.specs._
import org.specs.runner.{ConsoleRunner, JUnit4}
import util.DataTables
import scala.Math
//class MySpecTest extends JUnit4(MySpec)
//class MySpecSuite extends ScalaTestSuite(MySpec)
//object MySpecRunner extends ConsoleRunner(MySpec)

class helloWorld extends Specification with DataTables {
  val primes = new Primes()

  "primes should factor " in {
    "prime" | "factors" |>
            1 ! List() |
            2 ! List(2) |
            3 ! List(3) |
            4 ! List(2, 2) |
            5 ! List(5) |
            6 ! List(2, 3) |
            7 ! List(7) |
            8 ! List(2, 2, 2) |
            9 ! List(3, 3) |
            10 ! List(2, 5) |
            2*2*2*2*2*2*2*2*2*2*2 ! List(2, 2, 2, 2, 2, 2, 2, 2, 2, 2,2) |
            677329 ! List(823, 823) |
            100000 ! List(2, 2, 2, 2, 2, 5, 5, 5, 5, 5) |
            {(prime: Int, factors: List[Int]) => {primes.calculate(prime) must_== factors}}
  }

}
