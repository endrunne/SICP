(defn p [] p)

(defn test [x y]
  (if (= x 0) 0 y))

; Applicative-order return an infinite recursion
; In applicative-order the '(p)' procedure run first

; normal order return '0' because the conditional (if (= x 0) 0 y)
