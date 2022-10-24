package module3

class demo_switch {
    static void main(String[] args) {
        def card = System.in.newReader().readLine()

        switch (card.trim().toLowerCase()) {
            case("visa"):
                println("Visa card Found")
                break
            case("master"):
                println("Master card Found")
                break
            case("amex"):
                println("Amex card Found")
                break
            case("discover"):
                println("Discover card Found")
                break
            default:
                println("Unrecognized card")
        }
    }
}
