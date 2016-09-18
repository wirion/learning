(ns learning.core)

;; von Neumann ordinals
;; can't use recur in place of ordinal because it's not in tail position
;; is there a way to make this function tail-recursive?
(defn ordinal [n]
  (if (zero? n)
    #{}
    (let [decn (dec n)
          deco (ordinal decn)]
      (into #{deco} deco))))

(defn fizzbuzz [n]
  (cond
    (zero? (mod n 15)) "fizzbuzz"
    (zero? (mod n 3)) "fizz"
    (zero? (mod n 5)) "buzz"
    :else n))

(defn- stair [n m]
  (apply str (concat (take (- n m) (repeat " "))
                     (take m (repeat \#)))))

(defn staircase [n]
  (loop [m 1]
    (if (<= m n)
      (do
        (println (stair n m))
        (recur (inc m))))))
