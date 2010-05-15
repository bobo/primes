/**
 * Created by IntelliJ IDEA.
 * User: bobo
 * Date: May 15, 2010
 * Time: 8:45:16 PM
 * To change this template use File | Settings | File Templates.
 */
class Primes {
  def calculate(number) {
    def primes = []
    def divisor = 2;
    while (number > 1) {
      if (number.asType(Integer.class) % divisor == 0) {
        number = number / divisor
        primes << divisor
      } else {
        divisor++
      }
    }

    return primes
  }
}
