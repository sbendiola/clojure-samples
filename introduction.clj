(defn blank? [s] 
      (every? #(Character/isWhiteSpace %) s))

(defstruct person :first-name :last-name)
