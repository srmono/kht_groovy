package module3

class demo_continue_break {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master", "Diners"]

        for (card in cards){
            if(card.equals("Discover")){
                //continue
                break
            }
            println("Card found: $card")
        }
    }
}
