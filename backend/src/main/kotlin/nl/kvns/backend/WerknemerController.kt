package nl.kvns.backend

import Werknemer
import com.google.gson.Gson
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class WerknemerController {
    val werknemer = Werknemer(1, "John Doe", 21, listOf("john.doe@gmail.com", "john.doe@softwarecompanyltd.com"), "Software Company Ltd")
    @GetMapping("/werknemer")
    fun getWerknemer(): String {
        return Gson().toJson(werknemer)
    }
}