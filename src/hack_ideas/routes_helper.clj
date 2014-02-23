(ns hack-ideas.routes-helper)

(defn hack-ideas-path [] "/hack-ideas"
  )

(defn hack-idea-path [id] (format "/hack-ideas/%s" id))

