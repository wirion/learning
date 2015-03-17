(ns learning.core-test
  (:require [clojure.test :refer :all]
            [learning.core :refer :all]))

(deftest ordinals-literal-test
  (testing "Second ordinal."
    (is (= (ordinal 2)
           #{#{} #{#{}}}))))

(deftest ordinals-count-test
  (testing "Third ordinal."
    (is (= (count (ordinal 3)) 3))))
