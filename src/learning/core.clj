(ns learning.core)

;; von Neumann ordinals
(defn ordinal [n]
  (if (zero? n)
    #{}
    (let [decn (dec n)
          previous-ordinal (ordinal decn)]
      (into #{previous-ordinal} previous-ordinal))))

(defn fizzbuzz [n]
  n)
