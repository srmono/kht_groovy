package module3

class demo_while {
    static void main(String[] args) {
        def cards = ["Visa", "Amex", "Discover", "Master"]
        def cnt = 0;

        while (cnt < 4){
            println("In While loop ${cards[cnt]}")
            cnt++
        }

        cnt = 0;
        do{
            println("In do While loop ${cards[cnt]}")
            cnt++
        } while (cnt < 0)
    }
}
