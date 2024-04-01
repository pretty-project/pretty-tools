
(ns pretty-validators.side-effects
    (:require [form-validator.api :as form-validator]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn reg-validator!
  ; @links
  ; [cljc-form-validator](https://mt-app-kit.github.io/cljc-form-validator)
  ;
  ; @description
  ; ...
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:error (*)
  ;  :test-f (function)
  ;  :when-changed? (boolean)(opt)
  ;  :when-left? (boolean)(opt)
  ;  :when-visited? (boolean)(opt)}
  ;
  ; @usage
  ; (reg-validator! :my-validator {:error "Please fill out this field!" :test-f #(-> % empty? not)})
  [id props]
  (form-validator/reg-validator! id props))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn validate-input!
  ; @links
  ; [cljc-form-validator](https://mt-app-kit.github.io/cljc-form-validator)
  ;
  ; @description
  ; ...
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:on-invalid-f (function)(opt)
  ;  :on-valid-f (function)(opt)}
  ;
  ; @usage
  ; (validate-input! :my-input {:on-valid-f (fn [_] ...)})
  [id props]
  (form-validator/validate-input! id props))

(defn validate-form!
  ; @links
  ; [cljc-form-validator](https://mt-app-kit.github.io/cljc-form-validator)
  ;
  ; @description
  ; ...
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:on-invalid-f (function)(opt)
  ;  :on-valid-f (function)(opt)}
  ;
  ; @usage
  ; (validate-form! :my-form {:on-valid-f (fn [_] ...)})
  [id props]
  (form-validator/validate-form! id props))
