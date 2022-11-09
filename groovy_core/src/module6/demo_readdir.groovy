package module6

import groovy.io.FileType

class demo_readdir {
    static void main(String[] args) {
        println "Please enter the directory to read the log files from"
        File dir = new File(System.in.newReader().readLine())
        //File dir = new File("C:\groovy\logs") applog_012022.log
        println("Your entered $dir")

//        dir.eachFile(FileType.FILES){
//            println(it)
//        }

        try{
            dir.eachFile{
                if (it.name.endsWith("log")){
                    println("Processing file ${it.name}")
                }
            }

            dir.eachFileMatch(FileType.FILES, ~/.*.log/){
                println("Processing file ${it.name}")
            }
        }catch(Exception e){
            println("Exception occured ${e.getMessage()}")
        }
    }
}

