(defn blank? [s] 
      (every? #(Character/isWhiteSpace %) s))

(defstruct person :first-name :last-name)

(defrecord
  person [String :first-name String :last-name]
  :allow-nulls false)

(defn hello-world [username]
  (println (format "Hello, %s" username)))


;this is a comment

;define a map
(def book {:one 1 :two 2})

;access the keyed value
(book :one)
(:one book)

;with default
(book :three 3)


;commas are whitespace
(def book {:one 1, :two 2})

;prevent eval
'(1 2)

;longer version
(quote (1 2))

;get the class
(class (quote (1 2)))

;anonymous function
(def x #(.toUpperCase %))
(x "abc");"ABC"

