(ns hack-ideas.views.hack-ideas.index
  (:use hiccup.core))

(defn render [hack-ideas]
  (html
     (for [hack-idea hack-ideas] 
       [:div.idea 
        [:p (:name hack-idea) " " (:created_at hack-idea)]
        [:p (:description hack-idea)]
        ])
    )
  )
