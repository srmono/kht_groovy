package module5

class demo_closures_methods_collections {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master"]

        String date = new Date().format('MMdd')

        iterateCards(cards, {println("$it read at $date")})

        def match = cards.find({it.length() > 4})
        println("Matched cards: $match")

        def matches = cards.findAll({it.length() > 4})
        matches.each {println("$it Matched cards  ")}

        def cardsMap = [visa:16, amex:15, discover:16]
        cardsMap.collect {
            println it.key.toUpperCase()
            println(it.value * 2)
        }

        cardsMap.eachWithIndex{ Map.Entry<String, Integer> card, int i ->
            println("$i ${card.key.toUpperCase()} ${card.value * 2}")
        }

    }

    def static iterateCards (cards, chunk ){
        for (int i = 0; i < cards.size(); i++){
            chunk(cards[i])
        }
    }
}
