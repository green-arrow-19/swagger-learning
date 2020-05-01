package io.greenarrow19.swagger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nakulgoyal
 *         01/05/20
 **/

@RestController
@RequestMapping("/app")
public class AppController {
    
    @GetMapping("/getAll")
    public String getApps(){
        return "Listed All Apps";
    }
    
    @PostMapping("/add/{appName}")
    public String add(@PathVariable String appName){
        return appName+" app added successfully";
    }
}

