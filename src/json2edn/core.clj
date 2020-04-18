(ns json2edn.core
  (:require [clojure.data.json :as json]
            [clojure.edn :as edn])
  (:gen-class))

(defn -main [& args]
  (prn (json/read *in* :key-fn keyword)))