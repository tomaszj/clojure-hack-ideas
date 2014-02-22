(ns hack-ideas.handler
  (:use hack-ideas.hack-ideas-controller)
  (:use compojure.core)
  (:use hiccup.core)
  (:use hiccup.page)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn root-handler "Main handler for the page" [request]
  (render-page "")
  )

(defroutes app-routes
  (GET "/" [] root-handler)
  (context "/hack-ideas" [] (defroutes ideas-routes 
    (GET "/" [] get-hack-ideas-handler)                       
    ))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
