(ns let-gone-wild-refactoring.postage.cost
  (:require
    [let-gone-wild-refactoring.postage.weight-factor :as weight-factor]))

(defn compute [postage]
  (* (weight-factor/compute postage) (:weight postage)))
