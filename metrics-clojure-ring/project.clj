(defproject metrics-clojure-ring "2.0.3-SNAPSHOT"
  :description "Various things gluing together metrics-clojure and ring."
  :dependencies [[cheshire "5.3.1"]
                 [metrics-clojure "2.0.2"]]
  :profiles {:dev {:dependencies [[ring "1.2.2"]]}})
