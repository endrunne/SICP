(def a-plus-abs-b 
  (fn [a b] 
    ((if (> b 0) + -) a b))

; user =>  (a-plus-abs-b 1 -1)
; 2

;; The procedure will always return 'b' as an absolute number
