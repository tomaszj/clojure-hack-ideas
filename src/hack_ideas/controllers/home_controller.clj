(ns hack-ideas.controllers.home-controller
  (:require [hack-ideas.views.application-layout :refer [render-page]])
  (:require [hack-ideas.views.home.root :as view])
  )

(defn get-root-page-handler []
  (render-page (view/render))
  )
