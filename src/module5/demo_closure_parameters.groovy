package module5

class demo_closure_parameters {
    static void main(String[] args) {
        // Closure is a Closure class instance
        // it implements call logic, passed as argument, assigned to a variable
        Closure cardDetails = { firstName, lastName = "B" ->
            println("This card is owned by $firstName and $lastName")
        }

//        cardDetails.call("Venkat", "B")
        cardDetails("Venkat", "D")

        Closure cardDetails_varArgs = { String... arg = "B" ->
             arg.join(" - ")
        }

        println cardDetails_varArgs("BVS", "Rao")
        println cardDetails_varArgs("Venkat", "S", "Rao")

        def cardLength = [12, 13, 14, 15, 16]

        cardLength.each {
            if ( it % 2 == 0){
                println("Even number digits ${it*2}")
                // A return statement in a closure return form the current iteratio
                return
                println("After return statment")
            } else {
                println("Odd number of digits $it")
                return
            }
        }

    }
}
