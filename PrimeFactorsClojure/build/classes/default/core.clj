(comment
Sample clojure source file
)
(ns se.rty.primes
    (:gen-class))

(defn -main
    ([greetee]
  (println (str "Hello " greetee "!")))
  ([] (-main "world")))
