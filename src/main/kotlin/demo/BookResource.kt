package demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class BookResource {
    @GetMapping(value= ["/books"])
    fun books(): List<Books> = listOf(
        Books(23.toString(),"book","jane","12:00")
    )
}
data class Books(val id: String?, val name: String, val author:String, val writeAt: String)