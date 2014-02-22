(ns hack-ideas.application-layout
  (:use hiccup.core)
  (:use hiccup.page)
  (:use hack-ideas.routes-helper))

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

