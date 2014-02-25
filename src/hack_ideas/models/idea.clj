(ns hack-ideas.models.idea
  (:require [clojure.java.jdbc :as sql])
  (:require [hack-ideas.database :as db])
  )

(defn one "retrieves a single idea" [idea-id]
  (first (into [] (sql/query db/spec ["SELECT * FROM ideas WHERE id = ?" idea-id])))
  )

(defn all "retrieves all ideas" []
  (into [] (sql/query db/spec ["SELECT * FROM ideas ORDER BY created_at DESC"]))
  )

