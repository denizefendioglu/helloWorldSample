package hello;

import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
    		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        return String.format("Hello World! It is now %s", formatter.format(new Date()));
    }
}