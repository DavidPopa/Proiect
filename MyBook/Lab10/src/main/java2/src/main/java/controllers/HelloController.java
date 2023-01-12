package controllers;

import components.ClientComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
@RequestMapping(value = "/hello")
public class HelloController {


    @GetMapping
    public String getTestData() {

        return " Hello from ClientComponent = " + clientComponent +
                " \n Hello from ClientComponent 2 = " + clientComponent2 +
                " \n Hello from ClientComponent 3 = " + clientComponent3;

    }

    @Autowired
    ClientComponent clientComponent;
    @Autowired
    ClientComponent clientComponent2;
    @Autowired
    ClientComponent clientComponent3;
}
///
///               RASPUNS : -> INDIFERENT CATE COMPONENTE DE ACEEASI CLASA NON-ABSTRACTA INSTANTIEZ ELE VOR INJECTA ACEEASI ADRESA DE MEMORIE
///
///