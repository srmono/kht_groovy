package module9

import groovy.json.JsonSlurper
import groovy.xml.XmlSlurper

class demo_readpayload {
    static void main(String[] args) {
        File xml = new File("output.xml")
        XmlSlurper slurper = new XmlSlurper()

        def cards = slurper.parse(xml)

        println("First card name ${cards.card.name[0]}")
        println("Amex card number of digits  ${cards.card.digits[4]}")

        //Read Json file

        File json = new File("output.json")
        JsonSlurper jsonSlurper = new JsonSlurper()
        def jcards = jsonSlurper.parse(json)
        println(jcards)
        println("First JSON card name ${jcards.cards.card[0].name}")

    }
}
