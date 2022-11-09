package module2

class demo_map {
    static void main(String[] args) {
        def cardMap = [ visa:16, amex:15, disover:16 ]
        println("Visa card contains ${cardMap["visa"]} digits")

        println(cardMap.get("visa"))

        cardMap["diners"] = 16;
//        cardMap.put("sc",16)

        println("Cardmap size ${cardMap.size()}")

        println(cardMap.containsKey("visa"))
    }
}
