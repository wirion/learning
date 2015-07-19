(ns user)

(def great-books ["East of Eden" "The Glass Bead Game"])

((ns-interns *ns*) 'great-books)
((ns-map *ns*) 'great-books)
@#'great-books

(def great-books ["The Power of Bees" "Journey to Upstairs"])

;; Why a symbol and not a string?
(create-ns 'cheese.taxonomy)
(in-ns 'cheese.taxonomy)

(clojure.core/ns-name 'cheese.taxonomy)
;; cheese.taxonomy

(in-ns 'cheese.analysis) ;; notice we don't need to create-ns the namespace first
(in-ns 'cheese.taxonomy)
(def cheddars ["mild" "medium" "strong" "sharp" "very sharp"])
(def bries ["Wisconsin" "Somerset" "Brie de Meaux" "Brie de Melun"])
(in-ns 'cheese.analysis)
cheese.taxonomy/cheddars

(ns learning.librarian)

(ns-map *ns*)

(ns-name *ns*)
