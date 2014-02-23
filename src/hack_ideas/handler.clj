(ns hack-ideas.handler
  (:require [hack-ideas.controllers.home-controller :as home])
  (:require [hack-ideas.controllers.hack-ideas-controller :as ideas])
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] (home/get-root-page-handler))
  (context "/hack-ideas" [] (defroutes ideas-routes 
    (GET "/" [] (ideas/get-hack-ideas-handler))                       
    (context ["/:id", :id #"\d+"] [id] (defroutes idea-routes
      (GET "/" [] (ideas/get-hack-idea-handler (Integer/parseInt id)))                          
      ))
    ))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
