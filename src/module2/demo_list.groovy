package module2

class demo_list {
    static void main(String[] args) {
        //Array
        def intArray = new int[2]
        intArray[0] = 1
        intArray[1] = 2
       // intArray[2] = 3

        // List
        def mylist = [10,12,13,14,15]
        println("This size of list is ${mylist.size()}")

        mylist.add(60)
        println("This size of list is ${mylist.size()}")
        mylist.remove(0)
        println("This size of list is ${mylist.size()}")

        println("This list values are $mylist")

    }
}
