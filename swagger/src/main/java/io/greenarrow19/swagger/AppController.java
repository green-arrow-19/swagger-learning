package io.greenarrow19.swagger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author nakulgoyal
 *         01/05/20
 **/

@RestController
@RequestMapping("/app")
public class AppController {
    
    @ApiOperation(value = "Get All Apps",notes = "Get all apps saved in db",response = String.class)
    @GetMapping("/getAll")
    public String getApps(){
        return "Listed All Apps";
    }
    
    @ApiOperation(value = "Add new App",notes = "Add new app in db",response = String.class)
    @PostMapping("/add/{appName}")
    public String addApp(@PathVariable String appName){
        return appName+" app added successfully";
    }
    
    @ApiOperation(value = "Delete an App with appName",notes = "Delete an app i.e. saved in db",response = String.class)
    @DeleteMapping("/delete/{appName}")
    public String deleteApp(@ApiParam(value = "App Name that needed to be deleted.", required = true) @PathVariable String appName) {
        return appName + " app deleted successfully";
    }
}


