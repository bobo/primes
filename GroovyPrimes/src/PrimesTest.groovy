
/**
 * Created by IntelliJ IDEA.
 * User: bobo
 * Date: May 15, 2010
 * Time: 8:47:26 PM
 * To change this template use File | Settings | File Templates.
 */
import groovy.util.GroovyTestCase
import spock.lang.Specification

class PrimesTest extends Specification {
  private primes;
    def "testPrimes"() {
        primes = new Primes();
      expect:
      primes.calculate(number) == result

      where:
      number    | result
      1         | []
      2         | [2]
      3         | [3]
      4         | [2]*2
      5         | [5]
      6         | [2,3]
      7         | [7]
      8         | [2]*3
      9         | [3,3]
      10        | [2,5]
      677329    | [823, 823]
      2**10     | [2]*10
      2**13-1   | [2**13-1]	




    }
}

