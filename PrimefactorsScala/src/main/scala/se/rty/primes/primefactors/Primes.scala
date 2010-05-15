package se.rty.primes.primefactors

import scala.collection.mutable._

/**
 * Created by IntelliJ IDEA.
 * User: bobo
 * Date: May 15, 2010
 * Time: 8:12:14 AM
 * To change this template use File | Settings | File Templates.
 */

class Primes {
  def calculate(number: Int) = {
    var primes = new ArrayBuffer[Int]()
    var current = number
    var divisor = 2;
    while (current > 1) {
      if (current % divisor == 0) {
        primes += divisor
        current = current / divisor
      }else{
        divisor=divisor+1;              
      }
    }
    primes.toList

  }
}