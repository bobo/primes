
(ns se.rty.primes)
(use 'clojure.test)

(deftest primes-test
  (are [number factors]
    (= (primes number) factors)
    1 (list),
    2 (list 2),
    3 (list 3),
    4 (list 2 2),
    5 (list 5),
    6 (list 2 3),
    7 (list 7),
    8 (list 2 2 2),
    9 (list 3 3),
    10 (list 2 5),
    11 (list 11),
    12 (list 2 2 3),
    13 (list 13),
    12345 (list 3 5 823),
    10000 (list 2 2 2 2 5 5 5 5),
    100000 (list 2 2 2 2 2 5 5 5 5 5),
    677329 (list 823 823)))

(run-tests)