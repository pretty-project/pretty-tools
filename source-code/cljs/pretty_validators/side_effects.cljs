
(ns pretty-validators.side-effects
    (:require [form-validator.api :as form-validator]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn reg-validator!
  ; @description
  ; ...
  ;
  ; @param (keyword) id
  ; @param (map) props
  ; {:error (*)
  ;  :test-f (function)}
  ;
  ; @usage
  ; (reg-validator! :my-validator {:error "Please fill out this field!" :test-f #(-> % empty? not)})
  [id props]
  (form-validator/reg-validator! id props))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn validate-input!
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
  ; When an input gets validated, the autovalidation must be turned on.
  ; Otherwise, the input can stuck in an invalid state even if it's value has changed and not invalid anymore.
  (form-validator/autovalidate-input! id)
  (form-validator/validate-input!     id props))

(defn validate-form!
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
  (form-validator/autovalidate-form! id)
  (form-validator/validate-form!     id props))
