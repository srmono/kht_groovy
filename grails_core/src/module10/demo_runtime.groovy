package module10

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor
import groovy.util.logging.Log

@ToString(includePackage = false, ignoreNulls = true)
@EqualsAndHashCode
@TupleConstructor
@Log
class enhanceCard {
    String name
    int num_digits

    def getTotalDigits(){
        log.info("getTotalDigits has been invoked")
    }
}

enhanceCard card1 = new enhanceCard()
//enhanceCard card2 = new enhanceCard(name: "visa", num_digits: 16)
//enhanceCard card3 = new enhanceCard(name: "visa", num_digits: 16)
//enhanceCard card4 = new enhanceCard("visa")

card1.getTotalDigits()

//println("toString: ${card1.toString()}")
//
//println("Is card 2 equals card3 ? ${card2 == card3}")
//
//print("toString: ${card3.toString()}")
