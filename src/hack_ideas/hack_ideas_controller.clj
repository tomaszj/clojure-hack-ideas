(ns hack-ideas.hack-ideas-controller
  (:use hiccup.core)
  (:use hiccup.page)
  (:use hack-ideas.routes-helper)
  (:use hack-ideas.application-layout)
  )

(defn get-hack-ideas-handler [request]
  (render-page "ALL HACK IDEAS HERE!")
  )
