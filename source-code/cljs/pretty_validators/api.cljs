
(ns pretty-validators.api
    (:require [pretty-validators.side-effects :as side-effects]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (side-effects/*)
(def reg-validator!  side-effects/reg-validator!)
(def validate-input! side-effects/validate-input!)
(def validate-form!  side-effects/validate-form!)
 
