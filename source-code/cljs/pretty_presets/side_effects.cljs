
(ns pretty-presets.side-effects
    (:require [component-props.api :as component-props]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn reg-preset!
  ; @links
  ; [cljs-component-props](https://mt-app-kit.github.io/cljs-component-props)
  ;
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
  (component-props/reg-preset! id props))
