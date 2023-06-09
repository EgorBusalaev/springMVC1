package com.egor.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller // контроллер тоже компонент, поэтому аанотацию @Component можно не писать
@RequestMapping("/employee") // этот меэппинг называется контроллер мэппинг. /employee добавится перед всеми методам
public class MyController {
    @RequestMapping("/") // при указании этого адреса("/") будет выводиться наш view
    public String showFirstView() {
        return "first-View";
    }

    @RequestMapping("/askDetails") // реквест метод над методом называется метод мэппинг
    public String ascEmployeeDetails() {
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model) {
        empName = "Mr. " + empName;
        model.addAttribute("nameAttribute", empName);

        return "show-emp-details-view";
    }
}
