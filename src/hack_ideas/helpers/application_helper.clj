(ns hack-ideas.helpers.application-helper
  (:require [clj-time.core :as t])
  (:require [clj-time.format :as f])
  (:use clj-time.coerce)
  )

(def pretty-formatter (f/formatter "dd-MM-yyyy"))

(defn pretty-date "Displays date in human-readable format from java.sql.Timestamp" [sql-timestamp]
  (f/unparse pretty-formatter (from-sql-time sql-timestamp))
  )
