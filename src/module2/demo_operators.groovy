package module2

class demo_operators {
    static void main(String[] args) {
        println "Addition " + (5 + 5)
        println "Multiplication " + 5 * 5
        println "Division " + 5 / 5
//        Groovy performs division and multiplication first followed by addition and substraction
        println 5 + 5/(5 * 5)
        boolean var1 = 1
        boolean var2 = 0

        println var1 && var2
        println var1 || var2
        println !var1

        println (var1 == var2)
        println (var1 != var2)

        int var3 = 2
        int var4 = 2

        println "This it's is a double quoted string with a variable ref $var3"

        println 'This it\'s is a single quoted string with a variable ref $var3'

        println """ This is a double 
                    quoted string with a 
                    variable ref $var3 """

        String cardName = "visa"

        println "The first two character of the cardName is ${cardName.substring(0,2)}"
    }
}
