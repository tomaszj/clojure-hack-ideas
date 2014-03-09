(ns hack-ideas.controllers.data-sources-controller
  (:require [hack-ideas.views.application-layout :refer [render-page]]
            [hack-ideas.helpers.application-helper :as helper]
            [hack-ideas.models.data-source :as data-sources]
            [hack-ideas.views.data-sources.index :as index]
            [hack-ideas.views.data-sources.show :as show]))

(defn get-data-sources-handler [] 
  (render-page (index/render (data-sources/all))))

(defn get-data-source-handler [data-source-id] 
  (render-page (show/render (helper/created-at-pretty-maker (data-sources/one data-source-id)))))
