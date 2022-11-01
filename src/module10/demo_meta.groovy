package module10

class demo_meta {
    static void main(String[] args) {
        def mop = new demo_mop();
        println("A non existing property ${mop.cardName} ")
    }
}
