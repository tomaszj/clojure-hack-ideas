(ns hack-ideas.helpers.application-helper
  (:use clj-time.core)
  (:use clj-time.format)
  (:use clj-time.coerce)
  )

(def pretty-formatter (formatter "dd-MM-yyyy"))

(defn pretty-date "Displays date in human-readable format from java.sql.Timestamp" [sql-timestamp]
  (unparse pretty-formatter (from-sql-time sql-timestamp))
  )
