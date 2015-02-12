import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
import org.springframework.boot._;
import org.springframework.boot.autoconfigure._;
import org.springframework.web.bind.annotation._;
@RestController
@EnableAutoConfiguration
@ComponentScan
class HelloController {

  @RequestMapping(value=Array("/"), method=Array(RequestMethod.GET))
   def newresponse() = "hello-world...hello-scala!!"
}

object Controller {

    def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloController]);
        }
}
 
