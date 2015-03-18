(ns learning.core)

;; von Neumann ordinals
(defn ordinal [n]
  (if (zero? n)
    #{}
    (let [decn (dec n)
          previous-ordinal (ordinal decn)]
      (into #{previous-ordinal} previous-ordinal))))

(defn fizzbuzz [n]
  (let [mod3 (mod n 3)
        mod5 (mod n 5)
        mod15 (mod n 15)]
    (cond
      (zero? mod15) "fizzbuzz"
      (zero? mod3) "fizz"
      (zero? mod5) "buzz"
      :else n)))
