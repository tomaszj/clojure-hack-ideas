(ns hack-ideas.controllers.hack-ideas-controller
  (:require [hack-ideas.views.application-layout :refer [render-page]]
            [hack-ideas.helpers.application-helper :as helper]
            [hack-ideas.views.hack-ideas.index :as view]
            [hack-ideas.views.hack-ideas.show :as show-view]
            [hack-ideas.views.hack-ideas.new :as new-view]
            [hack-ideas.models.idea :as idea]
            [clojure.walk :refer [keywordize-keys]]
  ))

(defn created-at-pretty-maker [result]
  (assoc result :created_at_pretty (helper/pretty-date (:created_at result)))
  )

(defn get-hack-idea-handler [idea-id]
  (def view-model (created-at-pretty-maker (idea/one idea-id)))
  (render-page (show-view/render view-model)) 
  )

(defn get-hack-ideas-handler []
  (def view-model (map created-at-pretty-maker (idea/all)))
  (render-page (view/render view-model))
  )

(defn get-new-hack-idea-handler []
  (render-page (new-view/render))
  )

(defn create-hack-idea-handler [params]
  (def pristined-params (select-keys (:hack-idea (keywordize-keys params)) [:name :description]))
  (def created-idea (idea/create pristined-params))
  (def view-model (created-at-pretty-maker created-idea))
  (render-page (show-view/render view-model))
  )

