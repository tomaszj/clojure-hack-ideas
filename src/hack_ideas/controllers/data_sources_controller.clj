(ns hack-ideas.controllers.data-sources-controller
  (:require [hack-ideas.views.application-layout :refer [render-page]]
            [hack-ideas.helpers.application-helper :as helper]
            [hack-ideas.models.data-source :as data-sources]
            [hack-ideas.views.data-sources.index :as index]))

(defn get-data-sources-handler [] 
  (render-page (index/render (data-sources/all))))

