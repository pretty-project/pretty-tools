
(ns pretty-presets.side-effects
    (:require [preset-props.api :as preset-props]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn reg-preset!
  ; @description
  ; Registers a preset map or function.
  ;
  ; @param (keyword) id
  ; @param (function or map) preset
  ;
  ; @usage
  ; (reg-preset! :my-preset {:fill-color :muted :hover-color :muted})
  ; [button :my-button {:presets [:my-preset]}]
  ;
  ; @usage
  ; (reg-preset! :my-preset (fn [id props] (assoc props :fill-color :muted :hover-color :muted)))
  ; [button :my-button {:presets [:my-preset]}]
  [id props]
  (preset-props/reg-preset! id props))
