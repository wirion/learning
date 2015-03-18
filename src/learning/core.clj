(ns learning.core)

;; von Neumann ordinals
;; can't use recur in place of ordinal because it's not in tail position
;; is there a way to make this function tail-recursive?
(defn ordinal [n]
  (if (zero? n)
    #{}
    (let [decn (dec n)
          previous-ordinal (ordinal decn)]
      (into #{previous-ordinal} previous-ordinal))))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 3)) "fizzbuzz"
    (zero? (mod n 5)) "fizz"
    (zero? (mod n 15)) "buzz"
    :else n))
