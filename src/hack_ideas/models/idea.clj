(ns hack-ideas.models.idea
  (require [clojure.java.jdbc :as sql])
  (require [hack-ideas.database :as db])
  )

(defn all "retrieves all ideas" []
  (into [] (sql/query db/spec ["SELECT * FROM ideas ORDER BY created_at DESC"]))
  )

