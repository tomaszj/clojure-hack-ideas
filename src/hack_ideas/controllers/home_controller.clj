(ns hack-ideas.controllers.home-controller
  (:use hack-ideas.application-layout)
  (:require [hack-ideas.views.home.root :as view])
  )

(defn get-root-page-handler [request]

  (render-page (view/render))
  )