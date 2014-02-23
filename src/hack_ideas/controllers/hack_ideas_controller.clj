(ns hack-ideas.controllers.hack-ideas-controller
  (:use hack-ideas.views.application-layout)
  (:require [hack-ideas.helpers.application-helper :as helper])
  (:require [hack-ideas.views.hack-ideas.index :as view])
  (:require [hack-ideas.views.hack-ideas.show :as show-view])
  (:require [hack-ideas.models.idea :as idea])
  )

(defn created-at-pretty-maker [result]
  (assoc result :created_at_pretty (helper/pretty-date (:created_at result)))
  )

(defn get-hack-idea-handler [idea-id]
  (def view-model (created-at-pretty-maker (idea/find idea-id)))
  (render-page (show-view/render view-model)) 
  )

(defn get-hack-ideas-handler []
  (def view-model (map created-at-pretty-maker (idea/all)))

  (render-page (view/render view-model))
  )
