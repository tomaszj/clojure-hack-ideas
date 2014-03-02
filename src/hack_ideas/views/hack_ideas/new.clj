(ns hack-ideas.views.hack-ideas.new
  (:require [hack-ideas.routes-helper :refer :all]
            [hiccup.core :refer :all]
            [hiccup.form :refer :all]))

(defn render []
  (html
    [:h2 "Create a new idea!"]
    [:div.new-idea.col-lg-4
     (form-to [:post (hack-ideas-path)] 
      (with-group "hack-idea"
        [:div.form-group 
         (label "name" "New idea name")
         (text-field {:class "form-control"} "name")
         ] 
        [:div.form-group
         (label "description" "And its description")
         (text-area {:class "form-control" :rows "3"} "description")
         ] 
        [:div.form-group
         (submit-button {:class "form-control btn btn-primary"} "Create it!")
         ] 
        )
      ) 
     ]
    )
  )
