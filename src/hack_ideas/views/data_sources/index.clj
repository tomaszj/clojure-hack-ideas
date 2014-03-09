(ns hack-ideas.views.data-sources.index
  (:require [hack-ideas.routes-helper :refer :all])
  (:require [hiccup.core :refer :all]))

(defn render [data-sources]
  (html
    [:p.text-right [:a.btn.btn-primary {:href "#"} "Add your data source for others!"]]
    (for [data-source data-sources] 
      [:div.idea 
       [:h2 [:a {:href (data-source-path (:id data-source))} (:name data-source)]]])))
