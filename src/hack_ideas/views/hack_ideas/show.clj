(ns hack-ideas.views.hack-ideas.show
  (:use hack-ideas.routes-helper)
  (:use hiccup.core))

(defn render [hack-idea]
  (html
     [:div.idea 
      [:h2 (:name hack-idea)]
      [:p [:em "Idea created on " (:created_at_pretty hack-idea)]]
      [:p (:description hack-idea)]
      [:p [:a {:href (hack-ideas-path)} "Back"]]
      ]
    )
  )
