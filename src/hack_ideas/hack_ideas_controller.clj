(ns hack-ideas.hack-ideas-controller
  (:use hack-ideas.routes-helper)
  (:use hack-ideas.application-layout)
  (:require [hack-ideas.helpers.application-helper :as helper])
  (:require [hack-ideas.views.hack-ideas.index :as views])
  (:require [hack-ideas.models.idea :as idea])
  )

(defn get-hack-ideas-handler [request]

  (defn created-at-pretty-maker [result]
    (assoc result :created_at_pretty (helper/pretty-date (:created_at result)))
    )

  (def view-model (map created-at-pretty-maker (idea/all)))

  (render-page (views/render view-model))
    )
