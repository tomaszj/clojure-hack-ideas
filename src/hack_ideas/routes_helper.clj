(ns hack-ideas.routes-helper)

(defn hack-ideas-path [] "/hack-ideas")
(defn new-hack-idea-path [] "/hack-ideas/new")
(defn edit-hack-idea-path [id] (format "/hack-ideas/%s/edit" id))

(defn hack-idea-path [id] (format "/hack-ideas/%s" id))
(defn create-hack-idea-path [id] (format "/hack-ideas/%s" id))

(defn data-sources-path [] "/data-sources")
(defn data-source-path [id] (format "/data-sources/%s" id))
