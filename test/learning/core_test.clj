(ns learning.core-test
  (:require [clojure.test :refer :all]
            [learning.core :refer :all]))

(deftest ordinals-literal-test
  (testing "Testing the second ordinal against the expected literal"
    (is (= (ordinal 2)
           #{#{} #{#{}}})))
  (testing "Counting the third ordinal"
    (is (= (count (ordinal 3)) 3))))

(deftest fizz-buzz
  (testing "Unchanged numbers"
    (is (= (2 (fizzbuzz 2))))
    (is (= (7 (fizzbuzz 7)))))
  (testing "6 is fizz"
    (is (= (fizzbuzz 6) "fizz")))
  (testing "10 is buzz"
    (is (= (fizzbuzz 10) "buzz")))
  (testing "30 is fizzbuzz"
    (is (= (fizzbuzz 30) "fizzbuzz"))))
