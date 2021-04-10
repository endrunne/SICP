#lang clojure

;; using only global escopes based on previous examples.

;; square function
(def square (fn [x] (* x x)))

;; sum of squares
(def sum-of-squares (fn [x, y] (+ (square x) (square y))))

(def calculate (fn [x, y, z]
                 (cond (and (< x y) (< x z))(sum-of-squares y z)
                       (< y z)(sum-of-squares x z)
                       :else (sum-of-squares x y))))
