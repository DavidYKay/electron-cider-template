(ns hello-electron.core
  (:require [reagent.core :as reagent]
            [cljsjs.react]))

(defn main-page
  []
  [:div "Hello it is incredibly so"])

(defn mount-root
  []
  (reagent/render [main-page] (.getElementById js/document "app")))

(defn init!
  []
  (mount-root))
