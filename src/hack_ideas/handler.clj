(ns hack-ideas.handler
  (:use compojure.core)
  (:use hiccup.core)
  (:use hiccup.page)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defn hack-ideas-path [] "/hack-ideas"
  )

(defn render-navbar "Renders a navigation bar" []
  [:nav.navbar.navbar-inverse {:role "navigation"}
   [:div.navbar-header [:a.navbar-brand {:href "#"} "Hack Ideas!"]]
   [:ul.nav.navbar-nav 
      [:li [:a {:href (hack-ideas-path)} "Explore ideas"]]
    ] 
   ]
  )

(defn render-page "Renders a basic HTML template" [content]
  (html5 {:lang "en"}
    [:head
      [:title "Hack Ideas"]
      [:meta {:charset "utf-8"}]
      (include-css "/css/bootstrap.min.css")
      (include-css "/css/bootstrap-theme.min.css")
      (include-css "/css/main.css")
      ]
    [:body
      [:div.container
        (render-navbar)
        [:div.jumbotron 
         [:h1 "Hack Ideas!"]
         [:h4 "The best place to create and look for brilliant hack ideas."]
         ]
        [:div.main_content content]
       ]
      (include-js "/js/jquery/dist/jquery.min.js")
      (include-js "/js/bootstrap/dist/js/bootstrap.min.js")
     ]
    )
  )

(defn root-handler "Main handler for the page" [request]
  (render-page "")
  )

(defn get-hack-ideas-handler [request]
  (render-page "ALL HACK IDEAS HERE!")
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
