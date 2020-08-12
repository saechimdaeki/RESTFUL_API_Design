package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /*컨트롤러에서 리턴 값으로 문자를 반환하면
    뷰 리졸버( viewResolver )가 화면을 찾아서 처리한다*/
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("data","spring!!!!!!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name",required = false) String name,Model model)
    {
        model.addAttribute("name",name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //html의 바디태그를 말하는게아닌 http의 body부에 이데이터를 직접넣어주겠다 의미
    public String helloString(@RequestParam("name") String name){
        return "hello"+name; //"hello {name}" 템플릿엔진과 차이는 뷰가없당
    }

    @GetMapping("hello-api")
    @ResponseBody //이 애노테이션이 붙으면 viewResolver대신에 HttpMessageConverter가 동작
    //기본문자처리는 StringHttpMessageConverter 기본객체처리는 MappingJackson2HttpMessageConverter
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
