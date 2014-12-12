(defproject modern-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  ;; clj and cljs source code path
  :source-paths ["src/clj" "src/cljs"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2411"]]

  ;; lein cljs build plugin to build a cljs project
  :plugins [[lein-cljsbuild "1.0.3"]
            [lein-ring "0.8.13"]
            [compojure "1.3.1"]]

  ;;cljsbuild options
  :cljsbuild {:builds
              [{;;cljs source code path
                :source-paths ["src/cljs"]

                ;;Google closure (cls) options configuration
                :compiler {;;cls generated js script filename
                           :output-to "resources/public/js/modern.js"

                           ;; minimal js optimization directive
                           :optimizations :whitespace

                           ;;generated js code prettification
                           :pretty-print true}}]}
  :ring {:handler modern-cljs.core/handler})
