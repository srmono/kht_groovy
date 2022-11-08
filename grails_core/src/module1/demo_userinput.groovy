package module1

class demo_userinput {
    static void main(String[] args) {
        def lang = args[0]
        println("Argument is " + lang)
        println("Please enter your name:");
        println("Your Name is " + System.in.newReader().readLine())
    }
}
