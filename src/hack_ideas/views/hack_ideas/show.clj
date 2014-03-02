(ns hack-ideas.views.hack-ideas.show
  (:require [hack-ideas.routes-helper :refer :all])
  (:require [hiccup.core :refer :all]))

(defn render [hack-idea]
  (html
     [:div.idea 
      [:h2 (:name hack-idea)]
      [:p [:em "Idea created on " (:created_at_pretty hack-idea)]]
      [:p (:description hack-idea)]
      [:p 
       [:a {:href (edit-hack-idea-path (:id hack-idea))} "Edit"]
       " | "
       [:a {:href (hack-ideas-path)} "Back"]]
      ]
    )
  )
