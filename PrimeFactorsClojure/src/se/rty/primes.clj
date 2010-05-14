(ns se.rty.primes
  (:gen-class))

(defn find-primes [num divisor primes]
  (if (> num 1)
    (if (= (mod num divisor) 0)
      (recur (/ num divisor) divisor (concat primes (list divisor)))
      (if (> num 0)
        (recur num (+ 1 divisor) primes)
      (list num )))
  primes))

(defn primes [num]
  (nils num 2 (list)))

