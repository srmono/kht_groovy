package module11

import groovy.test.GroovyTestCase

class demo_test extends GroovyTestCase{
    def sum(x, y){
        return x + y
    }

    void testAdd(){
        assert sum(2, 3 ) == 5
    }

}
