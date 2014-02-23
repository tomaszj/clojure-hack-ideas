(ns hack-ideas.handler
  (:require [hack-ideas.controllers.home-controller :as home])
  (:require [hack-ideas.controllers.hack-ideas-controller :as hack-ideas])
  (:use hack-ideas.application-layout)
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] home/get-root-page-handler)
  (context "/hack-ideas" [] (defroutes ideas-routes 
    (GET "/" [] hack-ideas/get-hack-ideas-handler)                       
    ))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
