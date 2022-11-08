package com.kht

class StudentController {

// By default, Grails injects beans by names. It means that we can easily inject the StudentService singleton instance into our controller by declaring an instance variable called studentsService.

    // By convention the index() action from this controller will be mapped to the 
    // URI /student/index ,  the show() action to /student/show and so on 

    def studentService

// By convention, Grails will render a view based on controller name and action. 
// For example, the index() action from StudentController will resolve to /grails-app/views/student/index.gsp
    def index() { // index.gsp
        respond studentService.list()
    }

    def show(Long id){
        respond studentService.get(id)
    }

    def create(){
        respond new Student(params)
    }

    def save(Student student){
        studentService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(Long id){
        studentService.delete(id)
        redirect action:"index", method:"GET"
    }
}
