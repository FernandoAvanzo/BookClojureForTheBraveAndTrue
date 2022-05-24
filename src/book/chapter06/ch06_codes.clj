(ns book.chapter06.ch06-codes)

(def great-books ["East of Eden" "The Glass Bead Game"])

;you be lost the firts vector declared also called name collision.
(def great-books ["The Power of Bees" "Journey to Upstairs"])

(get (ns-interns *ns*) 'great-books)

;that code works in any namespace
(deref #'book.chapter06.ch06-codes/great-books)

;namespace creation examples and test 'clojure.core/refer
(in-ns 'cheese.taxonomy)

(def cheddars ["mild" "medium" "strong" "sharp" "extra sharp"])
(def bries ["Wisconsin" "Somerset" "Brie de Meaux" "Brie de Melun"])

(in-ns 'cheese.analysis)

(in-ns 'cheese.analysis)
(clojure.core/refer-clojure)

;; Notice the dash after "defn"
(defn- private-function
  "Just an example function that does nothing"
  [])