package module3

class demo_builtin_method {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master", "Diners"]

        cards.each {println("In each method $it")}

        cards.size().times {
            if (it == 0) println("In times method ${cards[it]}")
        }

        cards.eachWithIndex{ String entry, int i -> println("$entry element appears at position $i")}

    }
}
