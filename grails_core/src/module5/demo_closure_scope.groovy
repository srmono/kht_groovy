package module5

class demo_closure_scope {
    static void main(String[] args) {
        def processedCard = "Visa"

        def process = {String cardType ->
            // the owner and delegate of the parent closure is enclosed class
            println this
            println owner
            println delegate
            def sub_process ={
                println "$it found"
                println this
                println owner
                println delegate
            }
            switch (cardType) {
                case ("Visa"):
                    sub_process("Visa")
                    break;
                case ("Amex"):
                    sub_process("Amex")
                    break;
                default:
                    sub_process("Unrecognized card type")
            }
        }
        process(processedCard)

        def testDelegate = {
            deleteCharAt(10)
        }

        StringBuffer build = new StringBuffer("This is a test String");

        //println testDelegate()

        testDelegate.delegate = build
        //testDelegate.resolveStrategy = Closure.DELEGATE_FIRST
        testDelegate.resolveStrategy = Closure.OWNER_FIRST

        println testDelegate()
    }

    static  String deleteCharAt(int i){
        return  "This is a custom deleteCharAt method"
    }
}
