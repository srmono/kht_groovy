package module5

class demo_closures {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master"]

        for (int i =0; i < cards.size(); i++){
            println("Lenght of ${cards[i]} is " + cards[i].length())
        }

        for (int i =0; i < cards.size(); i++){
            println("${cards[i]} in uppercase is ${cards[i].toUpperCase()}")
        }

        for (int i =0; i < cards.size(); i++){
            println("${cards[i]} in lowercase is ${cards[i].toLowerCase()}")
        }

        iterateCards(cards, {println("Length of $it is ${it.length()}")})
        iterateCards(cards, {println("Lowercase of $it is ${it.toLowerCase()}")})
        iterateCards(cards, {println("Uppercase of $it is ${it.toUpperCase()}")})
    }

    def static iterateCards (cards, chunk ){
        for (int i = 0; i < cards.size(); i++){
            chunk(cards[i])
        }
    }
}
