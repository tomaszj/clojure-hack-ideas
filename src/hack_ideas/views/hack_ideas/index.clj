(ns hack-ideas.views.hack-ideas.index
  (:require [hack-ideas.routes-helper :refer :all])
  (:require [hiccup.core :refer :all]))

(defn render [hack-ideas]
  (html
     (for [hack-idea hack-ideas] 
       [:div.idea 
        [:h2 [:a {:href (hack-idea-path (:id hack-idea))} (:name hack-idea)]]
        ])
    )
  )
