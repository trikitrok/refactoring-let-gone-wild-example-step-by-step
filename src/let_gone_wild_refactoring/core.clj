(ns let-gone-wild-refactoring.core)

(defn postage-cost [dimensions weight shipping-days]
  (let [[height width] dimensions
        big? (and (> height 10) (> width 10))
        express? (> 2 shipping-days)
        multiple (cond
                   (and express? big?) 5
                   express? 3
                   big? 2
                   :else 1)]
    (* multiple weight)))