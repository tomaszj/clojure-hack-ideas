(ns hack-ideas.hack-ideas-controller
  (:use hack-ideas.routes-helper)
  (:use hack-ideas.application-layout)
  (:require [hack-ideas.views.hack-ideas.index :as views])
  (:require [hack-ideas.models.idea :as idea])
  )

(defn get-hack-ideas-handler [request]
  (render-page (views/render (idea/all)))
  )
