(ns hack-ideas.views.hack-ideas.index
  (:require [hack-ideas.routes-helper :refer :all])
  (:require [hiccup.core :refer :all]))

(defn render [hack-ideas]
  (html
    [:p.text-right [:a.btn.btn-primary {:href (new-hack-idea-path)} "Create a new, shiny idea!"]]
    (for [hack-idea hack-ideas] 
      [:div.idea 
       [:h2 [:a {:href (hack-idea-path (:id hack-idea))} (:name hack-idea)]]
       ])
    )
  )
