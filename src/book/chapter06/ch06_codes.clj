(ns book.chapter06.ch06-codes)

(def great-books ["East of Eden" "The Glass Bead Game"])

;you be lost the firts vector declared also called name collision.
(def great-books ["The Power of Bees" "Journey to Upstairs"])

(get (ns-interns *ns*) 'great-books)

;that code works in any namespace
(deref #'book.chapter06.ch06-codes/great-books)