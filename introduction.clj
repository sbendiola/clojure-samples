(defn blank? [s] 
      (every? #(Character/isWhiteSpace %) s))

(defstruct person :first-name :last-name)

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


;defn define a function
(defn greeting
  "This is an optional documentation string"
   [username];this is the arg list
   (str "hello, " username))

;view the documentation for the function
(doc greeting)


;this function has 2 param lists one with and one without a value
(defn greeting2
  ([] (greeting2 "Mister"))
  ([name] (str "Hello, " name)))
   

;this is a var arg
(defn greet-group [& members]
  (println (apply str (conj (interpose ", " members) "Hello - "))))

(def words (list "t" "quick" "brown" "f"))

(defn indexable-word? [word]
  (> (count word)))

;these all do the same
(filter indexable-word? words)

(filter #(> (count %) 2) words)

(filter (fn [w] (> (count w) 2)) words)

(let [match? (fn [w] (> (count w) 2))]
     (filter match? words))

;higher order function
(defn make-greeter [prefix]
  (fn [username] (str prefix ", " username)))


((make-greeter "Hi") "world")