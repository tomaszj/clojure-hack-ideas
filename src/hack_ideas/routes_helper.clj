(ns hack-ideas.routes-helper)

(defn hack-ideas-path [] "/hack-ideas")
(defn new-hack-idea-path [] "/hack-ideas/new")

(defn hack-idea-path [id] (format "/hack-ideas/%s" id))

