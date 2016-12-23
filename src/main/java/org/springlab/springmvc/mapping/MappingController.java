package org.springlab.springmvc.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MappingController {

    @RequestMapping("/mapping/{name}")
    @ResponseBody
    public String name(@PathVariable String name) {
        return name;
    }
}
