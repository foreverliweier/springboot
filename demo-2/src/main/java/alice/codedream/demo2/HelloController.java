package alice.codedream.demo2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 欢迎页面
 *
 * @author alice
 * @time 2021-11-16 17:40
 **/

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @PostMapping("/sayHi")
    public String sayHello(){
        return "Hello moto!";
    }
}
