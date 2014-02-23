(ns hack-ideas.views.home.root
  (:use hiccup.core))

(defn render []
  (html
    [:h2 "Welcome to Hack Ideas!"]
    )
  )
