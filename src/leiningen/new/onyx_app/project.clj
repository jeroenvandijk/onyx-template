(defproject {{app-name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[aero "0.1.5" :exclusions [prismatic/schema]]
                 [cheshire "5.5.0"]
                 [mysql/mysql-connector-java "5.1.18"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.3"]
                 [org.onyxplatform/onyx "{{onyx-version}}{{onyx-version-post}}"]
                 [org.onyxplatform/onyx-kafka "{{onyx-version}}.{{onyx-kafka-minor}}{{onyx-version-post}}"]
                 [org.onyxplatform/onyx-seq "{{onyx-version}}.{{onyx-seq-minor}}{{onyx-version-post}}"]
                 [org.onyxplatform/onyx-sql "{{onyx-version}}.{{onyx-sql-minor}}{{onyx-version-post}}"]
                 {{#metrics?}}[org.onyxplatform/onyx-metrics "{{onyx-version}}.{{onyx-metrics-minor}}{{onyx-version-post}}"]{{/metrics?}}]

  :profiles {:uberjar {:aot [{{app-name}}.launcher.aeron-media-driver
                             {{app-name}}.launcher.launch-prod-peers]
                       :uberjar-name "{{app-name}}-standalone.jar"}
             :dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [lein-project-version "0.1.0"]]
                   :source-paths ["src"]}})
