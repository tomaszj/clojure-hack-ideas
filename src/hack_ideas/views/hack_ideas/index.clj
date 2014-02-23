(ns hack-ideas.views.hack-ideas.index
  (:use hack-ideas.routes-helper)
  (:use hiccup.core))

(defn render [hack-ideas]
  (html
     (for [hack-idea hack-ideas] 
       [:div.idea 
        [:h2 [:a {:href (hack-idea-path (:id hack-idea))} (:name hack-idea)]]
        ])
    )
  )
