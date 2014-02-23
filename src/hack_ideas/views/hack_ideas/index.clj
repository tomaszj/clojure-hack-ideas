(ns hack-ideas.views.hack-ideas.index
  (:use hiccup.core))

(defn render [hack-ideas]
  (html
     (for [hack-idea hack-ideas] 
       [:div.idea 
        [:h2 (:name hack-idea)]
        [:p [:em "Idea created on " (:created_at_pretty hack-idea)]]
        [:p (:description hack-idea)]
        ])
    )
  )
