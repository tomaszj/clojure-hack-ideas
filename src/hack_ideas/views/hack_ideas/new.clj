(ns hack-ideas.views.hack-ideas.new
  (:require [hack-ideas.routes-helper :refer :all])
  (:require [hiccup.core :refer :all]))

(defn render []
  (html
    [:h2 "Create a new idea!"]
    [:div.new-idea.col-lg-4
     [:form {:action (hack-ideas-path) :method "POST"}
      [:div.form-group 
       [:label {:for "hack-idea[name]"} "New idea name"]
       [:input.form-control {:type "text" :id "hack-idea[name]" :name "hack-idea[name]"}]
       ] 
      [:div.form-group
       [:label {:for "hack-idea[description]"} "And its description"]
       [:textarea.form-control {:rows "3" :id "hack-idea[description]" :name "hack-idea[description]"}]
       ] 
      [:div.form-group
       [:input.form-control.btn.btn-primary {:type "submit" :value "Create it!"}]
       ] 
      ]
     ]
    )
  )
