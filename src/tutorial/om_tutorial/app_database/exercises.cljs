(ns om-tutorial.app-database.exercises)

(def cars-table
  {:cars/by-id
   {1 {:make "Nissan"}
    2 {:make "Dodge"}
    3 {:make "Ford"}}})

(def favorites
  {:cars/by-id
   {1 {:make "Nissan"}
    2 {:make "Dodge"}
    3 {:make "Ford"}}
   :favorite-car [:cars/by-id 1]})

(def ex3-uidb
  {:main-panel {:toolbar {:tools [[:tools/by-id 1] [:tools/by-id 2]]}
                :canvas {:data [[:data/by-id 1]]}}
   :tools/by-id {1 {:label "Cut"}
                 2 {:label "Copy"}}
   :data/by-id {1 {:x 1 :y 3}}})
