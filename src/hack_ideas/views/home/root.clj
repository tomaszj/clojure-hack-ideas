(ns hack-ideas.views.home.root
  (:require [hiccup.core :refer :all]))

(defn render []
  (html
    [:h2 "Welcome to Hack Ideas!"]
    )
  )
