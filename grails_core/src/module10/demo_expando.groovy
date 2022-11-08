package module10
import module8.card

class demo_expando {
    static void main(String[] args) {
        String.metaClass.'static'.toUp = {String str1 ->
            str1.toUpperCase()
        }

        println("Uppercase of visa is ${String.toUp('visa')}")

        card.metaClass.secure = { ->
            "Your are is secured"
        }

        def newCard = new card()
        println(newCard.secure())
    }
}
