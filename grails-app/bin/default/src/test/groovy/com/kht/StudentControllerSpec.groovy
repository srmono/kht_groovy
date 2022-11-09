package com.kht

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class StudentControllerSpec extends Specification implements ControllerUnitTest<StudentController> {

    def setup() {
    }

    def cleanup() {
    }

    void "Test the index action returns the correct model" (){
        given:
        controller.studentService = Mock(StudentService) {
            list() >> [new Student(firstName: "venkat", lastName: "bvs")]
        }

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        model.studentList.size() == 1
        model.studentList[0].firstName = "venkat"
        model.studentList[0].lastName = "bvs"

    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
