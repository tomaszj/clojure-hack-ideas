(ns hack-ideas.views.hack-ideas.edit
  (:require [hack-ideas.routes-helper :refer :all]
            [hiccup.core :refer :all]
            [hiccup.form :refer :all]))

(defn render [hack-idea]
  (html
    [:h2 "Update your idea!"]
    [:div.edit-idea.col-lg-4
     (form-to [:put (create-hack-idea-path (:id hack-idea))] 
      (with-group "hack-idea"
        [:div.form-group 
         (label "name" "Idea name")
         (text-field {:value (:name hack-idea) :class "form-control"} "name")
         ] 
        [:div.form-group
         (label "description" "And its description")
         (text-area {:class "form-control" :rows "3"} "description" (:description hack-idea))
         ] 
        [:div.form-group
         (submit-button {:class "form-control btn btn-primary"} "Update it!")
         ] 
        )
      ) 
     ]
    )
  )
