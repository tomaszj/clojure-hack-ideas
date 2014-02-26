(ns hack-ideas.handler
  (:require [hack-ideas.controllers.home-controller :as home]
            [hack-ideas.controllers.hack-ideas-controller :as ideas]
            [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.nested-params :refer [wrap-nested-params]]))

(defroutes app-routes
  (GET "/" [] (home/get-root-page-handler))
  (context "/hack-ideas" [] (defroutes ideas-routes 
    (GET "/" [] (ideas/get-hack-ideas-handler))                       
    (GET "/new" [] (ideas/get-new-hack-idea-handler))
    (POST "/" {params :params} (ideas/create-hack-idea-handler params))
    (context ["/:id", :id #"\d+"] [id] (defroutes idea-routes
      (GET "/" [] (ideas/get-hack-idea-handler (Integer/parseInt id)))                          
      ))
    ))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      wrap-nested-params
      wrap-params))

