package module3

class demo_for {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master", "Diners"]
        //cards[0]
        //for in loop
        for (card in cards) {
            println("Card found: $card")
        }

        def numbers = 1..5

        for (number in numbers){
            println(number)
        }
        // for loop
        for (int i = 0; i < 3; i++ ) {
            println(" Processed card  ${cards[i]} ")
        }
    }
}
