package com.egor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;



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

//    @RequestMapping("showDetails")
//    public String showEmployeeDetails() {
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(HttpServletRequest request, Model model) {
        String empName = request.getParameter("employeeName");
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";
    }
}
