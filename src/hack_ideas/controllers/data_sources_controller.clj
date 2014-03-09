(ns hack-ideas.controllers.data-sources-controller
  (:require [hack-ideas.views.application-layout :refer [render-page]]
            [hack-ideas.helpers.application-helper :as helper]))

(defn get-data-sources-handler [] 
  (render-page "WAT"))

