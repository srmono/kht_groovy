package module3

class demo_if_else {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Dicover", "Master", "Diners"]
        def size = cards.size()

        if(size == 4 ){
            println("We got all the requied cards")
        } else if (size == 5){
            println("We got 5 cards")
        } else {
            println("We got more than required number of cards")
        }
    }
}
