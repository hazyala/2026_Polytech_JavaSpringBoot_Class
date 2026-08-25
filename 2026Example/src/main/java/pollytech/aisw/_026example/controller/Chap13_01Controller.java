package pollytech.aisw._026example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(exam13_01)
public class Chap13_01Controller {
    @GetMapping
    public String showform(){
        return "viewPage13_form";
    }

    // @RequestBody 는 폼의 input 태크의 name과 사용자가 입력된 값을 사용해서 키와 값으로 구성된 json형식의 Rest문자열로 만듬
    @PostMapping
    public String submit(@RequestBody String param, Model model){

    }
}
