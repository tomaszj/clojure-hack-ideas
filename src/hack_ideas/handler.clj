(ns hack-ideas.handler
  (:use compojure.core)
  (:use hiccup.core)
  (:use hiccup.page)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn render-page "Renders a basic HTML template" []
  (html5 
    [:head
      [:title "Hack Ideas"]
      (include-css "//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css")]
    [:body
       "Hello world!"
     ]
    )
  )

(defn root-handler "Main handler for the page" [request]
  (render-page)
  )

(defroutes app-routes
  (GET "/" [] root-handler)
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
