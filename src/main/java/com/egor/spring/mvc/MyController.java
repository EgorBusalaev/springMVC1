package com.egor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // контроллер тоже компонент, поэтому аанотацию @Component можно не писать
public class MyController {
    @RequestMapping("/") // при указании этого адреса("/") будет выводиться наш view
    public String showFirstView() {
        return "first-View";
    }

    @RequestMapping("/askDetails")
    public String ascEmployeeDetails() {
        return "ask-emp-details-view";
    }
@RequestMapping("showDetails")
    public String showEmployeeDetails() {
        return "show-emp-details-view";
    }

}
