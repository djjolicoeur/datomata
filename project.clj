(defproject datomata "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[aero "1.1.2"]
                 [aysylu/loom "1.0.0"]
                 [com.stuartsierra/component "0.2.3"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]]
  :pedantic? :abort
  :profiles
  {:dev {:source-paths ["dev"]
         :aliases {"lint"
                   ["do"
                    ["cljfmt" "check"]
                    ["eastwood"]]}
         :cljfmt {:indents {;; test.check
                            for-all [[:inner 0]]}}
                  :eastwood {:exclude-linters [:deprecations]}
         :plugins [[jonase/eastwood "0.2.3"]
                   [lein-cljfmt "0.5.0" :exclusions [org.clojure/clojure]]
                   [lein-environ "1.0.0"]
                   [lein-kibit "0.1.2" :exclusions [org.clojure/clojure]]
                   [test2junit "1.2.2" :exclusions [org.clojure/clojure]]]}
   :provided {:dependencies [[ch.qos.logback/logback-classic "1.1.2"
                              :exclusions [org.slf4j/slf4j-api]]
                             [org.slf4j/jul-to-slf4j "1.7.7"]
                             [org.slf4j/jcl-over-slf4j "1.7.7"]
                             [org.slf4j/log4j-over-slf4j "1.7.7"]
                             [com.datomic/datomic-free "0.9.5344"
                              :exclusions [joda-time org.slf4j/slf4j-nop]]
                             [reloaded.repl "0.2.4"
                              :exclusions [org.clojure/tools.namespace
                                           suspendable]]]}})
