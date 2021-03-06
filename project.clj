(defproject hack-ideas "0.1.0-SNAPSHOT"
  :description "Hack ideas - simple app for sharing hack ideas with needed tools and data"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/java.jdbc "0.3.3"]
                 [postgresql "9.1-901.jdbc4"]
                 [clj-time "0.6.0"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.5"]]
  :plugins [[lein-ring "0.8.10"]
            [lein2-eclipse "2.0.0"]]
  :ring {:handler hack-ideas.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
