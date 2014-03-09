(ns hack-ideas.helpers.application-helper
  (:require [clj-time.format :refer [formatter unparse]])
  (:require [clj-time.coerce :refer [from-sql-time]])
  )

(def pretty-formatter (formatter "dd-MM-yyyy"))

(defn pretty-date "Displays date in human-readable format from java.sql.Timestamp" [sql-timestamp]
  (unparse pretty-formatter (from-sql-time sql-timestamp)))

(defn created-at-pretty-maker [result]
  (assoc result :created_at_pretty (pretty-date (:created_at result))))
