package module10

class demo_mop {
    def implementDynamism = { name ->
        "we are exploring groovy Dynamic behaviour by processing property $name"
    }

    def propertyMissing(String name){
        name
        implementDynamism(name)
    }

    def methodMissing(String method, Object args){
        println "Called $method with $args"
    }
}
