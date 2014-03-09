(ns hack-ideas.models.data-source
  (:require [clojure.java.jdbc :as sql])
  (:require [hack-ideas.database :as db])
  )

(defn one "retrieves a single data source" [data-source-id]
  (first (into [] (sql/query db/spec ["SELECT * FROM data_sources WHERE id = ?" data-source-id])))
  )

(defn all "retrieves all data sources" []
  (into [] (sql/query db/spec ["SELECT * FROM data_sources ORDER BY created_at DESC"]))
  )
