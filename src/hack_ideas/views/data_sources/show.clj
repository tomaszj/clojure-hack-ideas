(ns hack-ideas.views.data-sources.show
  (:require [hack-ideas.routes-helper :refer :all])
  (:require [hiccup.core :refer :all]))

(defn render [data-source]
  (html
     [:div.idea 
      [:h2 (:name data-source)]
      [:p [:em "Data source created on " (:created_at_pretty data-source)]]
      [:p (:description data-source)]
      [:p 
;       [:a {:href (edit-hack-idea-path (:id hack-idea))} "Edit"]
;       " | "
       [:a {:href (data-sources-path)} "Back"]]
      ]
    )
  )
