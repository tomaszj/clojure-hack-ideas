(ns hack-ideas.handler
  (:require [hack-ideas.controllers.home-controller :as home]
            [hack-ideas.controllers.hack-ideas-controller :as ideas]
            [hack-ideas.controllers.data-sources-controller :as data-sources]
            [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.middleware.params :refer [wrap-params]]
            [ring.middleware.nested-params :refer [wrap-nested-params]]
            [ring.middleware.cookies :refer [wrap-cookies]]))

(defroutes app-routes
  (GET "/" [] (home/get-root-page-handler))
  (context "/hack-ideas" [] (defroutes ideas-routes 
    (GET "/" [] (ideas/get-hack-ideas-handler))                       
    (GET "/new" [] (ideas/get-new-hack-idea-handler))
    (POST "/" {params :params} (ideas/create-hack-idea-handler params))
    (context ["/:id", :id #"\d+"] [id] (defroutes idea-routes
      (GET "/" [] (ideas/get-hack-idea-handler (Integer/parseInt id)))                          
      (PUT "/" {params :params} (ideas/update-hack-idea-handler (Integer/parseInt id) params))
      (GET "/edit" [] (ideas/get-edit-hack-idea-handler (Integer/parseInt id)))))))
  (context "/data-sources" [] (defroutes data-sources-routes
    (GET "/" [] (data-sources/get-data-sources-handler))))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> app-routes
      wrap-nested-params
      wrap-params
      wrap-cookies))

