(ns hack-ideas.controllers.home-controller
  (:use hack-ideas.views.application-layout)
  (:require [hack-ideas.views.home.root :as view])
  )

(defn get-root-page-handler []
  (render-page (view/render))
  )
