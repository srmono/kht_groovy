package online.contacts.book

import com.kht.ocb.AppInitializationService

class BootStrap {

    def init = { servletContext ->
        AppInitializationService.initialize()
    }

    def destroy = {
    }
}
