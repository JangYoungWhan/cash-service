(ns cash-service.db-configure)

(def db-spec {:classname "org.h2.Driver"
              :subprotocol "h2:file"
              :subname "./db/data"
              :user "test"
              :password ""})