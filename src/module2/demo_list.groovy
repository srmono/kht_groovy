package module2

class demo_list {
    static void main(String[] args) {
        //Array
        def intArray = new int[2]
        intArray[0] = 1
        intArray[1] = 2
       // intArray[2] = 3

        // List
        def mylist = [10,12,13,14,15, ["String1", "String2"]]
//        println("This size of list is ${mylist.size()}")
//
//        mylist.add(60)
//        println("This size of list is ${mylist.size()}")
//        mylist.remove(0)
//        println("This size of list is ${mylist.size()}")

          println("This list values are $mylist")
          println("The string element is ${mylist[5]}")
          println("The first element in string list ${mylist[5][0]}")

    }
}
